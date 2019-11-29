package com.hlp.services.Impl;

import com.hlp.mapper.SorOutbounddetailsMapper;
import com.hlp.model.SorOutbounddetails;
import com.hlp.services.SorOutbounddetailsService;
import com.hlp.services.SorStoragedetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorOutbounddetailsServiceImpl implements SorOutbounddetailsService {
    @Autowired
    private SorOutbounddetailsMapper som;


    @Override
    public int insertSorOutbounddetailsLx(SorOutbounddetails sorOutbounddetails) {
        return som.insertSorOutbounddetailsLx(sorOutbounddetails);
    }

    @Override
    public int updateSorOutbounddetailsLx(SorOutbounddetails sorOutbounddetails) {
        return som.updateSorOutbounddetailsLx(sorOutbounddetails);
    }

    @Override
    public List<SorOutbounddetails> FiillSorOutbounddetailsByid(String packageid) {
        return som.FiillSorOutbounddetailsByid(packageid);
    }

    @Override
    public int deleteSorOutbounddetailsLx(String packageid) {
        return som.deleteSorOutbounddetailsLx(packageid);
    }
}
