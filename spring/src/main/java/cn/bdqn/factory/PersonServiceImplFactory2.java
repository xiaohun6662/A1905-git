package cn.bdqn.factory;

import cn.bdqn.service.PersonServiceImpl;

public class PersonServiceImplFactory2 {
    public static PersonServiceImpl createBean(){
        return  new PersonServiceImpl();
    }
}
