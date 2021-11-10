package cn.bdqn.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component //纳入spring管理
@Aspect //标识切面类
public class PrivilegeAspect {

    @Before("execution(* cn.bdqn.service.PigServiceImpl.*(..))")
    public void beforePrintLog(){
        System.out.println("前置通知----beforePrintLog---开始权限判断啦");
    }

}
