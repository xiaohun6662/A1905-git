package cn.bdqn.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
@Scope("prototype")
public class Jdbcutils {
    public  Jdbcutils(){
        System.out.println("jdbc创建好了");
    }

    public void init(){
        System.out.println("对象初始化了");
    }

//    @PreDestroy
    public void destroy(){
        System.out.println("对象销毁了");
    }
    @Value("${driverClass}")
    private String driverClass;
    @Value("${port}")
    private Integer port;

    public void info(){
        System.out.println(driverClass+port);
    }
}
