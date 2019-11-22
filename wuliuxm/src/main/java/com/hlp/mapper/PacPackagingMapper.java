package com.hlp.mapper;

import com.hlp.model.PacPackaging;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PacPackagingMapper {
    @Select("select * from pac_packaging")
    List<PacPackaging> selectPacPackaging();
    @Delete("delete from pac_packaging where id=#{id}")
    int deletePacPackaging(Short id);
    @Insert("insert into pac_packaging values(1,#{itemcode},#{itemname}," +
            "#{plannedprice},#{specifications},#{type},1" +
            ",#{status},1,sysdate,sysdate,1,sysdate)")
    int insertPacPackaging(PacPackaging record);
    @Select("select * from pac_packaging where id=#{id}")
    PacPackaging selectPacPackagingid(Short id);
    @Update("update pac_packaging set itemcode=#{itemcode},itemname=#{itemname}," +
            " plannedprice=#{plannedprice},specifications=#{specifications}," +
            "type=#{type},status=#{status} where id=#{id}")
    int updatePacPackaging(PacPackaging record);

    @Select("select * from pac_packaging where itemcode=#{itemcode} and itemname=#{itemname}")
    List<PacPackaging> selectPacPackagingname();
}