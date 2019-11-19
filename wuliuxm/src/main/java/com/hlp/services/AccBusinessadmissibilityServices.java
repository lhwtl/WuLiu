package com.hlp.services;

import com.hlp.model.AccBusinessadmissibility;

import java.util.List;

public interface AccBusinessadmissibilityServices {
    //度里面的查台转单查询所有
    public List<AccBusinessadmissibility> selectHlpAccBusinessadmissibility();
    //调度里面的查台转单表格模糊查询
    public List<AccBusinessadmissibility> selectHlpAccBusinessadmissibilityByteleAndbusi(AccBusinessadmissibility accBusinessadmissibility);
}
