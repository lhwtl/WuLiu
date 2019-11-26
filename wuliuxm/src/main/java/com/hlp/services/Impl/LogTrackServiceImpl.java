package com.hlp.services.Impl;

import com.hlp.mapper.LogTrackMapper;
import com.hlp.model.LogTrack;
import com.hlp.services.LogTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogTrackServiceImpl implements LogTrackService {
    @Autowired
    private LogTrackMapper logTrackMapper;


    @Override
    public List<LogTrack> selectLogTrackHLP(int pages, int rows,String linkname,String logisticscar) {
        return logTrackMapper.selectLogTrackHLP(pages, rows,linkname,logisticscar);
    }

    @Override
    public int selectLogTrackByMaxHlp() {
        return logTrackMapper.selectLogTrackByMaxHlp();
    }
}
