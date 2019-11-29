package com.hlp.mapper;

import com.hlp.model.Worktype;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WorkTypeMapper {
    //签收录入
    @Select("select * from worktype where id=#{id}")
    public Worktype selectWorktypeHlp(short id);

    //查询所有工作单类型
    @Select("select * from worktype")
    public List<Worktype> selectWorktypeAllHlp();
}
