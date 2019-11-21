package com.hlp.mapper;

import com.hlp.model.SyEmp;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface SyEmpMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SyEmp record);

    int insertSelective(SyEmp record);
    @Select("select * from sy_emp where id=#{id}")
    SyEmp selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SyEmp record);

    int updateByPrimaryKey(SyEmp record);

    @Select("select * from sy_emp where empno=#{empno} and pwd=#{pwd}")
    public SyEmp LoginSyEmp(SyEmp syEmp);


    //查询所有业务通知单同时查询工单，员工以及单位||查台转单
    @Select("select * from sy_emp where id=#{id}")
    public SyEmp selectSysEmpByPickerInfo(short id);

}