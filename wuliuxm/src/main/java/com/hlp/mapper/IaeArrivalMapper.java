package com.hlp.mapper;

import com.hlp.model.IaeArrival;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IaeArrivalMapper {

    @Select("select * from Iae_Arrival")
    public List<IaeArrival> FillIaeArrivalLX();

}
