package com.hlp.services;

import com.hlp.model.BasDeliverystandard;

import java.util.List;
//收派标准表
public interface BasDeliverystandardService {

    //查询
   public List<BasDeliverystandard> selectBasDeliverystandardts();
   //添加
   public int insertBasDeliverystandardts(BasDeliverystandard bd);
   //删除
   public int deleteBasDeliverystandardts(short id);
   //byid
   public BasDeliverystandard selectBasDeliverystandardByidts(short id);

   public int updateBasDeliverystandardts(BasDeliverystandard basDeliverystandard);
}
