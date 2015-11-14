package com.techarha.java.manin.dao.impl;

import com.techarha.java.manin.dao.GenericDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * Created by ankit on 09/10/15.
 */
public class GenericDaoHibernateImpl <T, PK extends Serializable>
        implements GenericDao<T, PK> {

    @Autowired
    SessionFactory sessionFactory;

    private Class<T> type;

    public GenericDaoHibernateImpl(Class<T> type) {
        this.type = type;
    }

    public PK create(T o) {
        Session session = sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        Serializable sz = session.save(o);
        tx.commit();
        session.close();

        return (PK) sz;
    }

    public T read(PK id) {
        Session session = sessionFactory.openSession();
        Object obj = session.get(type, id);
        session.close();

        return (T) obj;
    }

    public void update(T o) {
        Session session = sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        session.update(o);
        tx.commit();
        session.close();
    }

    public void delete(T o) {
        Session session = sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        session.delete(o);
        tx.commit();
        session.close();
    }

    // Not showing implementations of getSession() and setSessionFactory()
}
