package cn.bdqn.HelloWorld;

import cn.bdqn.domain.Cat;
import cn.bdqn.service.DogService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DogServiceTest {
    @Test
    public void testPerson() throws Exception{
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        DogService cat=(DogService) ac.getBean("dogService");
        System.out.println(cat);
    }
}
