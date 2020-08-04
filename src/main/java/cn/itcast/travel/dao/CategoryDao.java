package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Category;

import java.util.List;

/**
 * @Author:
 * @Date:
 * @Description:
 * @version:
 */
public interface CategoryDao {
    /**
     * 查询所有分类列表
     * @return
     */
    List<Category> findAll();
}
