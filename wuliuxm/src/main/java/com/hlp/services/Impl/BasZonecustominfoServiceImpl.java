package com.hlp.services.Impl;

import com.hlp.mapper.BasZonecustominfoMapper;
import com.hlp.model.BasZonecustominfo;
import com.hlp.services.BasZonecustominfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasZonecustominfoServiceImpl implements BasZonecustominfoService {
    @Autowired
    private BasZonecustominfoMapper basZonecustominfoMapper;
    @Override
    public List<BasZonecustominfo> selectBasZonecustominfoKHts(Short zoneinfoid) {
        return basZonecustominfoMapper.selectBasZonecustominfoKHts(zoneinfoid);
    }
}
