package com.hlp.mapper;

import com.hlp.model.SorStoragedetails;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SorStoragedetailsMapper {

    /*更新编号查详情*/
    @Select("select * from sor_storagedetails where outboundid=#{id}")
    public List<SorStoragedetails> FillSorStoragedetailsByidLx(int id);
    /*更新编号删详情*/
    @Delete("delete from sor_storagedetails where outboundid=#{id}")
    public int deleteSorStoragedetailsByidLx(int id);
    /*新增详情*/
    @Insert("insert into sor_storagedetails values(sor_storagedetails_id.nextval,#{packageid},#{weight},#{outboundid},#{state}) ")
    public int insertStoragedetailsByidLx(SorStoragedetails sorStoragedetails);
    /*修改详情*/
    @Update("update sor_storagedetails set packageid=#{packageid},weight=#{weight},outboundid=#{outboundid},state=#{state} where id=#{id}")
    public int updateStoragedetailsByidLx(SorStoragedetails sorStoragedetails);

}
