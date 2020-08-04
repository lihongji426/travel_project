package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Favorite;

/**
 * @Author:
 * @Date:
 * @Description:
 * @version:
 */
public interface FavoriteDao {
    /**
     * 根据rid和uid查询收藏信息
     * @param rid
     * @param uid
     * @return
     */
    Favorite findByRidAndUid(int rid, int uid);

    /**
     * 根据rid查询被收藏的次数
     * @param rid
     * @return
     */
    int findCountByRid(int rid);

    /**
     * 添加收藏
     * @param i
     * @param uid
     */
    void add(int i, int uid);
}
