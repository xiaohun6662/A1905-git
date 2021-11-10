package cn.bdqn;

import cn.bdqn.domain.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class testEmp {

       @Test
    public void testSelectAll() throws Exception{
           // 1、读取mybatis主配置文件
           InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
           // 2、根据配置文件创建SqlSessionFactory
           SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
           // 3、用SqlSessionFactory工厂去创建SqlSession
           SqlSession session = factory.openSession();

           List<Employee> employees=session.selectList("cn.bdqn.mapper.EmployeeMapper.selectAll");
           for(Employee emp:employees){
               System.out.println(emp);
           }
session.close();

    }
    @Test
    public void testSelectById() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        Employee employees=session.selectOne("cn.bdqn.mapper.EmployeeMapper.selectById",1);
        System.out.println(employees);
        session.close();

    }
    @Test
    public void testSelectsByLikeName1() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        List<Employee> employees=session.selectList("cn.bdqn.mapper.EmployeeMapper.selectByLikeName1","%hello%");
        for(Employee emp:employees){
            System.out.println(emp);
        }
        session.close();

    }
    @Test
    public void testSelectsByLikeName2() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        List<Employee> employees=session.selectList("cn.bdqn.mapper.EmployeeMapper.selectByLikeName2","hello");
        for(Employee emp:employees){
            System.out.println(emp);
        }
        session.close();

    }
    @Test
    public void testSelectsByLikeName3() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        List<Employee> employees=session.selectList("cn.bdqn.mapper.EmployeeMapper.selectByLikeName3","hello");
        for(Employee emp:employees){
            System.out.println(emp);
        }
        session.close();

    }
    @Test
    public void testSelectsByLikeName4() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        List<Employee> employees=session.selectList("cn.bdqn.mapper.EmployeeMapper.selectByLikeName4","hello");
        for(Employee emp:employees){
            System.out.println(emp);
        }
        session.close();

    }
    @Test
    public void testInsert() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);
Employee employee=new Employee();
employee.setEmpName("芜湖");
employee.setAddress("新乡");
employee.setBirthday(new Date());
employee.setEmail("qif@qq.com");
employee.setSex("男");
      session.insert("cn.bdqn.mapper.EmployeeMapper.insert",employee);
      //session.commit();
        session.close();

    }
    @Test
    public void testDeleteById() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

      session.delete("cn.bdqn.mapper.EmployeeMapper.deleteById",2);
        session.commit();
        session.close();

    }
    @Test
    public void testUpdateById() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);
        Employee employee=new Employee();
        employee.setId(1);
        employee.setEmpName("yaangpeng");
        employee.setAddress("新乡");
        employee.setBirthday(new Date());
        employee.setEmail("qif@qq.com");
        employee.setSex("男");
        session.update("cn.bdqn.mapper.EmployeeMapper.updateById",employee);
        //session.commit();
        session.close();

    }
}
