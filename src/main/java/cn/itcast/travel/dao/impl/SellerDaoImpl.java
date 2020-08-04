package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.SellerDao;
import cn.itcast.travel.domain.Seller;
import cn.itcast.travel.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Author:
 * @Date:
 * @Description:
 * @version:
 */
public class SellerDaoImpl implements SellerDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public Seller findById(int id) {
        String sql = "select * from tab_seller where sid=?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Seller>(Seller.class), id);
    }
}
