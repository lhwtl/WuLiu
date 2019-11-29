package com.hlp.mapper;

import com.hlp.model.BasSubstitute;
import org.apache.ibatis.annotations.*;
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

    //删除
    @Delete("delete from Bas_Substitute where id =#{id}")
    public int deleteBasSubstitutets(short id);

    //添加
    @Insert("insert into Bas_Substitute values(bas_substitute_id.nextval,#{empno},#{empname},#{mobileno},#{type},#{pda},#{standardkg},#{standardlength},#{models},#{plateint},#{invalidatemark},#{subordinateunit})")
    public int insertBasSubstitutets(BasSubstitute basSubstitute);
    //修改
    @Update("update Bas_Substitute set empno=#{empno},empname=#{empname},mobileno=#{mobileno},type=#{type},pda=#{pda},standardkg=#{standardkg},standardlength=#{standardlength},models=#{models},plateint=#{plateint},invalidatemark=#{invalidatemark},subordinateunit=#{subordinateunit} where id=#{id}")
    public int updateBasSubstitutets(BasSubstitute basSubstitute);

}