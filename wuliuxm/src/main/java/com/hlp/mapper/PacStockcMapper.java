package com.hlp.mapper;

import com.hlp.model.PacStockc;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PacStockcMapper {
    @Select("select * from pac_stockc")
    List<PacStockc> selectPacStockc();

    @Insert("insert into pac_stockc  values(pac_stockc_id.nextval,'CK1001',#{outboundtype},#{transport}," +
            "#{subordinateunit},#{issuedunit},#{handlingunit},#{handlingnumber},#{handlingname}," +
            "#{customerid},#{customername},#{recipientnumber},#{recipientname},sysdate," +
            "#{drawerno},#{drawername},sysdate)")
    int insertPacStockc(PacStockc record);

    @Update("update pac_stockc set outboundtype=#{outboundtype},transport=#{transport}," +
            "subordinateunit=#{subordinateunit},handlingunit=#{handlingunit}," +
            "issuedunit=#{issuedunit}, " +
            "handlingnumber=#{handlingnumber},handlingname=#{handlingname}," +
            "customerid=#{customerid},customername=#{customername}," +
            "recipientnumber=#{recipientnumber},recipientname=#{recipientname}," +
            "recipienttime=sysdate,drawerno=#{drawerno}," +
            "drawername=#{drawername},drawertime=sysdate where id=#{id}")
    int updatePacStockc(PacStockc record);


}