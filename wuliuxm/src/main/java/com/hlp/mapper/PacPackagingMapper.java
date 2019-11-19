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
    @Select("select * from PacPackaging")
    List<PacPackaging> selectPacPackaging();
    @Delete("delete from PacPackaging where id=#{id}")
    int deletePacPackaging(Short id);
    @Insert("insert into PacPackaging values(null,#{itemcode},#{itemname}," +
            "#{plannedprice},#{specifications},#{type},#{measurementunit},#{status})")
    int insertPacPackaging(PacPackaging record);
    @Select("select * from PacPackaging where id=#{id}")
    PacPackaging selectPacPackagingid(Short id);
    @Update("update PacPackaging set itemcode=#{itemcode},itemname=#{itemname}," +
            " plannedprice=#{plannedprice},specifications=#{specifications}," +
            "type=#{type},measurementunit=#{measurementunit},status=#{status} where id=#{id}")
    int updatePacPackaging(PacPackaging record);

    @Select("select * from PacPackaging where n")
    List<PacPackaging> selectPacPackagingname();
}