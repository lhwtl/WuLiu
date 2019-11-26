package com.hlp.services;

import com.hlp.model.SorStoragedetails;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SorStoragedetailsService {


    /*更新编号查详情*/
    public List<SorStoragedetails> FillSorStoragedetailsByidLx(int id);
    /*更新编号删详情*/
    public int deleteSorStoragedetailsByidLx(int id);
    /*新增详情*/
    public int insertStoragedetailsByidLx(SorStoragedetails sorStoragedetails);
    /*修改详情*/
    public int updateStoragedetailsByidLx(SorStoragedetails sorStoragedetails);



}


