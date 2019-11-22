package com.hlp.services;

import com.hlp.model.DisDispatchhistory;
import org.springframework.stereotype.Service;

@Service
public interface DisDispatchhistoryService {
    //人工调入关联
    public DisDispatchhistory selectDisDispatchhistoryByidHlp(short dispatchsequence);
}
