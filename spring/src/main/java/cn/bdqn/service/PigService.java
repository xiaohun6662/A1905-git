package cn.bdqn.service;

import cn.bdqn.domain.Pig;

public interface PigService {
    public void save(Pig pig);
    public void update(Pig pig);
    public Pig queryById(Integer id);
    public Pig queryByNameAndSex(String name,String sex);
}
