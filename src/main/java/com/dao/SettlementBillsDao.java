package com.dao;

import com.entity.SettlementBills;
import com.mapper.SettlementBillsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SettlementBillsDao {
    @Autowired
    private SettlementBillsMapper settlementBillsMapper;


    public List<SettlementBills> selectByPage() {
        return settlementBillsMapper.selectByPage();
    }

}