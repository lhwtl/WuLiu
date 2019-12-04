package com.hlp.mapper;

import com.hlp.model.SorStoragedetails;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SorStoragedetailsMapper {

    /*更新编号查详情*/
    @Select("select * from sor_storagedetails where outboundid=#{id}")
    public List<SorStoragedetails> FillSorStoragedetailsByidLx(String id);
    /*更新编号删详情*/
    @Delete("delete from sor_storagedetails where outboundid=#{id}")
    public int deleteSorStoragedetailsByidLx(String id);
    /*新增详情*/
    @Insert("insert into sor_storagedetails values(#{id},#{packageid},#{weight},#{outboundid},#{state}) ")
    public int insertStoragedetailsByidLx(SorStoragedetails sorStoragedetails);
    /*修改详情*/
    @Update("update sor_storagedetails set packageid=#{packageid},weight=#{weight},outboundid=#{outboundid},state=#{state} where id=#{id}")
    public int updateStoragedetailsByidLx(SorStoragedetails sorStoragedetails);
    @Select("select * from sor_storagedetails where outboundid='CK-'||#{id}")
    public List<SorStoragedetails> FillSorStoragedetailsKCLx(String id);

    /*一对一入库详情和入库*/
    @Select("select * from sor_storagedetails")
/*    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "packageid",column = "packageid"),
            @Result(property = "sorStorage",column = "packageid",one=@One(select="com.hlp.mapper.SorStorageMapper.FillSorStorageKCLX")),
    })*/
    public List<SorStoragedetails> FilSorStoragedetailsKcLX();


}
