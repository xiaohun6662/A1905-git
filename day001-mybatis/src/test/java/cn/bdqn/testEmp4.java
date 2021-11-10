package cn.bdqn;

import cn.bdqn.domain.Employee;
import cn.bdqn.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testEmp4 {

    @Test
    public void testSelectById() throws Exception {
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        // 4、通过Mapper接口代理的方式去调用Mapper接口中的方法。
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        Employee emp = new Employee();
        emp.setEmpName("xxx");
        emp.setSex("女");
        List<Employee> employeeList = employeeMapper.queryByCondition(emp);

        System.out.println(employeeList);
        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();

    }
    @Test
    public void testUpdateById() throws Exception {
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        // 4、通过Mapper接口代理的方式去调用Mapper接口中的方法。
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        Employee emp = new Employee();
       emp.setId(3);
       emp.setEmpName("YYYY");
       emp.setEmail("yyy@qq.com");
      employeeMapper.updateById(emp);
session.commit();
        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();

    }
    @Test
    public void testQueryById_ForEach() throws Exception {
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        // 4、通过Mapper接口代理的方式去调用Mapper接口中的方法。
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        Employee emp = new Employee();
       Integer[] ids={1,3,4,5};
       List<Employee> employeeList= employeeMapper.queryByIdForEach(ids);
        System.out.println(employeeList);
        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();

    }
    @Test
    public void testQueryByIds_ForEach() throws Exception {
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        // 4、通过Mapper接口代理的方式去调用Mapper接口中的方法。
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        Employee emp = new Employee();
      List<Integer> ids=new ArrayList<>();
      ids.add(1);
      ids.add(3);
        List<Employee> employeeList= employeeMapper.queryByIds_ForEach(ids);
        System.out.println(employeeList);
        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();

    }
    @Test
    public void testQueryByMap() throws Exception {
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        // 4、通过Mapper接口代理的方式去调用Mapper接口中的方法。
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        List<Integer> ids=new ArrayList<>();
        ids.add(1);
        ids.add(3);
     String sex="男";
        Map<String,Object> msp=new HashMap<>();
      msp.put("ids",ids);
      msp.put("sex",sex);
        List<Employee> employeeList= employeeMapper.queryByMap(msp);
        System.out.println(employeeList);
        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();

    }
    @Test
    public void testInsertBatch() throws Exception {
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        // 4、通过Mapper接口代理的方式去调用Mapper接口中的方法。
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        List<Employee> ids=new ArrayList<>();
      Employee employee=new Employee();
      employee.setEmpName("Css");
      employee.setSex("男");
      Employee employee1=new Employee();
        employee1.setEmpName("javascript");
        employee1.setSex("女");
        ids.add(employee);
        ids.add(employee1);
       employeeMapper.insertBatch(ids);
        session.commit();
        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();

    }
    @Test
    public void testInsertBatch_2() throws Exception {
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        // 4、通过Mapper接口代理的方式去调用Mapper接口中的方法。
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        List<Employee> ids=new ArrayList<>();
        Employee employee=new Employee();
        employee.setEmpName("ES6");
        employee.setSex("男");
        Employee employee1=new Employee();
        employee1.setEmpName("VUe");
        employee1.setSex("女");
        ids.add(employee);
        ids.add(employee1);
        employeeMapper.insertBatch_2(ids);
        session.commit();
        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();

    }
}
