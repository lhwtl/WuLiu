package com.hlp.services.Impl;

import com.hlp.mapper.LogLogisticstransferMapper;
import com.hlp.model.LogLogisticstransfer;
import com.hlp.services.LogLogisticstransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogLogisticstransferServiceImpl implements LogLogisticstransferService {
    @Autowired
    private LogLogisticstransferMapper logLogisticstransferMapper;

    @Override
    public List<LogLogisticstransfer> selectLogLogisticstransferHlp(int pages, int rows,String transferint,String driver) {
        return logLogisticstransferMapper.selectLogLogisticstransferHlp(pages, rows,transferint,driver);
    }

    @Override
    public int selectLogLogisticstransferByMaxHlp() {
        return logLogisticstransferMapper.selectLogLogisticstransferByMaxHlp();
    }
}
