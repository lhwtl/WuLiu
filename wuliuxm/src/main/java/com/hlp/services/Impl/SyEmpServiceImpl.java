package com.hlp.services.Impl;

import com.hlp.mapper.SyEmpMapper;
import com.hlp.model.SyEmp;
import com.hlp.services.SyEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SyEmpServiceImpl implements SyEmpService {
    @Autowired
    private SyEmpMapper sm;

    @Override
    public SyEmp LoginSyEmp(SyEmp syEmp) {
        return sm.LoginSyEmp(syEmp);
    }

    @Override
    public List<SyEmp> FillAllSyEmpLx() {
        return sm.FillAllSyEmpLx();
    }

    @Override
    public List<SyEmp> FillAllSyEmpLikePagLx(String empname, int disabled, int pag, int size) {
        return sm.FillAllSyEmpLikePagLx(empname,disabled,pag,size);
    }

    @Override
    public int MaxSyEmpLx(String empname, int disabled) {
        return sm.MaxSyEmpLx(empname,disabled);
    }

    @Override
    public List<SyEmp> FillAllSyEmpZhuLx(int pag, int size) {
        return sm.FillAllSyEmpZhuLx(pag,size);
    }

    @Override
    public int insertSyEmpLx(SyEmp syEmp) {
        return sm.insertSyEmpLx(syEmp);
    }

    @Override
    public int updateSyEmpLx(SyEmp syEmp) {
        return sm.updateSyEmpLx(syEmp);
    }

    @Override
    public int deleteSyEmpLx(int id) {
        return sm.deleteSyEmpLx(id);
    }

    @Override
    public SyEmp FillSyEmpByidLx(int id) {
        return sm.FillSyEmpByidLx(id);

    }
    @Override
    public SyEmp selectSysEmpByPickerInfo(short id) {
        return sm.selectSysEmpByPickerInfo(id);
    }
}
