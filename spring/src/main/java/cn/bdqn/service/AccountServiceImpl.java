package cn.bdqn.service;

import cn.bdqn.dao.AccountDao;
import cn.bdqn.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service

public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Transactional
    public void transfer(Integer srcId, Integer destId, Integer money) {
        Account account = accountDao.selectById(srcId);
       Integer srcBalance= account.getBalance();
       account.setBalance(srcBalance-money);
       accountDao.updateById(account);

     Account destAccount=  accountDao.selectById(destId);
     Integer destBalance=destAccount.getBalance();
     destAccount.setBalance(destBalance+money);
accountDao.updateById(destAccount);
    }
    public Account login(String username,String pwd){
        return null;
    }
    public void register(Account account){

    }

    public Account getBalance(Integer id){
        return null;
    }
}
