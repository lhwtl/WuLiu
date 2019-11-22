package com.hlp.services;

import com.hlp.model.BiglogLogisticscontroltable;

import java.util.List;

public interface BiglogLogisticscontroltableService {
    List<BiglogLogisticscontroltable> selectBiglogLogisticscontroltable();

    int insertBiglogLogisticscontroltable(BiglogLogisticscontroltable b);

    int updateBiglogLogisticscontroltable(BiglogLogisticscontroltable b);

    int deleteBiglogLogisticscontroltable(Short id);
}
