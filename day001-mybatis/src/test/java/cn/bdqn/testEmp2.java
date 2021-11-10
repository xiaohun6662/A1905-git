package cn.bdqn;

import cn.bdqn.domain.Employee;
import cn.bdqn.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.*;

public class testEmp2 {

       @Test
    public void testSelectById() throws Exception{
           // 1、读取mybatis主配置文件
           InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
           // 2、根据配置文件创建SqlSessionFactory
           SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
           // 3、用SqlSessionFactory工厂去创建SqlSession
           SqlSession session = factory.openSession();
           EmployeeMapper employeeMapper= session.getMapper(EmployeeMapper.class);
          Employee employee=employeeMapper.queryById(1);
           System.out.println(employee);

session.close();

    }
    @Test
    public void testSave() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();
        EmployeeMapper employeeMapper= session.getMapper(EmployeeMapper.class);
        Employee employee=new Employee();
        employee.setEmpName("qq");
        employee.setAddress("zz");
        employee.setEmail("xx@qq.com");
        employee.setBirthday(new Date());
        employee.setSex("女");
       employeeMapper.save(employee);
session.commit();
        session.close();

    }
    @Test
    public void testqueryByNameAndSex() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();
        EmployeeMapper employeeMapper= session.getMapper(EmployeeMapper.class);
       Employee employee=employeeMapper.queryByNameAndSex("qq","女");
        System.out.println(employee);

        session.close();

    }
    @Test
    public void testqueryByNameAndSex_2() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();
        EmployeeMapper employeeMapper= session.getMapper(EmployeeMapper.class);
        Employee emp=new Employee();
        emp.setEmpName("qq");
        emp.setSex("女");
        Employee employee=employeeMapper.queryByNameAndSex_2(emp);
        System.out.println(employee);

        session.close();

    }
    @Test
    public void testqueryByNameAndSex_3() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();
        EmployeeMapper employeeMapper= session.getMapper(EmployeeMapper.class);
        Map<String,Object> maps=new HashMap<>();
        maps.put("empName","qq");
        maps.put("sex","女");
        Employee employee=employeeMapper.queryByNameAndSex_3(maps);
        System.out.println(employee);

        session.close();

    }
    @Test
    public void testqueryByNameAndSex_4() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();
        EmployeeMapper employeeMapper= session.getMapper(EmployeeMapper.class);
     List<Integer> list=new ArrayList<>();
     list.add(1);
     list.add(4);
       List<Employee>  employee=employeeMapper.queryByNameAndSex_4(list);
        System.out.println(employee);

        session.close();

    }
    @Test
    public void testqueryByNameAndSex_5() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();
        EmployeeMapper employeeMapper= session.getMapper(EmployeeMapper.class);
        Integer[] ids ={1,4};
        List<Employee>  employee=employeeMapper.queryByNameAndSex_5(ids);
        System.out.println(employee);

        session.close();

    }
    @Test
    public void testqueryByIdReturnMap() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();
        EmployeeMapper employeeMapper= session.getMapper(EmployeeMapper.class);
       Map<String,Object> employee=employeeMapper.queryByIdReturnMap(1);
        System.out.println(employee);

        session.close();

    }
    @Test
    public void testqueryByNameAndSex_6() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();
        EmployeeMapper employeeMapper= session.getMapper(EmployeeMapper.class);
        Integer[] ids ={1,4};
        List<Map<String,Object>>  employee=employeeMapper.queryByNameAndSex_6(ids);
        System.out.println(employee);

        session.close();

    }
    @Test
    public void testqueryByNameAndSex_7() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();
        EmployeeMapper employeeMapper= session.getMapper(EmployeeMapper.class);
        Integer[] ids ={1,4};
        Map<Integer,Employee> employee=employeeMapper.queryByNameAndSex_7(ids);
        System.out.println(employee);

        session.close();

    }
    @Test
    public void testqueryByIdAndDept() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();
        EmployeeMapper employeeMapper= session.getMapper(EmployeeMapper.class);

        Employee employee=employeeMapper.queryByIdAndDept(4);
        System.out.println(employee);
       // System.out.println(employee.getDeptId());
        //System.out.println(employee.getDeptName());
        session.close();

    }
    @Test
    public void testqueryByIdAndDept_2() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();
        EmployeeMapper employeeMapper= session.getMapper(EmployeeMapper.class);

        Employee employee=employeeMapper.queryByIdAndDept_2(3);
        System.out.println(employee);
         System.out.println(employee.getDept().getId());
        System.out.println(employee.getDept().getDeptName());
        session.close();

    }
    @Test
    public void testqueryByIdAndDept_3() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();
        EmployeeMapper employeeMapper= session.getMapper(EmployeeMapper.class);

        Employee employee=employeeMapper.queryByIdAndDept_3(4);
        System.out.println(employee);
        System.out.println(employee.getDept().getId());
        System.out.println(employee.getDept().getDeptName());
        session.close();

    }
}
