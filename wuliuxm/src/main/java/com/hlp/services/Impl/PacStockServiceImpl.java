package com.hlp.services.Impl;

import com.hlp.mapper.PacStockMapper;
import com.hlp.model.PacPackaging;
import com.hlp.model.PacStock;
import com.hlp.services.PacStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacStockServiceImpl implements PacStockService {
    @Autowired
    private PacStockMapper mapper;
    @Override
    public List<PacStock> selectPacStock() {
        List<PacStock> list=mapper.selectPacStock();
        for (PacStock stock : list) {
            System.out.println(stock);
        }
        return list;
    }

    @Override
    public int deletePacStock(Short id) {
        return mapper.deletePacStock(id);
    }

    @Override
    public int insertPacStock(PacStock record) {
        return mapper.insertPacStock(record);
    }

    @Override
    public PacStock selectPacStockid(Short id) {
        return mapper.selectPacStockid(id);
    }

    @Override
    public int updatePacStock(PacStock record) {
        return mapper.updatePacStock(record);
    }

    @Override
    public List<PacStock> selectPacStockname(PacStock record) {
        return mapper.selectPacPacStockname(record);
    }

    @Override
    public PacStock selectPacStockwarehouseno(String warehouseno) {
        return mapper.selectPacStockwarehouseno(warehouseno);
    }
}
