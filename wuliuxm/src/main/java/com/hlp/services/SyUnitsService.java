package com.hlp.services;

import com.hlp.model.SyUnits;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SyUnitsService {
    public List<SyUnits> FillAllSyUnitsLx(String name,int pag,int size);
    public int MaxSyUnitsLx(String name);
    /*新增*/
    public int insertSyUnitsLx(SyUnits syUnits);
    /*修改*/
    public int updateSyUnitsLx(SyUnits syUnits);
    /*删除*/
    public int deleteSyUnitsLx(int id);
}
