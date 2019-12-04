package com.hlp.mapper;

import com.hlp.model.AccWorkorder;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccWorkorderMapper {

    //查询所有业务通知单同时查询工单，员工以及单位||查台转单
    @Select("select * from acc_workorder where businessnoticeno=#{businessnoticeno}")
    public AccWorkorder selectAccWorkorderBybusinessnoticeno(String businessnoticeno);
    //查询所有的分拣编码
    @Select("select * from acc_workorder")
    public List<AccWorkorder> selectAllAccWorkorderHlp();

    /*根据businessnoticeno(业务通知单号) 查询工单表*/
    @Select("select * from acc_workorder where businessnoticeno=#{businessnoticeno}")
    public AccWorkorder selectAccWorkorderBusinessnoticenots(String businessnoticeno);

    //查询工单表
    @Select("select * from acc_workorder")
    @Results({
            @Result(property = "id",column = "id",id = true),
            @Result(property = "jobno",column = "jobno"),
            @Result(property = "jobno",column = "jobno"),
            @Result(property = "businessnoticeno",column = "businessnoticeno"),
            @Result(property = "accBusinessadmissibility",column = "businessnoticeno",one=@One(select = "com.hlp.mapper.AccBusinessadmissibilityMapper.selectAccBusinessadmissibilityBusinessnoticenots")),
            @Result(property = "disWorkordersign",column = "jobno",one=@One(select = "com.hlp.mapper.DisWorkordersignMapper.selectDisWorkordersignByworksheetno")),
            @Result(property = "accWorksheet",column = "jobno",one=@One(select = "com.hlp.mapper.AccWorksheetMapper.selectAccWorksheetts"))

    })
    public List<AccWorkorder> selectAccWorkorderts();

    //结果集获取分拣编码
    /*select * from acc_workorder where sortingcode not in (select aw.sortingcode from acc_workorder aw inner join acc_businessadmissibility ab on aw.businessnoticeno=ab.businessnoticeno inner join bas_zonecustominfo bz on ab.customname=bz.customname inner join BAS_ZoneInfo bzo on bzo.id=bz.zoneinfoid inner join BAS_Partition bp on bzo.zonecode=bp.zonecode)*/
    @Select("select * from acc_workorder where sortingcode not in(select sortingcode from bas_partition)")
    public List<AccWorkorder> selectAccWorkorderJgjByts();



}
