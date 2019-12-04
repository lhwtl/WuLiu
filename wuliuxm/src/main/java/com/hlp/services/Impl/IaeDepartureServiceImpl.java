package com.hlp.services.Impl;

import com.hlp.mapper.IaeDepartureMapper;
import com.hlp.model.IaeDeparture;
import com.hlp.services.IaeDepartureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IaeDepartureServiceImpl implements IaeDepartureService {
    @Autowired
    private IaeDepartureMapper idm;

    @Override
    public List<IaeDeparture> FillIaeDepartureLX() {
        return idm.FillIaeDepartureLX();
    }
}
