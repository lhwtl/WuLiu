package com.hlp.services.Impl;
import com.hlp.mapper.AccBusinessadmissibilityMapper;
import com.hlp.model.AccBusinessadmissibility;
import com.hlp.services.AccBusinessadmissibilityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccBusinessadmissibilityServicesImpl implements AccBusinessadmissibilityServices {
    @Autowired
    private AccBusinessadmissibilityMapper accBusinessadmissibilityMapper;


    @Override
    public List<AccBusinessadmissibility> selectHlpAccBusinessadmissibility(int pages,int size,String telphone,String businessnoticeno) {
        return accBusinessadmissibilityMapper.selectHlpAccBusinessadmissibility(pages,size,telphone,businessnoticeno);
    }

    @Override
    public int selectCountHlp() {
        return accBusinessadmissibilityMapper.selectCountHlp();
    }
}
