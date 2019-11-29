package com.hlp.mapper;

import com.hlp.model.SorOutbounddetails;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SorOutbounddetailsMapper {

    @Insert("insert into Sor_Outbounddetails values(#{id},#{packageid},#{weight},#{volume},#{scandate},#{isscan},#{isnextstorage},#{isdoublestorage})")
    public int insertSorOutbounddetailsLx(SorOutbounddetails sorOutbounddetails);

    @Update("update Sor_Outbounddetails set weight=#{weight},volume=#{volume},scandate=#{scandate},isscan=#{isscan},isnextstorage=#{isnextstorage},isdoublestorage=#{isdoublestorage} where packageid=#{packageid}")
    public int updateSorOutbounddetailsLx(SorOutbounddetails sorOutbounddetails);

    @Select("select * from  Sor_Outbounddetails where packageid=#{packageid}")
    public List<SorOutbounddetails>  FiillSorOutbounddetailsByid(String packageid);

    @Delete("delete from Sor_Outbounddetails where packageid=#{packageid}")
    public int deleteSorOutbounddetailsLx(String packageid);


}
