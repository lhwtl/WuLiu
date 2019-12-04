package com.hlp.services;

import com.hlp.model.BasZoneinfo;

import java.util.List;

public interface BasZoneinfoService {
    public List<BasZoneinfo> selectBasZoneinfo();
    public int deleteBasZoneinfoZonecodets(short id);
    //添加
    public int insertBasZoneinfoZonecodets(BasZoneinfo basZoneinfo);
    //修改
    public int updateBasZoneinfoZonecodets(BasZoneinfo basZoneinfo);
   //根据结果集查询定区编码
    public List<BasZoneinfo> selectBasZoninfoJgjByts();
}
