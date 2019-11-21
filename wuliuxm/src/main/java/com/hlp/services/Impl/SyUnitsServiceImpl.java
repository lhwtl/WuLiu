package com.hlp.services.Impl;

import com.hlp.mapper.SyUnitsMapper;
import com.hlp.model.SyUnits;
import com.hlp.services.SyUnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SyUnitsServiceImpl implements SyUnitsService {
    @Autowired
    private SyUnitsMapper syUnitsMapper;
    @Override
    public SyUnits selectSyUnitsByProcessingUnit(short id) {
        return syUnitsMapper.selectSyUnitsByProcessingUnit(id);
    }
}
