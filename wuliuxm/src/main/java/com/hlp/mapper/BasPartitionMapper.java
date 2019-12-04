package com.hlp.mapper;

import com.hlp.model.BasPartition;
import org.apache.ibatis.annotations.*;
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

    //删除
    @Delete("delete from Bas_Partition where id=#{id}")
    public int deleteBasPartitionts(Short id);

    //添加
    @Insert("insert into Bas_Partition values(Bas_Partition_id.nextval,#{province},#{city},#{county},#{zonecode},#{keyword},#{startint},#{terminateint},#{sdint},#{sortingcode})")
    public int insertBasPartitionts(BasPartition basPartition);

    //修改
    @Update("update Bas_Partition set province=#{province},city=#{city},county=#{county},zonecode=#{zonecode},keyword=#{keyword},startint=#{startint},terminateint=#{terminateint},sdint=#{sdint},sortingcode=#{sortingcode} where id =#{id}")
    public int updateBasPartitionts(BasPartition basPartition);
}
