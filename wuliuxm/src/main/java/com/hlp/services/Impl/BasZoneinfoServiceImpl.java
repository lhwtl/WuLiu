package com.hlp.services.Impl;

import com.hlp.mapper.BasZoneinfoMapper;
import com.hlp.model.BasZoneinfo;
import com.hlp.services.BasZoneinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasZoneinfoServiceImpl implements BasZoneinfoService {
    @Autowired
    private BasZoneinfoMapper basZoneinfoMapper;
    @Override
    public List<BasZoneinfo> selectBasZoneinfo() {
        return basZoneinfoMapper.selectBasZoneinfo();
    }
}
