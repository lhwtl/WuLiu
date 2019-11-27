package com.hlp.mapper;

import com.hlp.model.BasArea;
import org.apache.ibatis.annotations.*;
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
    @Delete("delete from BAS_Area where id=#{id}")
    public int deleteBasAreats(Short id);

}
