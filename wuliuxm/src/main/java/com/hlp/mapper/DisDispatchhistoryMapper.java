package com.hlp.mapper;

import com.hlp.model.DisDispatchhistory;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface DisDispatchhistoryMapper {
   //人工调度
    @Select("select * from dis_dispatchhistory where dispatchsequence=#{dispatchsequence}")
    public DisDispatchhistory selectDisDispatchhistoryByidHlp(short dispatchsequence);
}
