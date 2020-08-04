package cn.itcast.travel.dao;

import cn.itcast.travel.domain.RouteImg;

import java.util.List;

/**
 * @Author:
 * @Date:
 * @Description:
 * @version:
 */
public interface RouteImgDao {
    /**
     * 根据route的id查询图片
     * @param rid
     * @return
     */
    List<RouteImg> findByRid(int rid);
}
