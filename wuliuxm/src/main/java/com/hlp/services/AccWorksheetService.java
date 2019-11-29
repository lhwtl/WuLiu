package com.hlp.services;

import com.hlp.model.AccWorksheet;
import org.springframework.stereotype.Service;

@Service
public interface AccWorksheetService {

    //添加
    public int insertAccWorksheetts(AccWorksheet accWorksheet);
}
