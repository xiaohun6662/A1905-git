package cn.bdqn.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransctionAscpet {
    @Pointcut("execution(* cn.bdqn.service.PigServiceImpl.*(..))")
    private void pointCut(){};

    @Before("pointCut()")
    public void beginTx(){
        System.out.println("前置增强");
    }
    @AfterReturning("pointCut()")
    public void commitTx(){
        System.out.println("提交事务");
    }
}
