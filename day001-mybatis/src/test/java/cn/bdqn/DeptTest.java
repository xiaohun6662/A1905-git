package cn.bdqn;

import cn.bdqn.domain.Dept;
import cn.bdqn.domain.Employee;
import cn.bdqn.mapper.DeptMapper;
import cn.bdqn.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class DeptTest {

    @Test
    public void testSelectById() throws Exception {
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        // 4、通过Mapper接口代理的方式去调用Mapper接口中的方法。
        DeptMapper deptMapper = session.getMapper(DeptMapper.class);

        Dept dept = deptMapper.selectById(2);
        System.out.println(dept);
        for (Employee emp : dept.getEmployeeList()) {
            System.out.println(emp);
        }

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();

    }

    @Test
    public void testSelectByIdSteps() throws Exception {
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        // 4、通过Mapper接口代理的方式去调用Mapper接口中的方法。
        DeptMapper deptMapper = session.getMapper(DeptMapper.class);

        Dept dept = deptMapper.selectByIdSteps(2);
        System.out.println(dept);
        for (Employee emp : dept.getEmployeeList()) {
            System.out.println(emp);
        }

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();

    }
}
