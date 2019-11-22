package com.hlp.mapper;

import com.hlp.model.BasPartition;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BasPartitionMapper {
    /*分区表*/
    @Select("select * from Bas_Partition")
    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "zonecode",column = "zonecode"),
            @Result(property =  "basZoneinfo",column = "zonecode",one = @One(select ="com.hlp.mapper.BasZoneinfoMapper.selectBasZoneinfoZonecodets"))
    })
    public List<BasPartition> selectBasPartition();
}
