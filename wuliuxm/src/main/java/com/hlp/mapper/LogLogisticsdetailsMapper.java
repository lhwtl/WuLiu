package com.hlp.mapper;

import com.hlp.model.LogLogisticsdetails;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LogLogisticsdetailsMapper {

    @Select("select * from log_logisticsdetails where logisticsint=#{logisticsint}")
    public LogLogisticsdetails selectLogLogisticsdetailsByLogisticsIntHlp(String logisticsint);

}
