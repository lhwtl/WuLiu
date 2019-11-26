package com.hlp.mapper;

import com.hlp.model.BasSubstitute;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BasSubstituteMapper {
    /*查询取派设置表*/
    @Select("select * from Bas_Substitute")
    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "type",column = "type"),
            @Result(property = "subordinateunit",column = "subordinateunit"),
            @Result(property =  "basBasicarchives",column = "type",one = @One(select ="com.hlp.mapper.BasBasicarchivesMapper.selectBasBasicarchivesIdts")),
            @Result(property =  "syUnits",column = "subordinateunit",one = @One(select ="com.hlp.mapper.SyUnitsMapper.selectSyUnitsOperatoridts"))
    })
    public List<BasSubstitute> selectBasSubstitute();

}