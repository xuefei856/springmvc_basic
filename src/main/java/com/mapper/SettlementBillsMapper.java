package com.mapper;

import com.entity.SettlementBills;

import java.util.List;

public interface SettlementBillsMapper {

    List<SettlementBills> selectByPage();
}