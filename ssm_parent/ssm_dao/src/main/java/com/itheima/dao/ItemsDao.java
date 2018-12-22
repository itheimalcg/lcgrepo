package com.itheima.dao;

import com.itheima.domain.Items;
import org.springframework.stereotype.Repository;

/**
 * @Package: com.itheima.dao
 * @author: lichangguo
 * @Description：
 * @date: 2018/12/20 20:02
 */
@Repository
public interface ItemsDao {
    public Items findById(Integer id);
}
