package com.hlp.services.Impl;

import com.hlp.mapper.IaeTimeinputMapper;
import com.hlp.model.IaeTimeinput;
import com.hlp.services.IaeTimeinputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IaeTimeinputServiceImpl implements IaeTimeinputService {
    @Autowired
    private IaeTimeinputMapper stm;

    @Override
    public List<IaeTimeinput> FillIaeTimeinputLX() {
        return stm.FillIaeTimeinputLX();
    }
}
