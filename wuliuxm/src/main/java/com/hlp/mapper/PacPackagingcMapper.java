package com.hlp.mapper;

import com.hlp.model.PacPackagingc;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PacPackagingcMapper {
    @Select("select * from pac_packagingc")
    List< PacPackagingc> selectPacPackagingc();


}