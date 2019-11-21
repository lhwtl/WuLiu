package com.hlp.services;

import com.hlp.model.SyEmp;

public interface SyEmpService {
    public SyEmp LoginSyEmp(SyEmp syEmp);
    //查询所有业务通知单同时查询工单，员工以及单位||查台转单
    public SyEmp selectSysEmpByPickerInfo(short id);
}
