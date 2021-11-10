package cn.bdqn.factory;

import cn.bdqn.service.PersonServiceImpl;

public class PersonServiceImplFactory {
    public PersonServiceImpl createBean(){
        return  new PersonServiceImpl();
    }
}
