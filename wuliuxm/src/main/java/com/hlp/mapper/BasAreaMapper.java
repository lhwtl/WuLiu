package com.hlp.mapper;

import com.hlp.model.BasArea;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BasAreaMapper {
    @Select("select * from BAS_Area")
   @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "entryunitid",column = "entryunitid"),
            @Result(property =  "syUnits",column = "entryunitid",one = @One(select ="com.hlp.mapper.SyUnitsMapper.selectSyUnitsNamets"))
    })
    public List<BasArea> selectBasArea();
    @Delete("delete from BAS_Area where id=#{id}")
    public int deleteBasAreats(Short id);
    //添加
    @Insert("insert into BAS_Area values(Bas_Area_id.nextval,#{province},#{city},#{county},#{postalcode},#{simplecode},#{citycode},#{entryunitid},#{complementunitid},#{nature},#{thearea})")
    public int inserteBasAreats(BasArea basArea);

    //修改
    @Update("update BAS_Area set province=#{province},city=#{city},county=#{county},postalcode=#{postalcode},simplecode=#{simplecode},citycode=#{citycode},entryunitid=#{entryunitid},complementunitid=#{complementunitid},nature=#{nature},thearea=#{thearea} where id=#{id}")
    public int updateBasAreats(BasArea basArea);
}
