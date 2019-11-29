package com.hlp.services.Impl;

import com.hlp.mapper.PacStockcMapper;
import com.hlp.model.PacStockc;
import com.hlp.services.PacStockcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacStockcServiceImpl implements PacStockcService {
    @Autowired
    private PacStockcMapper mapper;
    @Override
    public List<PacStockc> selectPacStockc() {

        return mapper.selectPacStockc();
    }

    @Override
    public int insertPacStockc(PacStockc record) {
        return mapper.insertPacStockc(record);
    }

    @Override
    public int updatePacStockc(PacStockc record) {
        return mapper.updatePacStockc(record);
    }
}
