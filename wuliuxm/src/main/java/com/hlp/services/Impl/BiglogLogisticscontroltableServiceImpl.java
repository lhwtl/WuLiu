package com.hlp.services.Impl;

import com.hlp.mapper.BiglogLogisticscontroltableMapper;
import com.hlp.model.BiglogLogisticscontroltable;
import com.hlp.services.BiglogLogisticscontroltableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BiglogLogisticscontroltableServiceImpl implements BiglogLogisticscontroltableService {
    @Autowired
    private BiglogLogisticscontroltableMapper logisticscontroltable;

    @Override
    public List<BiglogLogisticscontroltable> selectBiglogLogisticscontroltable() {
        List<BiglogLogisticscontroltable> list=logisticscontroltable.selectBiglogLogisticscontroltable();
        for (BiglogLogisticscontroltable l : list) {
            System.out.println(l);
        }
        return list;
    }

    @Override
    public int insertBiglogLogisticscontroltable(BiglogLogisticscontroltable b) {
        return logisticscontroltable.insertBiglogLogisticscontroltable(b);
    }

    @Override
    public int updateBiglogLogisticscontroltable(BiglogLogisticscontroltable b) {
        return logisticscontroltable.updateBiglogLogisticscontroltable(b);
    }

    @Override
    public int deleteBiglogLogisticscontroltable(Short id) {
        return logisticscontroltable.deleteBiglogLogisticscontroltable(id);
    }

    @Override
    public List<BiglogLogisticscontroltable> selectBiglogLogisticscontroltablemh(BiglogLogisticscontroltable b) {
        return logisticscontroltable.selectBiglogLogisticscontroltablemh(b);
    }


}
