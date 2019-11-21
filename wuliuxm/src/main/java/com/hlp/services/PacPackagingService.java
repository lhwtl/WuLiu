package com.hlp.services;

import com.hlp.model.PacPackaging;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface PacPackagingService {
    List<PacPackaging> selectPacPackaging();

    int deletePacPackaging(Short id);

    int insertPacPackaging(PacPackaging record);

    PacPackaging selectPacPackagingid(Short id);

    int updatePacPackaging(PacPackaging record);

    List<PacPackaging> selectPacPackagingname();
}
