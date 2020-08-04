package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Seller;

/**
 * @Author:
 * @Date:
 * @Description:
 * @version:
 */
public interface SellerDao {
    /**
     * 根据id查询卖家信息
     * @param id
     * @return
     */
    Seller findById(int id);
}
