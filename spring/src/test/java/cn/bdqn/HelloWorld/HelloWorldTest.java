package cn.bdqn.HelloWorld;

import cn.bdqn.helloworld.HelloWorld;
import cn.bdqn.service.PersonServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloWorldTest {
    @Test
    public void testHelloWorld()throws Exception{
        ApplicationContext ac= new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld= (HelloWorld) ac.getBean("helloWorld");


        helloWorld.info();
    }
    @Test
    public void testpersonService()throws Exception{

        // 加载配置文件创建容器并不会导致bean的立即初始化
        Resource resource = new ClassPathResource("beans.xml");
        BeanFactory bf = new XmlBeanFactory(resource);

        // 只有再去真正要使用的某个bean的时候才会初始化
        PersonServiceImpl userService = (PersonServiceImpl) bf.getBean("personService");
        System.out.println(userService);
    }
    @Test
    public void testpersonServiceByFactory()throws Exception{

        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        PersonServiceImpl personService=(PersonServiceImpl) ac.getBean("personService");
        System.out.println(personService);
    }
    @Test
    public void testpersonServiceByFactory2()throws Exception{

        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        PersonServiceImpl personService=(PersonServiceImpl) ac.getBean("personService2");
        System.out.println(personService);
    }
    @Test
    public void testpersonServiceByFactorySingleton()throws Exception{

        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        PersonServiceImpl personService1=(PersonServiceImpl) ac.getBean("personService");
        PersonServiceImpl personService2=(PersonServiceImpl) ac.getBean("personService");
        PersonServiceImpl personService3=(PersonServiceImpl) ac.getBean("personService");
        System.out.println(personService1);
        System.out.println(personService2);
        System.out.println(personService3);
    }
    @Test
    public void testpersonServiceByFactorySingletonLife()throws Exception{

        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        PersonServiceImpl personService=(PersonServiceImpl) ac.getBean("personService");
        ac.close();
    }
}
