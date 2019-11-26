package com.hlp.services.Impl;

import com.hlp.mapper.BasShuttlebusMapper;
import com.hlp.model.BasShuttlebus;
import com.hlp.services.BasShuttlebusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BasShuttlebusServiceImpl implements BasShuttlebusService {
    @Autowired
    private BasShuttlebusMapper basShuttlebusMapper;
    @Override
    public List<BasShuttlebus> selectBasShuttlebus() {
        return basShuttlebusMapper.selectBasShuttlebus();
    }

    @Override
    public List<BasShuttlebus> selectBasShuttlebusHLP(int pages,int rows) {
        return basShuttlebusMapper.selectBasShuttlebusHLP(pages, rows);
    }

    @Override
    public int selectBasShuttlebusByMax() {
        return basShuttlebusMapper.selectBasShuttlebusByMax();
    }
}
