package com.hlp.mapper;


import com.hlp.model.BasShuttlebus;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BasShuttlebusMapper {

@Select("select * from Bas_Shuttlebus")
@Results({
        @Result(property = "id",column = "id",id=true),
        @Result(property = "operatorid",column = "operatorid"),
        @Result(property = "operationunitid",column = "operationunitid"),
        @Result(property = "syEmp", column = "operatorid", one = @One(select = "com.hlp.mapper.SyEmpMapper.selectSyEmpIdts")),
        @Result(property = "syUnits", column = "operationunitid", one = @One(select = "com.hlp.mapper.SyUnitsMapper.selectSyUnitsIdts"))
})
public List<BasShuttlebus> selectBasShuttlebus();


@Delete("delete from Bas_Shuttlebus where id =#{id}")
        public int deleteBasShuttlebusts(short id);


//跟踪表登记根据班车跟踪 一对多
    @Select("select b.* from(select t.*,rownum rn from bas_shuttlebus t )b where b.rn>(#{pages}-1)*#{rows} and b.rn <=#{pages}*#{rows}")
    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "operatorid",column = "operatorid"),
            @Result(property = "operationunitid",column = "operationunitid"),
            @Result(property = "licenseplateint",column = "licenseplateint"),
            @Result(property = "syEmp", column = "operatorid", one = @One(select = "com.hlp.mapper.SyEmpMapper.selectSyEmpIdts")),
            @Result(property = "syUnits", column = "operationunitid", one = @One(select = "com.hlp.mapper.SyUnitsMapper.selectSyUnitsIdts")),
            @Result(property = "logTracks", column = "licenseplateint", one = @One(select = "com.hlp.mapper.LogTrackMapper.selectLogTrackByCarInt"))
    })
    public List<BasShuttlebus> selectBasShuttlebusHLP(int pages,int rows);

    //跟踪登记  总行数
    @Select("select count(*) from bas_shuttlebus")
    public  int selectBasShuttlebusByMax();


    @Select("select * from bas_shuttlebus where licenseplateint=#{licenseplateint}")
    public BasShuttlebus selectBasShuttlebusBylicenseplateintHlp(String licenseplateint);


}

