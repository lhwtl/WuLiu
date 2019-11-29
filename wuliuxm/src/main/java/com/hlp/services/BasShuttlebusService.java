package com.hlp.services;

import com.hlp.model.BasShuttlebus;

import java.util.List;

public interface BasShuttlebusService {
    //查询
    public List<BasShuttlebus> selectBasShuttlebus();
    //删除
    public int deleteBasShuttlebusts(short id);
    //添加
    public int insertBasShuttlebusts(BasShuttlebus basShuttlebus);
    //修改
    public int updateBasShuttlebus(BasShuttlebus basShuttlebus);
    public List<BasShuttlebus> selectBasShuttlebusHLP(int pages,int rows);
    public  int selectBasShuttlebusByMax();
    public BasShuttlebus selectBasShuttlebusBylicenseplateintHlp(String licenseplateint);
}
