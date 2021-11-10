package cn.bdqn.HelloWorld;

import cn.bdqn.domain.User;
import cn.bdqn.utils.Jdbcutils;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcutilsTest {
    @Test
    public void testPerson() throws Exception{
        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
       Jdbcutils person=(Jdbcutils) ac.getBean("jdbcutils");
       ac.close();
    }
}
