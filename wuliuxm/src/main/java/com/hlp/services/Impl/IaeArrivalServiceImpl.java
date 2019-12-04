package com.hlp.services.Impl;

import com.hlp.mapper.IaeArrivalMapper;
import com.hlp.model.IaeArrival;
import com.hlp.services.IaeArrivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.List;

@Service
public class IaeArrivalServiceImpl implements IaeArrivalService {
    @Autowired
    private IaeArrivalMapper iam;


    @Override
    public List<IaeArrival> FillIaeArrivalLX() {
       return iam.FillIaeArrivalLX();
    }
}
