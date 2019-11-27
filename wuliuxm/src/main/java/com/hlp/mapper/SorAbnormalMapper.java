package com.hlp.mapper;

import com.hlp.model.SorAbnormal;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SorAbnormalMapper {
    @Select("select * from sor_abnormal")
    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "cargoint",column = "cargoint"),
            @Result(property =  "sorStorage",column = "cargoint",one = @One(select ="com.hlp.mapper.SorStorageMapper.FillSorStorageByidLX"))
    })
    List<SorAbnormal> selectSorAbnormalLX();
    @Insert("insert into sor_abnormal values(#{id},sysdate,#{launchperson},#{launchcompany}," +
            "#{abnormaltype},#{transferint},#{cargoint},#{packageint},#{hedgeabnint}," +
            "#{abostate},sysdate)")
    int insertSorAbnormalLX(SorAbnormal sor);
}
