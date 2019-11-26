package com.hlp.mapper;

import com.hlp.model.SyEmp;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SyEmpMapper {

    /*根据id查询*/
    @Select("select * from sy_emp where id=#{id}")
    public SyEmp selectSyEmpIdts(Short id);


    /*编号查询信息*/

    @Select("select * from sy_emp where id=#{id}")
    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "empunit",column = "empunit"),
            @Result(property = "syUnits",column = "empunit",one=@One(select="com.hlp.mapper.SyUnitsMapper.selectSyUnitsIdts"))
    })
    public SyEmp FillSyEmpByidLx(int id);


    /*登录lx*/
    @Select("select * from sy_emp where empno=#{empno} and pwd=#{pwd}")
    /*@Results({
            @Result(property = "id",column = "id",id = true),
            @Result(property = "empunit",column = "empunit"),
            @Result(property = "syUnits",column = "empunit",one=@One(select = "com.hlp.SyUnitsMapper.selectSyUnitsByProcessingUnit"))
    })*/
    public SyEmp LoginSyEmp(SyEmp syEmp);
    /*查询全部lx*/
    @Select("select * from Sy_Emp")
    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "empunit",column = "empunit"),
            @Result(property = "syUnits",column = "empunit",one=@One(select="com.hlp.mapper.SyUnitsMapper.selectSyUnitsIdts"))
    })
    public List<SyEmp> FillAllSyEmpLx();

    /*多条件分页查询lx*/
    @Select("select b.* from (select t.*,rownum rn from sy_emp t where empname like '%'||#{empname}||'%' and disabled=#{disabled})b where  b.rn> (#{pag}-1)*#{size} and b.rn <=#{pag}*#{size}")
    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "roleid",column = "roleid"),
            @Result(property = "syRole",column = "roleid",one=@One(select="com.hlp.mapper.SyRoleMapper.OneSyRoleByid"))
    })
    public List<SyEmp> FillAllSyEmpLikePagLx(String empname,int disabled,int pag,int size);
    /*多条件最大值*/
    @Select("select count(*) from sy_emp where empname like '%'||#{empname}||'%' and disabled=#{disabled}")
    public  int MaxSyEmpLx(String empname,int disabled);
    /*z主页显示*/
    @Select("select b.* from (select t.*,rownum rn from sy_emp t )b where  b.rn> (#{pag}-1)*#{size} and b.rn <=#{pag}*#{size}")
    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "roleid",column = "roleid"),
            @Result(property = "syRole",column = "roleid",one=@One(select="com.hlp.mapper.SyRoleMapper.OneSyRoleByid"))
    })
    public List<SyEmp> FillAllSyEmpZhuLx(int pag,int size);

    /*新增*/
    @Insert("insert into sy_emp values(sy_emp_id.nextval,#{empname},#{empno},#{pwd},#{querypwd},#{roleid},#{empunit},#{remark},#{disabled} )")
    public int insertSyEmpLx(SyEmp syEmp);
    /*修改*/
    @Update("update sy_emp set empname=#{empname},empno=#{empno},pwd=#{pwd},querypwd=#{querypwd},roleid=#{roleid},empunit=#{empunit},remark=#{remark},disabled=#{disabled} where id=#{id}")
    public int updateSyEmpLx(SyEmp syEmp);
    /*删除*/
    @Delete("delete from SyEmp where id=#{id}")
    public int deleteSyEmpLx(int id);


    //查询所有业务通知单同时查询工单，员工以及单位||查台转单
    @Select("select * from sy_emp where id=#{id}")
    public SyEmp selectSysEmpByPickerInfo(short id);

    //根据工号查询
    @Select("select * from sy_emp where empno=#{empno}")
    public SyEmp FillAllSyEmpEmpToLx(String empno);

    @Select("select * from sy_emp where empname=#{empname}")
  /*  @Results({
            @Result(property = "id",column = "id",id = true),
            @Result(property = "empunit",column = "empunit"),
            @Result(property = "syUnits",column = "empunit",one=@One(select = "com.hlp.SyUnitsMapper.selectSyUnitsByProcessingUnit"))
    })*/
    public SyEmp SelectSyEmpByempnameHlp(String empname);


}