package com.hlp.services;

import com.hlp.model.BasPartition;

import java.util.List;

public interface BasPartitionService {
    public List<BasPartition> selectBasPartition();
    public int deleteBasPartitionts(Short id);
    //添加
    public int insertBasPartitionts(BasPartition basPartition);
    //修改
    public int updateBasPartitionts(BasPartition basPartition);
}
