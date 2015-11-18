package com.techarha.java.manin.dao;

import com.techarha.java.manin.domain.FlipkartTransEntity;
import com.techarha.java.manin.domain.UserEntity;

import java.util.List;

/**
 * Created by ankit on 18/11/15.
 */
public interface FlipkartTransDao extends GenericDao<FlipkartTransEntity, Integer> {

    List<FlipkartTransEntity> getAllTrasactionDetails();
}
