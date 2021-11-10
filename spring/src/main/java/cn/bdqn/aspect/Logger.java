package cn.bdqn.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

//日志
public class Logger {
    public Object aroundPrintLog(ProceedingJoinPoint pjp){
        Object result=null;
        try{
           Object[] args= pjp.getArgs();
           if (args!=null && args.length>0){
               for (Object arg:args){
                   System.out.println(arg);
               }
           }
String method=pjp.getSignature().getName();
            System.out.println("方法名称"+method);
            System.out.println("前置通知的代码执行了xd");
           result=pjp.proceed();
            System.out.println("后置通知执行了");
        }catch (Throwable e){
        e.printStackTrace();
            System.out.println("异常通知执行了兄弟");
        }finally {
            System.out.println("最终通知执行了兄弟");
        }
        return result;
    }
    //功能的增强
    public void beforePrintLog(){
        System.out.println("前置通知(beforePrintLog)：开始打印日志啦");
    }
    //  该方法的作用是在切入点方法执行之后执行
    public void afterReturningPrintLog(){
        System.out.println("后置通知(afterReturningPrintLog)：业务方法执行完了，日志打印");
    }

    //  该方法的作用是在切入点方法执行出错后执行
    public void afterThrowingPrintLog(){
        System.out.println("异常通知(afterThrowingPrintLog)：业务方法出现异常了，日志打印");
    }

    //  该方法的作用是在切入点方法执行之后不管有没有错误，都最终要执行
    public void afterPrintLog(){
        System.out.println("最终通知(afterPrintLog)：业务方法不管有没有异常了，日志打印");
    }
}
