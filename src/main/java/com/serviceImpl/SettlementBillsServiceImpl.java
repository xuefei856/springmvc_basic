package com.serviceImpl;

import com.dao.SettlementBillsDao;
import com.entity.SettlementBills;
import com.service.SettlementBillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gt on 2016/6/17.
 */
@Service
public class SettlementBillsServiceImpl implements SettlementBillsService {

    @Autowired
    SettlementBillsDao settlementBillsDao;


    public List<SettlementBills> selectByPage() {
        return settlementBillsDao.selectByPage();
    }
}
