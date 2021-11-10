package cn.bdqn.mapper;

import cn.bdqn.domain.Dept;

public interface DeptMapper {
    public Dept queryById(Integer id);
    public Dept selectById(Integer id);
    public Dept selectByIdSteps(Integer id);
}
