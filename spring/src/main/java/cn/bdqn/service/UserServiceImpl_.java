package cn.bdqn.service;

import cn.bdqn.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class UserServiceImpl_ implements UserService{

    @Autowired
    @Qualifier("userDao2")
    private UserDao userDao;


    @Override
    public void printUserDao() {
        System.out.println("userDao--->"+userDao);
    }


}
