package com.hlp.mapper;

import com.hlp.model.BasStandartime;
import org.apache.ibatis.annotations.*;
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
    //删除
    @Delete("delete from bas_standartime where id =#{id}")
    public int deleteBasStandartimets(Short id);

    //添加
    @Insert("insert into bas_standartime values(bas_standartime_id.nextval,#{timename},#{subordinateunit},#{workingtime},#{closingtime},#{saturdayworkingtime},#{saturdayclosingtime},#{sundayworkingtime},#{sundayclosingtime})")
    public int insertBasStandartimets(BasStandartime basStandartime);
    //修改
    @Update("update bas_standartime set timename=#{timename},subordinateunit=#{subordinateunit},workingtime=#{workingtime},closingtime=#{closingtime},saturdayworkingtime=#{saturdayworkingtime},saturdayclosingtime=#{saturdayclosingtime},sundayworkingtime=#{sundayworkingtime},sundayclosingtime=#{sundayclosingtime} where id=#{id}")
    public int updateBasStandartimets(BasStandartime basStandartime);
}
