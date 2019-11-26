package com.hlp.mapper;

import com.hlp.model.LogTrack;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LogTrackMapper {
    //跟踪登记根据车号查询
    @Select("select * from log_track where carint=#{carint}")
    public List<LogTrack> selectLogTrackByCarInt(String carint);
    @Select("select * from log_track where id=#{id}")
    public LogTrack selectLogTrackByidHLP(short id);

    //跟踪登记查询
    @Select("select b.* from(select t.*,rownum rn from log_track t )b where 1=1 and b.rn>(#{pages}-1)*#{rows} and b.rn <=#{pages}*#{rows} and b.linename like '%'||#{linename}||'%' and b.logisticscar like '%'||#{logisticscar}||'%'")
    @Results({
            @Result(property = "id", column = "id", id = true),
            @Result(property = "carint", column = "carint"),
            @Result(property = "basShuttlebus", column = "carint", one = @One(select = "com.hlp.mapper.BasShuttlebusMapper.selectBasShuttlebusBylicenseplateintHlp"))
    })
    public List<LogTrack> selectLogTrackHLP(int pages, int rows,String linename,String logisticscar);

    //跟踪登记  总行数
    @Select("select count(*) from log_track")
    public int selectLogTrackByMaxHlp();

    //跟踪表查询 一对一
    @Select("select * from log_track where linename=#{linename}")
    public LogTrack selectLogTrackBylinenameHLP(String linename);
}

