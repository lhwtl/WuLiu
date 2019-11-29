package com.hlp.mapper;

import com.hlp.model.SorOutbound;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SorOutboundMapper {
    /*查全部*/
    @Select("select * from  Sor_Outbound")
    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "acceptperson",column = "acceptperson"),
            @Result(property = "deliveryperson",column = "deliveryperson"),
            @Result(property = "enterperson",column = "enterperson"),
            @Result(property = "syEmp",column = "acceptperson",one=@One(select="com.hlp.mapper.SyEmpMapper.FillSyEmpByidLx")),
            @Result(property = "syEmps",column = "deliveryperson",one=@One(select="com.hlp.mapper.SyEmpMapper.FillSyEmpByidLx")),
            @Result(property = "syEmpss",column = "enterperson",one=@One(select="com.hlp.mapper.SyEmpMapper.FillSyEmpByidLx"))
    })
    public List<SorOutbound> FillSorOutboundLx();

/*c查id*/
    @Select("select * from Sor_Outbound where id=#{id}")
    public SorOutbound FillSorOutboundByidLx(int id);

    /*新增*/
    @Insert("insert into Sor_Outbound values(#{id},#{handovertype},#{line},#{direction},#{acceptperson}，#{carriers}，#{deliveryperson},#{deliverydate},#{deliverycompany},#{enterperson},#{enterdate})")
    public int insertSorOutboundLx(SorOutbound sorOutbound);
    /*修改*/
    @Update("update Sor_Outbound set handovertype=#{handovertype},line=#{line},direction=#{direction},acceptperson=#{acceptperson},carriers=#{carriers},deliveryperson=#{deliveryperson},deliverydate=#{deliverydate},deliverycompany=#{deliverycompany},enterperson=#{enterperson},enterdate=#{enterdate} where id=#{id} ")
    public int updateSorOutboundLx(SorOutbound sorOutbound);
    /*删除*/
    @Delete("delete from Sor_Outbound where id=#{id}")
    public int deleteSorOutboundLx(int id);

}
