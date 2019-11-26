package com.hlp.services;

import com.hlp.model.LogTrack;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface LogTrackService {
    //跟踪查询
    public List<LogTrack> selectLogTrackHLP(int pages, int rows,String linename,String logisticscar);
    //跟踪登记总行数
    public int selectLogTrackByMaxHlp();
}
