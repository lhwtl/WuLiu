package com.hlp.mapper;

import com.hlp.model.BasZonecustominfo;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BasZonecustominfoMapper {
    @Select("select * from Bas_Zonecustominfo where zoneinfoid=#{zoneinfoid}")
    @Results({
            @Result(property = "customcode",column = "customcode",id=true),
            @Result(property = "customname",column = "customname"),
            @Result(property = "accBusinessadmissibility", column = "customname", one = @One(select = "com.hlp.mapper.AccBusinessadmissibilityMapper.selectAccBusinessadmissibilityCustomnamets"))
    })
    public BasZonecustominfo selectBasZonecustominfoZoneinfoidts(Short zoneinfoid);
    //定区查询个人客户
    @Select("select * from Bas_Zonecustominfo where zoneinfoid=#{zoneinfoid}")
    public List<BasZonecustominfo> selectBasZonecustominfoKHts(Short zoneinfoid);

}
