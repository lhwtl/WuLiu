package com.hlp.mapper;

import com.hlp.model.SyUnits;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SyUnitsMapper {
/*查询全部lx 与syemp一对一*/
    @Select("select b.* from (select t.*,rownum rn from sy_units t where name like '%'||#{name}||'%' )b where  b.rn> (#{pag}-1)*#{size} and b.rn <=#{pag}*#{size} ")
    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "syEmp",column = "id",one=@One(select="com.hlp.mapper.SyEmpMapper.FillSyEmpByidLx"))
    })
    public List<SyUnits> FillAllSyUnitsLx(String name,int pag,int size);
    /*条件查询最大值Max*/
    @Select("select count(*) from sy_units where name like '%'||#{name}||'%'")
    public int MaxSyUnitsLx(String name);


    /*新增*/
    @Insert("insert into sy_units values(sy_units_id.nextval,#{name},#{remarks},#{operatorid},#{operationtime})")
    public int insertSyUnitsLx(SyUnits syUnits);
    /*修改*/
    @Update("update sy_units set name=#{name},remarks=#{remarks},operatorid=#{operatorid},operationtime=#{operationtime} where id=#{id}")
    public int updateSyUnitsLx(SyUnits syUnits);
    /*删除*/
    @Delete("delete from sy_units where id=#{id}")
    public int deleteSyUnitsLx(int id);

}