package com.hlp.services.Impl;

import com.hlp.mapper.PacStockitemMapper;
import com.hlp.model.PacStockitem;
import com.hlp.services.PacStockitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacStockitemServiceImpl implements PacStockitemService {

    @Autowired
    private PacStockitemMapper mapper;

    @Override
    public List<PacStockitem> selectPacStockitem() {
        List<PacStockitem> list=mapper.selectPacStockitem();
        for (PacStockitem stockitem : list) {
            System.out.println(stockitem);
        }
        return list;
    }

    @Override
    public int insertPacStockitem(PacStockitem pacStockitem) {
        return mapper.insertPacStockitem(pacStockitem);
    }

    @Override
    public int updatePacStockitem(PacStockitem pacStockitem) {
        return mapper.updatePacStockitem(pacStockitem);
    }

    @Override
    public List<PacStockitem> selectPacStockitemkc() {
        return mapper.selectPacStockitemkc();
    }
}
