package com.hlp.services.Impl;

import com.hlp.mapper.QsTypeMapper;
import com.hlp.model.QsType;
import com.hlp.services.QsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QsTypeServiceImpl implements QsTypeService {
    @Autowired
    private QsTypeMapper qsTypeMapper;
    @Override
    public QsType selectQsTypeByIdHlp(short id) {
        return qsTypeMapper.selectQsTypeByIdHlp(id);
    }
}
