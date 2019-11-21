package com.hlp.services.Impl;

import com.hlp.mapper.SyEmpMapper;
import com.hlp.model.SyEmp;
import com.hlp.services.SyEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SyEmpServiceImpl implements SyEmpService {
    @Autowired
    private SyEmpMapper sm;

    @Override
    public SyEmp LoginSyEmp(SyEmp syEmp) {
        return sm.LoginSyEmp(syEmp);
    }



    @Override
    public SyEmp selectSysEmpByPickerInfo(short id) {
        return sm.selectSysEmpByPickerInfo(id);
    }
}
