package com.hlp.services;

import com.hlp.model.BasShuttlebus;

import java.util.List;

public interface BasShuttlebusService {
    public List<BasShuttlebus> selectBasShuttlebus();
    public int deleteBasShuttlebusts(short id);
    public List<BasShuttlebus> selectBasShuttlebusHLP(int pages,int rows);
    public  int selectBasShuttlebusByMax();
    public BasShuttlebus selectBasShuttlebusBylicenseplateintHlp(String licenseplateint);
}
