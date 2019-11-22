package com.hlp.mapper;

import com.hlp.model.BasArea;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BasAreaMapper {
    @Select("select * from BAS_Area")
    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "entryunitid",column = "entryunitid"),
            @Result(property =  "syUnits",column = "entryunitid",one = @One(select ="com.hlp.mapper.SyUnitsMapper.selectSyUnitsOperatoridts"))
    })
    public List<BasArea> selectBasArea();

}
