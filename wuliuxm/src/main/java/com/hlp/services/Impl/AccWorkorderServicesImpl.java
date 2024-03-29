package com.hlp.services.Impl;

import com.hlp.mapper.AccWorkorderMapper;
import com.hlp.model.AccWorkorder;
import com.hlp.services.AccWorkorderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccWorkorderServicesImpl implements AccWorkorderServices {
    @Autowired
    private AccWorkorderMapper accWorkorderMapper;


    @Override
    public AccWorkorder selectAccWorkorderBybusinessnoticeno(String businessnoticeno) {
        return accWorkorderMapper.selectAccWorkorderBybusinessnoticeno(businessnoticeno);
    }

    @Override
    public List<AccWorkorder> selectAllAccWorkorderHlp() {
        return accWorkorderMapper.selectAllAccWorkorderHlp();
    }


    @Override
    public List<AccWorkorder> selectAccWorkorderts() {
        return accWorkorderMapper.selectAccWorkorderts();
    }

    @Override
    public List<AccWorkorder> selectAccWorkorderJgjByts() {
        return accWorkorderMapper.selectAccWorkorderJgjByts();
    }


}
