package cn.bdqn.service;

public class PersonServiceImpl {

    public PersonServiceImpl(){
        System.out.println("PersonServiceImpl创建好了");
    }
    public void init(){
        System.out.println("对象初始化了");
    }

    public void destroy(){
        System.out.println("对象销毁了");
    }
}
