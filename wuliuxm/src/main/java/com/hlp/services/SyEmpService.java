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

}
