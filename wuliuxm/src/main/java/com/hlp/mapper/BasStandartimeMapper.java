package com.hlp.mapper;

import com.hlp.model.BasStandartime;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BasStandartimeMapper {
    /*查询收派时间管理*/
    @Select("select * from bas_standartime")
    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "subordinateunit",column = "subordinateunit"),
            @Result(property = "syUnits", column = "subordinateunit", one = @One(select = "com.hlp.mapper.SyUnitsMapper.selectSyUnitsIdts"))
    })
    public List<BasStandartime> selectBasStandartime();
}
