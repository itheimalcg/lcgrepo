package com.itheima.dao;

import com.itheima.domain.Items;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Package: com.itheima.dao
 * @author: lichangguo
 * @Description：
 * @date: 2018/12/20 20:02
 */
@Repository
public interface ItemsDao {
    public Items findById(Integer id);
    public List<Items>findAll();
}
