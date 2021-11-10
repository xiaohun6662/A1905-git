package cn.bdqn.HelloWorld;

import cn.bdqn.domain.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
    @Test
    public void testPerson() throws Exception{
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        Person person=(Person) ac.getBean("person");
        System.out.println(person);
    }
}
