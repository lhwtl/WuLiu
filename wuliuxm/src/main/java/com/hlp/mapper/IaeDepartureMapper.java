package com.hlp.mapper;

import com.hlp.model.IaeDeparture;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IaeDepartureMapper {

    @Select("select * from Iae_Departure")
    public List<IaeDeparture> FillIaeDepartureLX();
}
