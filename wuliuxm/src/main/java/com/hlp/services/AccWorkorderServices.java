package com.hlp.services;

import com.hlp.model.AccWorkorder;

import java.util.List;

public interface AccWorkorderServices {
    //查询所有业务通知单同时查询工单，员工以及单位||查台转单
    public AccWorkorder selectAccWorkorderBybusinessnoticeno(String businessnoticeno);
}
