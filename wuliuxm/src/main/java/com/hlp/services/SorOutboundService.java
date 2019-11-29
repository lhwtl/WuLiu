package com.hlp.services;

import com.hlp.model.SorOutbound;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SorOutboundService {

    /*查全部*/
    public List<SorOutbound> FillSorOutboundLx();
    /*c查id*/
    public SorOutbound FillSorOutboundByidLx(int id);
    /*新增*/
    public int insertSorOutboundLx(SorOutbound sorOutbound);
    /*修改*/
    public int updateSorOutboundLx(SorOutbound sorOutbound);
    /*删除*/
    public int deleteSorOutboundLx(int id);

}
