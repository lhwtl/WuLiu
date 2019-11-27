package com.hlp.services;

import com.hlp.model.BasZoneinfo;

import java.util.List;

public interface BasZoneinfoService {
    public List<BasZoneinfo> selectBasZoneinfo();
    public int deleteBasZoneinfoZonecodets(short id);
}
