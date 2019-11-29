package com.hlp.services.Impl;

import com.hlp.mapper.WorkTypeMapper;
import com.hlp.model.Worktype;
import com.hlp.services.WorkTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WorkTypeServiceImpl implements WorkTypeService {
    @Autowired
    private WorkTypeMapper workTypeMapper;

    @Override
    public Worktype selectWorktypeHlp(short id) {
        return workTypeMapper.selectWorktypeHlp(id);
    }

    @Override
    public List<Worktype> selectWorktypeAllHlp() {
        return workTypeMapper.selectWorktypeAllHlp();
    }
}
