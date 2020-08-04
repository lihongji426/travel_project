package cn.itcast.travel.service;

import cn.itcast.travel.domain.Category;

import java.util.List;

/**
 * @Author:
 * @Date:
 * @Description:
 * @version:
 */
public interface CategoryService {
    /**
     * 查询分类列表数据，实现前台页面的分类显示
     * @return
     */
    List<Category> findAll();
}
