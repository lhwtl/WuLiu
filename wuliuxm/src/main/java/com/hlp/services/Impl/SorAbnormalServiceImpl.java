package com.hlp.services.Impl;

import com.hlp.mapper.SorAbnormalMapper;
import com.hlp.model.SorAbnormal;
import com.hlp.services.SorAbnormalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SorAbnormalServiceImpl implements SorAbnormalService {
    @Autowired
    private SorAbnormalMapper mapper;
    @Override
    public List<SorAbnormal> selectSorAbnormalLX() {
        return mapper.selectSorAbnormalLX();
    }

    @Override
    public int insertSorAbnormalLX(SorAbnormal sor) {
        return mapper.insertSorAbnormalLX(sor);
    }
}
