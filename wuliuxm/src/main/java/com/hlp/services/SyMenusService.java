package com.hlp.services;

import com.hlp.model.SyMenus;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SyMenusService {
    public List<SyMenus> FillAllSyMenusPage(String colName,int pag,int size);
    public List<SyMenus> FillAllSyMenusByid(int id);
    public List<SyMenus> FillAllSyZJMenusByid(int id,int sid);
    public int MaxSyMenus();
    public List<SyMenus> FillAllOneColumnSyMenus(String f);
    public List<SyMenus> FillAllLikeTextSyMenus(String colName);
    /*下拉分页查询*/
    public  List<SyMenus>  FillSyMenusByidLX(int i,String pid,int pag,int size);
    public List<SyMenus>  FillSyMenusByidLXxxxxx(String id);
    public int  MaxTwoMenusByidLX(int id,String pid);
    /*新增*/
    public int insertSyMenusLX(SyMenus syMenus);
    /*删除*/
    public int deleteSyMenusByidLx(int id);
    /*修改*/
    public int updateSyMenusLx(SyMenus syMenus);
    /*id查*/
    public SyMenus FillSyMenusByIdLx(int id);
    /*max3*/
    public int  MaxMenusLikeNameLX(String name);

    public List<SyMenus> FillAllSyMenusByIdLx(int id);

    public int updateSyMenusTwoLx(String parentid, int id);


}
