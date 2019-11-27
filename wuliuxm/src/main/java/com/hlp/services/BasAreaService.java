package com.hlp.services;

import com.hlp.model.BasArea;

import java.util.List;

public interface BasAreaService {
    public List<BasArea> selectBasArea();
    public int deleteBasAreats(Short id);
}
