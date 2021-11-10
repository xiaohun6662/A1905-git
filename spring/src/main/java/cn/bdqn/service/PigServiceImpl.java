package cn.bdqn.service;

import cn.bdqn.domain.Pig;
import org.springframework.stereotype.Service;

@Service
public class PigServiceImpl implements PigService{
    @Override
    public void save(Pig pig) {
        System.out.println("保存了一个猪");
    }

    @Override
    public void update(Pig pig) {
        System.out.println("更新了一个猪");
    }

    @Override
    public Pig queryById(Integer id) {
        System.out.println("找到了一个猪");
        return new Pig();
    }

    @Override
    public Pig queryByNameAndSex(String name, String sex) {
        System.out.println("找到了一个豪猪");
        return new Pig();
    }
}
