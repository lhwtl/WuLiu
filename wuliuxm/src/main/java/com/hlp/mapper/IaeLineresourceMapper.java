package com.hlp.mapper;

import com.hlp.model.IaeLineresource;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface IaeLineresourceMapper {
    @Select("select * from iae_lineresource where id=#{id}")
    public IaeLineresource selectIaeLineresourceById(String id);

    @Select("select * from iae_lineresource where vehicleint=#{vehicleint}")
    public IaeLineresource selectIaeLineresourceByVehicleIntHlp(String vehicleint);

}
