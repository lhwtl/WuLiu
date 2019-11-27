package com.hlp.mapper;

import com.hlp.model.BiglogLogisticscontroltable;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BiglogLogisticscontroltableMapper {

    @Select("select * from biglog_logisticscontroltable")
    List<BiglogLogisticscontroltable> selectBiglogLogisticscontroltable();

    @Insert("insert into biglog_logisticscontroltable values(BiglogLogisticscontroltable_id.nextval,#{worksheetno},#{ctype}" +
            ",#{corporation},#{waybillid},#{remarks},1,sysdate,1)")
    int insertBiglogLogisticscontroltable(BiglogLogisticscontroltable b);
    @Update("update biglog_logisticscontroltable set worksheetno=#{worksheetno}," +
            "ctype=#{ctype},corporation=#{corporation},waybillid=#{waybillid}," +
            "remarks=#{remarks} where id=#{id}")
    int updateBiglogLogisticscontroltable(BiglogLogisticscontroltable b);
    @Delete("delete from biglog_logisticscontroltable where id=#{id}")
    int deleteBiglogLogisticscontroltable(Short id);

    @Select("select * from biglog_logisticscontroltable  where worksheetno like '%'|| #{worksheetno}||'%' and corporation like '%'|| #{corporation}||'%'")
    List<BiglogLogisticscontroltable> selectBiglogLogisticscontroltablemh(BiglogLogisticscontroltable b);
}
