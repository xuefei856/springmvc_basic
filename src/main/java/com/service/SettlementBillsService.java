package com.service;

import com.entity.SettlementBills;

import java.util.List;

/**
 * Created by gt on 2016/6/17.
 */
public interface SettlementBillsService {
    List<SettlementBills> selectByPage();
}
