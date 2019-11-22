package com.hlp.services.Impl;

import com.hlp.mapper.BasAreaMapper;
import com.hlp.model.BasArea;
import com.hlp.services.BasAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BasAreaServiceImpl implements BasAreaService {
    @Autowired
    private BasAreaMapper basAreaMapper;
    @Override
    public List<BasArea> selectBasArea() {
        return basAreaMapper.selectBasArea();
    }
}
