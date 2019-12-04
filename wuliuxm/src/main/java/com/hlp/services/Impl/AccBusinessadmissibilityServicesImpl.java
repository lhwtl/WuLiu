
package com.hlp.services.Impl;
import com.hlp.mapper.AccBusinessadmissibilityMapper;
import com.hlp.model.AccBusinessadmissibility;
import com.hlp.services.AccBusinessadmissibilityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AccBusinessadmissibilityServicesImpl implements AccBusinessadmissibilityServices {
    @Autowired
    private AccBusinessadmissibilityMapper accBusinessadmissibilityMapper;


    @Override
    public List<AccBusinessadmissibility> selectHlpAccBusinessadmissibility(int pages, int size, String telphone, String businessnoticeno) {
        return accBusinessadmissibilityMapper.selectHlpAccBusinessadmissibility(pages, size, telphone, businessnoticeno);
    }

    @Override
    public int selectCountHlp() {
        return accBusinessadmissibilityMapper.selectCountHlp();
    }


    @Override
    public List<AccBusinessadmissibility> selectHlpAccBusinessadmissibilityRgdd(int pages,int rows,short processingunit,String businessnoticeno) {
        return accBusinessadmissibilityMapper.selectHlpAccBusinessadmissibilityRgdd(pages, rows,processingunit,businessnoticeno);
    }

    @Override
    public List<AccBusinessadmissibility> selectHlpAccBusinessadmissibilityRgddfy(int pages, int rows) {
        return accBusinessadmissibilityMapper.selectHlpAccBusinessadmissibilityRgddfy(pages, rows);
    }

    @Override
    public List<AccBusinessadmissibility> selectAccBusinessadmissibilityts() {
        return accBusinessadmissibilityMapper.selectAccBusinessadmissibilityts();
    }

    @Override
    public int insertAccBusinessadmissibilityBusinessnoticenots(AccBusinessadmissibility accBusinessadmissibility) {
        return accBusinessadmissibilityMapper.insertAccBusinessadmissibilityBusinessnoticenots(accBusinessadmissibility);
    }

    @Override
    public int updateAccBusinessadmissibilityBusinessnoticenots(AccBusinessadmissibility accBusinessadmissibility) {
        return accBusinessadmissibilityMapper.updateAccBusinessadmissibilityBusinessnoticenots(accBusinessadmissibility);
    }

    @Override
    public int deleteAccBusinessadmissibilityBusinessnoticenots(Short id) {
        return accBusinessadmissibilityMapper.deleteAccBusinessadmissibilityBusinessnoticenots(id);
    }

}
