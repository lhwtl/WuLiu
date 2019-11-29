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

    //查询
    @Select("select * from bas_shuttlebus where licenseplateint=#{licenseplateint}")
    public BasShuttlebus selectBasShuttlebusBylicenseplateintHlp(String licenseplateint);
    //添加
    @Insert("insert into bas_shuttlebus(id,linetype,lineid,Licenseplateint,Carrier,Models,Driver,Telephone,Ton,Remarks,operatorid,operationunitid,operationtime) values(Bas_Shuttlebus_id.nextval,#{linetype},#{lineid},#{licenseplateint},#{carrier},#{models},#{driver},#{telephone},#{ton},#{remarks},#{operatorid},#{operationunitid},#{operationtime})")
    public int insertBasShuttlebusts(BasShuttlebus basShuttlebus);
    //修改
    @Update("update bas_shuttlebus set  linetype=#{linetype},lineid=#{lineid},licenseplateint=#{licenseplateint},carrier=#{carrier},models=#{models},driver=#{driver},telephone=#{telephone},ton=#{ton},remarks=#{remarks} where id=#{id} ")
    public int updateBasShuttlebus(BasShuttlebus basShuttlebus);


}

