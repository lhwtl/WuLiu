package com.hlp.services.Impl;

import com.hlp.mapper.AccWorksheetMapper;
import com.hlp.model.AccWorksheet;
import com.hlp.services.AccWorksheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccWorksheetServiceImpl implements AccWorksheetService {
    @Autowired
    private AccWorksheetMapper accWorksheetMapper;

}
