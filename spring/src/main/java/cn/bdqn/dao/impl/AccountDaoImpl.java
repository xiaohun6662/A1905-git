package cn.bdqn.dao.impl;

import cn.bdqn.dao.AccountDao;
import cn.bdqn.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Account selectById(Integer id) {
        String sql = "select id,name,balance from t_account where id = ?";
        List<Account> accounts = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Account>(Account.class), id);
        return accounts.get(0);
    }

    @Override
    public void updateById(Account account) {
        String sql = "update t_account set balance = ? where id = ?";
        jdbcTemplate.update(sql, account.getBalance(), account.getId());
    }
}
