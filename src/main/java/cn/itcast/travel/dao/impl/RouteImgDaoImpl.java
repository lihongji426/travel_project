package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.RouteImgDao;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.domain.RouteImg;
import cn.itcast.travel.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @Author:
 * @Date:
 * @Description:
 * @version:
 */
public class RouteImgDaoImpl implements RouteImgDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     * 根据route的id查询图片
     * @param rid
     * @return
     */
    @Override
    public List<RouteImg> findByRid(int rid) {
        String sql = "select * from tab_route_img where rid=?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<RouteImg>(RouteImg.class), rid);
    }
}
