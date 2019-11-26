package com.hlp.services;

import com.hlp.model.BasShuttlebus;

import java.util.List;

public interface BasShuttlebusService {
    public List<BasShuttlebus> selectBasShuttlebus();
    public int deleteBasShuttlebusts(short id);

}
