package cn.bdqn.HelloWorld;

import cn.bdqn.domain.User;
import cn.bdqn.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
    @Test
    public void testPerson() throws Exception{
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        UserService person=(UserService) ac.getBean("userServiceImpl");

        person.printUserDao();
    }
}
