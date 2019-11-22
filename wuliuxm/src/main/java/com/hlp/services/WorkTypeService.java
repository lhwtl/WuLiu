package com.hlp.services;

import com.hlp.model.Worktype;
import org.springframework.stereotype.Service;

@Service
public interface WorkTypeService {
    public Worktype selectWorktypeHlp(short id);
}
