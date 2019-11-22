package com.hlp.services;

import com.hlp.model.SyEmp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SyEmpService {
    public SyEmp LoginSyEmp(SyEmp syEmp);
    public List<SyEmp> FillAllSyEmpLx();
    public List<SyEmp> FillAllSyEmpLikePagLx(String empname,int disabled,int pag,int size);
    public  int MaxSyEmpLx(String empname,int disabled);
    public List<SyEmp> FillAllSyEmpZhuLx(int pag,int size);
    public int insertSyEmpLx(SyEmp syEmp);
    /*修改*/
    public int updateSyEmpLx(SyEmp syEmp);
    /*删除*/
    public int deleteSyEmpLx(int id);
    /*用户id查*/
    public SyEmp FillSyEmpByidLx(int id);

    //查询所有业务通知单同时查询工单，员工以及单位||查台转单
    public SyEmp selectSysEmpByPickerInfo(short id);
/*empno查询*/
    public SyEmp FillAllSyEmpEmpToLx(String empno);
}
