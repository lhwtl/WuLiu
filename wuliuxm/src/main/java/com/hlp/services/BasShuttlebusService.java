package com.hlp.services;

import com.hlp.model.BasShuttlebus;

import java.util.List;

public interface BasShuttlebusService {
    public List<BasShuttlebus> selectBasShuttlebus();
    //跟踪登记 一对多
    public List<BasShuttlebus> selectBasShuttlebusHLP(int pages,int rows);
    //跟踪登记 总行数
    public  int selectBasShuttlebusByMax();

}
