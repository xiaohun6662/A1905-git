package cn.bdqn.dao;

import cn.bdqn.domain.Account;

public interface AccountDao {
    public Account selectById(Integer id);

    public void updateById(Account account);
}
