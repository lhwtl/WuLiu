package com.hlp.mapper;

import com.hlp.model.LogLogisticstransfer;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LogLogisticstransferMapper {
    //
    //查询物流交接单
    @Select("select b.* from(select t.*,rownum rn from log_logisticstransfer t )b where 1=1 and b.rn>(#{pages}-1)*#{rows} and b.rn <=#{pages}*#{rows} and b.transferint like '%'||#{transferint}||'%' and b.driver like '%'||#{driver}||'%'")
    @Results({
            @Result(property = "id",column = "id",id = true),
            @Result(property = "deliveryperson",column = "deliveryperson"),
            @Result(property = "syEmp",column = "deliveryperson",one=@One(select = "com.hlp.mapper.SyEmpMapper.selectSysEmpByPickerInfo"))
    })
    public List<LogLogisticstransfer> selectLogLogisticstransferHlp(int pages,int rows,String transferint,String driver);

    //最大值
    @Select("select count(*) from log_logisticstransfer")
    public int selectLogLogisticstransferByMaxHlp();

}
