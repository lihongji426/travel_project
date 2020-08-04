package cn.itcast.travel.service;

import cn.itcast.travel.domain.User; /**
 * @Author:
 * @Date:
 * @Description:
 * @version:
 */
public interface UserService {
    /**
     * 注册用户
     * @param user
     * @return
     */
    boolean regist(User user);

    /**
     * 激活用户
     * @param code
     * @return
     */
    boolean active(String code);

    /**
     * 登录功能
     * @param user
     * @return
     */
    User login(User user);
}
