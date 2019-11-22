package com.hlp.services.Impl;

import com.hlp.mapper.DisDispatchhistoryMapper;
import com.hlp.model.DisDispatchhistory;
import com.hlp.services.DisDispatchhistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisDispatchhistoryServiceImpl implements DisDispatchhistoryService {
    @Autowired
    private DisDispatchhistoryMapper disDispatchhistoryMapper;
    @Override
    public DisDispatchhistory selectDisDispatchhistoryByidHlp(short dispatchsequence) {
        return disDispatchhistoryMapper.selectDisDispatchhistoryByidHlp(dispatchsequence);
    }
}
