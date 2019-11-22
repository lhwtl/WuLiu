package com.hlp.services;

import com.hlp.model.QsType;
import org.springframework.stereotype.Service;

@Service
public interface QsTypeService {
    //签收录入根据ID查询签收类型
    public QsType selectQsTypeByIdHlp(short id);
}
