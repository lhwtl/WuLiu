package com.hlp.services;

import com.hlp.model.SyUnits;

public interface SyUnitsService {
    //查询所有业务通知单同时查询工单，员工以及单位||查台转单
    public SyUnits selectSyUnitsByProcessingUnit(short id);
}
