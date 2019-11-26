package com.hlp.mapper;

import com.hlp.model.BasZoneinfo;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BasZoneinfoMapper {
    @Select("select * from BAS_ZoneInfo")
    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "zonepeople",column = "zonepeople"),
            @Result(property = "subordinateunit",column = "subordinateunit"),
            @Result(property = "syEmp", column = "zonepeople", one = @One(select = "com.hlp.mapper.SyEmpMapper.selectSyEmpIdts")),
            @Result(property = "syUnits", column = "subordinateunit", one = @One(select = "com.hlp.mapper.SyUnitsMapper.selectSyUnitsIdts"))
    })
    public List<BasZoneinfo> selectBasZoneinfo();

    /*根据定区编码查询定区信息表*/
    @Select("select * from BAS_ZoneInfo where zonecode =#{zonecode}")
    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "subordinateunit",column = "subordinateunit"),
            @Result(property = "id",column = "id"),
            @Result(property = "syUnits", column = "subordinateunit", one = @One(select = "com.hlp.mapper.SyUnitsMapper.selectSyUnitsOperatoridts")),
            @Result(property = "basZonecustominfo", column = "id", one = @One(select = "com.hlp.mapper.BasZonecustominfoMapper.selectBasZonecustominfoZoneinfoidts"))
    })
    public BasZoneinfo selectBasZoneinfoZonecodets(String zonecode);
}
