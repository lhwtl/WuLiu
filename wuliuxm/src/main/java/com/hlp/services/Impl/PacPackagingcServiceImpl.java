package com.hlp.services.Impl;

import com.hlp.mapper.PacPackagingcMapper;
import com.hlp.model.PacPackagingc;
import com.hlp.services.PacPackagingcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacPackagingcServiceImpl implements PacPackagingcService {
    @Autowired
    private PacPackagingcMapper mapper;
    @Override
    public List<PacPackagingc> selectPacPackagingc() {
        return mapper.selectPacPackagingc();
    }
}
