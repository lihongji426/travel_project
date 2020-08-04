package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Route;

import java.util.List;

/**
 * @Author:
 * @Date:
 * @Description:
 * @version:
 */
public interface RouteDao {
    /**
     * 根据类别cid查询该类别下的总记录数
     * @param cid
     * @return
     */
    int findTotalCount(int cid, String rname);

    /**
     * 根据cid，start，pageSize查询当前页的数据集合
     * @param cid
     * @param start
     * @param pageSize
     * @return
     */
    List<Route> findByPage(int cid, int start, int pageSize, String rname);

    /**
     * 根据id查询
     * @param rid
     * @return
     */
    public Route findOne(int rid);
}
