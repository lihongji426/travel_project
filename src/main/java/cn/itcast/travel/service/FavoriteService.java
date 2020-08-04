package cn.itcast.travel.service;

/**
 * @Author:
 * @Date:
 * @Description:
 * @version:
 */
public interface FavoriteService {
    /**
     * 判断是否收藏
     * @param rid
     * @param uid
     * @return
     */
    boolean isFavorite(String rid, int uid);

    /**
     * 添加收藏
     * @param rid
     * @param uid
     */
    void add(String rid, int uid);
}
