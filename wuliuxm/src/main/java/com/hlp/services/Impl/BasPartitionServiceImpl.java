package com.hlp.services.Impl;

import com.hlp.mapper.BasPartitionMapper;
import com.hlp.model.BasPartition;
import com.hlp.services.BasPartitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasPartitionServiceImpl implements BasPartitionService {
    @Autowired
    private BasPartitionMapper basPartitionMapper;
    @Override
    public List<BasPartition> selectBasPartition() {
        return basPartitionMapper.selectBasPartition();
    }
}
