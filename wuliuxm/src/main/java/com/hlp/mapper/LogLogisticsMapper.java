package com.hlp.mapper;

import com.hlp.model.LogLogistics;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface LogLogisticsMapper {
    //跟踪表查询
    @Select("select b.* from(select t.*,rownum rn from log_logistics t )b where 1=1 and b.rn>(#{pages}-1)*#{rows} and b.rn <=#{pages}*#{rows} and b.rn <=#{pages}*#{rows} and b.logisticsint like '%'||#{logisticsint}||'%' and b.linename like '%'||#{linename}||'%'")
    @Results({
            @Result(property = "id",column = "id",id = true),
            @Result(property = "id",column = "id"),
            @Result(property = "logisticsint",column = "logisticsint"),
            @Result(property = "logTrack",column = "id",one=@One(select = "com.hlp.mapper.LogTrackMapper.selectLogTrackByidHLP")),
            @Result(property = "logLogisticsdetails",column = "logisticsint",one=@One(select = "com.hlp.mapper.LogLogisticsdetailsMapper.selectLogLogisticsdetailsByLogisticsIntHlp")),
    })
    public List<LogLogistics> selectLogLogisticsHLP(int pages,int rows,String logisticsint,String linename);
    //最大值
    @Select("select count(*) from log_logistics")
    public int selectLogLogisticsByMaxHLP();

}
