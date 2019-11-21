package com.hlp.mapper;

import com.hlp.model.AccWorkorder;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccWorkorderMapper {

    //查询所有业务通知单同时查询工单，员工以及单位||查台转单
    @Select("select * from acc_workorder where businessnoticeno=#{businessnoticeno}")
    public AccWorkorder selectAccWorkorderBybusinessnoticeno(String businessnoticeno);

}
