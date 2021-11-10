package cn.bdqn.HelloWorld;

import cn.bdqn.domain.Cat;
import cn.bdqn.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CatTest {
    @Test
    public void testPerson() throws Exception{
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        Cat cat=(Cat) ac.getBean("cat");
        System.out.println(cat);
    }
}
