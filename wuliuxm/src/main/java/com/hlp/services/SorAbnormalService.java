package com.hlp.services;

import com.hlp.model.SorAbnormal;

import java.util.List;

public interface SorAbnormalService {
    List<SorAbnormal> selectSorAbnormalLX();
    public int insertSorAbnormalLX(SorAbnormal sor);
}
