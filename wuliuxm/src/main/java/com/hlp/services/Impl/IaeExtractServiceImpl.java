package com.hlp.services.Impl;

import com.hlp.mapper.IaeExtractMapper;
import com.hlp.model.IaeExtract;
import com.hlp.services.IaeExtractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IaeExtractServiceImpl implements IaeExtractService {
    @Autowired
    private IaeExtractMapper iem;

    @Override
    public List<IaeExtract> FillIaeExtractLX() {
        return iem.FillIaeExtractLX();
    }
}
