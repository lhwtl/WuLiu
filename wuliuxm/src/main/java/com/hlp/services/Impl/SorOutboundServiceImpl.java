package com.hlp.services.Impl;

import com.hlp.mapper.SorOutboundMapper;
import com.hlp.model.SorOutbound;
import com.hlp.services.SorOutboundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorOutboundServiceImpl implements SorOutboundService {
    @Autowired
    private SorOutboundMapper som;

    @Override
    public List<SorOutbound> FillSorOutboundLx() {
        return som.FillSorOutboundLx();
    }

    @Override
    public SorOutbound FillSorOutboundByidLx(int id) {
        return som.FillSorOutboundByidLx(id);
    }

    @Override
    public int insertSorOutboundLx(SorOutbound sorOutbound) {
        return som.insertSorOutboundLx(sorOutbound);
    }

    @Override
    public int updateSorOutboundLx(SorOutbound sorOutbound) {
        return som.updateSorOutboundLx(sorOutbound);
    }

    @Override
    public int deleteSorOutboundLx(int id) {
        return som.deleteSorOutboundLx(id);
    }
}
