package com.hlp.mapper;

import com.hlp.model.SorStorage;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SorStorageMapper {
    /*入库*/
/*管理员工查询全部*/
    @Select("select * from Sor_Storage")
    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "acceptperson",column = "acceptperson"),
            @Result(property = "deliveryperson",column = "deliveryperson"),
            @Result(property = "syEmp",column = "acceptperson",one=@One(select="com.hlp.mapper.SyEmpMapper.FillSyEmpByidLx")),
            @Result(property = "syEmp",column = "deliveryperson",one=@One(select="com.hlp.mapper.SyEmpMapper.FillSyEmpByidLx"))
   })
    public List<SorStorage> FillAllSorStorageLx();

    @Insert("insert into Sor_Storage values(sor_storage_id.nextval,#{acceptdate},#{acceptperson},#{acceptcompany},#{deliveryperson},#{deliverycompany})")
    public int insertSorStorageLx(SorStorage sorStorage);
    @Delete("delete from Sor_Storage where id=#{id}")
    public int deleteSorStorageLx(int id);
    @Update("update Sor_Storage set acceptdate=#{acceptdate},acceptperson=#{acceptperson},acceptcompany=#{acceptcompany},deliveryperson=#{deliveryperson},deliverycompany=#{deliverycompany} where id=#{id}")
    public int updateSorStorageLx(SorStorage sorStorage);


}
