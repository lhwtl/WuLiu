package com.hlp.mapper;

import com.hlp.model.QsType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface QsTypeMapper {

    //签收录入根据ID查询签收类型
    @Select("select * from qstype where id=#{id}")
    public QsType selectQsTypeByIdHlp(short id);
}
