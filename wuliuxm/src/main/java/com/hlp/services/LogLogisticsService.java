package com.hlp.services;

import com.hlp.model.LogLogistics;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface LogLogisticsService {
    //查询跟踪表
    public List<LogLogistics> selectLogLogisticsHLP(int pages,int rows,String logisticsint,String linename);
   //查询最大值
    public int selectLogLogisticsByMaxHLP();
    //查询
    public List<LogLogistics> selectLogLogisticsts();
}
