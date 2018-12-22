package com.itheima.service;

import com.itheima.domain.Items;

import java.util.List;

/**
 * @Package: com.itheima.service
 * @author: lichangguo
 * @Description：
 * @date: 2018/12/20 20:04
 */
public interface ItemsService {
   public Items findById(Integer id);
   public List<Items>findAll();
}
