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
    public List<SyUnits> FillAllSyUnitsLx(String name, int pag, int size) {
        return sum.FillAllSyUnitsLx(name,pag,size);
    }

    @Override
    public int MaxSyUnitsLx(String name) {
        return sum.MaxSyUnitsLx(name);
    }

    @Override
    public int insertSyUnitsLx(SyUnits syUnits) {
        return sum.insertSyUnitsLx(syUnits);
    }

    @Override
    public int updateSyUnitsLx(SyUnits syUnits) {
        return sum.updateSyUnitsLx(syUnits);
    }

    @Override
    public int deleteSyUnitsLx(int id) {
        return sum.deleteSyUnitsLx(id);
    }
    @Override
    public SyUnits selectSyUnitsByProcessingUnit(short id) {
        return sum.selectSyUnitsByProcessingUnit(id);
    }

    @Override
    public List<SyUnits> selectSyUnitsHlp() {
        return sum.selectSyUnitsHlp();
    }

    @Override
    public SyUnits FillSyUnitsByidLx(int id) {
        return sum.FillSyUnitsByidLx(id);
    }

}
