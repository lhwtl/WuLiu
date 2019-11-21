package com.hlp.mapper;

import com.hlp.model.SyUnits;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface SyUnitsMapper {

    int deleteByPrimaryKey(Short id);

    int insert(SyUnits record);

    int insertSelective(SyUnits record);

    @Select("select * from Sy_Units where id=#{id}")
    SyUnits selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SyUnits record);

    int updateByPrimaryKey(SyUnits record);

    //查询所有业务通知单同时查询工单，员工以及单位||查台转单
    @Select("select * from sy_units where id=#{id}")
    public SyUnits selectSyUnitsByProcessingUnit(short id);
}