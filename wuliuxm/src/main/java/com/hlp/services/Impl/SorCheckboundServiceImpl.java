package com.hlp.services.Impl;

import com.hlp.mapper.SorCheckboundMapper;
import com.hlp.model.SorCheckbound;
import com.hlp.services.SorCheckboundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.soap.Addressing;
import java.util.List;

@Service
public class SorCheckboundServiceImpl implements SorCheckboundService {
    @Autowired
    private SorCheckboundMapper scm;

    @Override
    public List<SorCheckbound> FillSorCheckboundLx() {
        return scm.FillSorCheckboundLx();
    }

    @Override
    public List<SorCheckbound> FillSorCheckboundByidLx(int id) {
        return scm.FillSorCheckboundByidLx(id);
    }

    @Override
    public int deleteSorCheckbound(int id) {
        return scm.deleteSorCheckbound(id);
    }

    @Override
    public int insertSorCheckboundLx(SorCheckbound sorCheckbound) {
        return scm.insertSorCheckboundLx(sorCheckbound);
    }

    @Override
    public int updateSorCheckboundLx(SorCheckbound sorCheckbound) {
        return scm.updateSorCheckboundLx(sorCheckbound);
    }

    @Override
    public SorCheckbound FillKCSorCheckboundByidLx(int id) {
        return scm.FillKCSorCheckboundByidLx(id);
    }
}
