package com.hlp.services.Impl;

import com.hlp.mapper.IaeLineresourceMapper;
import com.hlp.model.IaeLineresource;
import com.hlp.services.IaeLineresourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IaeLineresourceServiceImpl implements IaeLineresourceService {
    @Autowired
    private IaeLineresourceMapper iaeLineresourceMapper;


    @Override
    public List<IaeLineresource> FillIaeLineresourceLX() {
        return iaeLineresourceMapper.FillIaeLineresourceLX();
    }
}
