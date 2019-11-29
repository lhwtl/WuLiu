package com.hlp.services;

import com.hlp.model.Worktype;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WorkTypeService {
    public Worktype selectWorktypeHlp(short id);
    //查询所有工作单类型
    public List<Worktype> selectWorktypeAllHlp();
}
