package com.techarha.java.manin.dao;

import com.techarha.java.manin.domain.FlipkartOrderEntity;
import com.techarha.java.manin.domain.FlipkartTransEntity;

import java.util.List;

/**
 * Created by ankit on 19/11/15.
 */
public interface FlipkartOrdersDao extends GenericDao<FlipkartOrderEntity, Integer> {
    List<FlipkartOrderEntity> getAllOrdersDetails();
}
