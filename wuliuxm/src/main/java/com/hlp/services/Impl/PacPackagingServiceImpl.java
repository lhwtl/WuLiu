package com.hlp.services.Impl;

import com.hlp.mapper.PacPackagingMapper;
import com.hlp.model.PacPackaging;
import com.hlp.services.PacPackagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacPackagingServiceImpl implements PacPackagingService {

    @Autowired
  private PacPackagingMapper mapper;
    @Override
    public List<PacPackaging> selectPacPackaging() {
        return mapper.selectPacPackaging();
    }

    @Override
    public int deletePacPackaging(Short id) {
        return mapper.deletePacPackaging(id);
    }

    @Override
    public int insertPacPackaging(PacPackaging record) {
        return mapper.insertPacPackaging(record);
    }

    @Override
    public PacPackaging selectPacPackagingid(Short id) {
        return mapper.selectPacPackagingid(id);
    }

    @Override
    public int updatePacPackaging(PacPackaging record) {
        return mapper.updatePacPackaging(record);
    }
}
