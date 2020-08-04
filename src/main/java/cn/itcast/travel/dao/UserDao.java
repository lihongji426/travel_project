package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

/**
 * @Author:
 * @Date:
 * @Description:
 * @version:
 */
public interface UserDao {
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    User findByUsername(String username);

    /**
     * 用户保存
     * @param user
     */
    void save(User user);

    /**
     * 根据激活码查询用户
     * @param code
     * @return
     */
    User findByCode(String code);

    /**
     * 修改用户的激活状态
     * @param user
     */
    void updateStatus(User user);

    /**
     * 根据用户名和密码查询用户信息
     * @param user
     * @return
     */
    User findByUsernameAndPassword(String username, String password);
}
