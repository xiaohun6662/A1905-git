package cn.bdqn.HelloWorld;

import cn.bdqn.domain.Person;
import cn.bdqn.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void testPerson() throws Exception{
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        User person=(User) ac.getBean("user");
        System.out.println(person);
    }
}
