package com.hlp.mapper;

import com.hlp.model.Worktype;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface WorkTypeMapper {
    //签收录入
    @Select("select * from worktype where id=#{id}")
    public Worktype selectWorktypeHlp(short id);
}
