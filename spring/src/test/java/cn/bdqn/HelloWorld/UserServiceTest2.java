package cn.bdqn.HelloWorld;

import cn.bdqn.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:beans.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest2 {

@Autowired
    private UserService userService;

    @Test
    public void testUserService() throws Exception{
userService.printUserDao();
    }
}
