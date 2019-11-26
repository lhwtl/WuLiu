package com.hlp.services;

import com.hlp.model.SorStorage;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SorStorageService {
    public List<SorStorage> FillAllSorStorageLx();
    public int insertSorStorageLx(SorStorage sorStorage);
    public int deleteSorStorageLx(int id);
    public int updateSorStorageLx(SorStorage sorStorage);
}
