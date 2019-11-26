package com.hlp.services;

import com.hlp.model.LogLogisticstransfer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface LogLogisticstransferService {
    //查询交接单
    public List<LogLogisticstransfer> selectLogLogisticstransferHlp(int pages,int rows,String transferint,String driver);

    //最大值
    public int selectLogLogisticstransferByMaxHlp();
}
