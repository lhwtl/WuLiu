package com.hlp.mapper;

import com.hlp.model.BasBasicarchives;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BasBasicarchivesMapper {

    @Select("select * from Bas_Basicarchives")
    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "operatorid",column = "operatorid"),
            @Result(property = "operationunitid",column = "operationunitid"),
            @Result(property = "syEmp", column = "operatorid", one =@One(select = "com.hlp.mapper.SyEmpMapper.selectSyEmpIdts")),
           @Result(property =  "syUnits",column = "operationunitid",one = @One(select ="com.hlp.mapper.SyUnitsMapper.selectSyUnitsIdts"))
    })

    public List<BasBasicarchives>selectBasBasicarchive();

    @Select("select * from Bas_Basicarchives where id=#{id}")
    public BasBasicarchives selectBasBasicarchivesIdts(Short id);

    @Delete("delete from Bas_Basicarchives where id=#{id}")
    public int deleteBasBasicarchivesIdts(Short id);

    //添加
    @Insert("insert into Bas_Basicarchives values(Bas_Basicarchives_id.nextval,#{name},#{grade},#{remarks},#{operatorid},#{operationunitid},#{operationtime})")
    public int insertBasBasicarchivesIdts(BasBasicarchives basBasicarchives);
    //修改
    @Update("update Bas_Basicarchives set name=#{name},grade=#{grade},remarks=#{remarks},operatorid=#{operatorid},operationunitid=#{operationunitid},operationtime=#{operationtime} where id=#{id}")
    public int updateBasBasicarchivesIdts(BasBasicarchives basBasicarchives);
}