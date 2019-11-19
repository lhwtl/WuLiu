package com.hlp.services.Impl;

import com.hlp.mapper.SyUnitsMapper;
import com.hlp.model.SyUnits;
import com.hlp.services.SyUnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SyUnitsServiceImpl implements SyUnitsService {
    @Autowired
  private   SyUnitsMapper sum;

    @Override
    public List<SyUnits> FillAllSyUnitsLx() {
        return sum.FillAllSyUnitsLx();
    }
}
