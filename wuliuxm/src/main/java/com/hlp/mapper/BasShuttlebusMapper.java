package com.hlp.mapper;

import com.hlp.model.BasDeliverystandard;
import com.hlp.model.BasShuttlebus;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BasShuttlebusMapper {

@Select("select * from Bas_Shuttlebus")
@Results({
        @Result(property = "id",column = "id",id=true),
        @Result(property = "operatorid",column = "operatorid"),
        @Result(property = "operationunitid",column = "operationunitid"),
        @Result(property = "syEmp", column = "operatorid", one = @One(select = "com.hlp.mapper.SyEmpMapper.selectSyEmpIdts")),
        @Result(property = "syUnits", column = "operationunitid", one = @One(select = "com.hlp.mapper.SyUnitsMapper.selectSyUnitsIdts"))
})
public List<BasShuttlebus> selectBasShuttlebus();

@Delete("delete from Bas_Shuttlebus where id =#{id}")
        public int deleteBasShuttlebusts(short id);

        }