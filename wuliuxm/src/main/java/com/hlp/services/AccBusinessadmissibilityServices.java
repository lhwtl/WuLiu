package com.hlp.services;

import com.hlp.model.AccBusinessadmissibility;

import java.util.Date;
import java.util.List;

public interface AccBusinessadmissibilityServices {
    //调度里面的查台转单查询所有
    public List<AccBusinessadmissibility> selectHlpAccBusinessadmissibility(int pages, int size, String telphone, String businessnoticeno);
    //查询最大值
    public int selectCountHlp();

    //人工调度
    public List<AccBusinessadmissibility> selectHlpAccBusinessadmissibilityRgdd(int pages,int rows,short processingunit,String businessnoticeno);
    public List<AccBusinessadmissibility> selectHlpAccBusinessadmissibilityRgddfy(int pages,int rows);

    public List<AccBusinessadmissibility> selectAccBusinessadmissibilityts();
}
