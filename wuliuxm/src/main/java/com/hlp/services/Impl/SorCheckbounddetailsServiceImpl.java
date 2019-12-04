package com.hlp.services.Impl;

import com.hlp.mapper.SorCheckbounddetailsMapper;
import com.hlp.model.SorCheckbounddetails;
import com.hlp.model.SorPackagedetails;
import com.hlp.services.SorCheckbounddetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorCheckbounddetailsServiceImpl implements SorCheckbounddetailsService {
    @Autowired
    private SorCheckbounddetailsMapper scm;

    @Override
    public List<SorCheckbounddetails> FillSSorCheckbounddetailspackageByidLx(String packageid) {
        return scm.FillSSorCheckbounddetailspackageByidLx(packageid);
    }

    @Override
    public SorCheckbounddetails FillSSorCheckbounddetailsByidLx(int id) {
        return scm.FillSSorCheckbounddetailsByidLx(id);
    }

    @Override
    public int deleteSorCheckbounddetailsByidLx(int id) {
        return scm.deleteSorCheckbounddetailsByidLx(id);
    }

    @Override
    public int deleteSorCheckbounddetailsLx(String packageid) {
        return scm.deleteSorCheckbounddetailsLx(packageid);
    }

    @Override
    public int insertSorCheckbounddetailsLx(SorCheckbounddetails sorCheckbounddetails) {
        return scm.insertSorCheckbounddetailsLx(sorCheckbounddetails);
    }

    @Override
    public int updateSorCheckbounddetailsLx(SorCheckbounddetails sorCheckbounddetails) {
        return scm.updateSorCheckbounddetailsLx(sorCheckbounddetails);
    }

    @Override
    public List<SorCheckbounddetails> FillKCSorCheckbounddetailslx() {
        return scm.FillKCSorCheckbounddetailslx();
    }


}
