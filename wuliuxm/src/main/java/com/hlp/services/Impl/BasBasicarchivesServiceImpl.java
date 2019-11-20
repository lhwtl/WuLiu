package com.hlp.services.Impl;

import com.hlp.mapper.BasBasicarchivesMapper;
import com.hlp.model.BasBasicarchives;
import com.hlp.services.BasBasicarchivesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BasBasicarchivesServiceImpl implements BasBasicarchivesService {
@Autowired
private BasBasicarchivesMapper basBasicarchivesMapper;


    @Override
    public List<BasBasicarchives> selectBasBasicarchive() {
        return basBasicarchivesMapper.selectBasBasicarchive();
    }
}
