package com.hlp.mapper;

import com.hlp.model.SyUnits;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SyUnitsMapper {
/*查询全部lx*/
    @Select("select * from Sy_Units")
    public List<SyUnits> FillAllSyUnitsLx();

}