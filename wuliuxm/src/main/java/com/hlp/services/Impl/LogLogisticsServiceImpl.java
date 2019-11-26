package com.hlp.services.Impl;

import com.hlp.mapper.LogLogisticsMapper;
import com.hlp.model.LogLogistics;
import com.hlp.services.LogLogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogLogisticsServiceImpl implements LogLogisticsService {
    @Autowired
    private LogLogisticsMapper logLogisticsMapper;

    @Override
    public List<LogLogistics> selectLogLogisticsHLP(int pages,int rows,String logisticsint,String linename) {
        return logLogisticsMapper.selectLogLogisticsHLP(pages, rows,logisticsint,linename);
    }

    @Override
    public int selectLogLogisticsByMaxHLP() {
        return logLogisticsMapper.selectLogLogisticsByMaxHLP();
    }
}
