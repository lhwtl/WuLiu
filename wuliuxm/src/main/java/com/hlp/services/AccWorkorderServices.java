package com.hlp.services;

import com.hlp.model.AccWorkorder;

import java.util.List;

public interface AccWorkorderServices {
    //查询所有业务通知单同时查询工单，员工以及单位||查台转单
    public AccWorkorder selectAccWorkorderBybusinessnoticeno(String businessnoticeno);

    //查询所有的分拣编码
    public List<AccWorkorder> selectAllAccWorkorderHlp();


    //查询工单表
    public List<AccWorkorder> selectAccWorkorderts();

    //结果集查分拣编码
    public List<AccWorkorder> selectAccWorkorderJgjByts();

}
