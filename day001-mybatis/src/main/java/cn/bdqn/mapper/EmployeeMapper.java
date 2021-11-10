package cn.bdqn.mapper;

import cn.bdqn.domain.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
    public Employee queryById(Integer id);
    public void save(Employee employee);
    public Employee queryByNameAndSex(@Param("empName") String empName, @Param("sex") String sex);
    public Employee queryByNameAndSex_2(Employee employee);
    public Employee queryByNameAndSex_3(Map<String,Object> params);
    public List<Employee> queryByNameAndSex_4(List<Integer> ids);
    public List<Employee> queryByNameAndSex_5(Integer[] ids);
    public Map<String,Object> queryByIdReturnMap(Integer id);
    public List<Map<String,Object>> queryByNameAndSex_6(Integer[] ids);
    @MapKey("id")
    public Map<Integer,Employee> queryByNameAndSex_7(Integer[] ids);

    // 根据员工id查询员工
    public Employee queryByIdAndDept(Integer id);
    public Employee queryByIdAndDept_2(Integer id);
    public Employee queryByIdAndDept_3(Integer id);
    public List<Employee> queryByDeptId(Integer deptId);
    public List<Employee> queryByCondition(Employee employee);
    public void updateById(Employee employee);
    public List<Employee> queryByIdForEach(Integer[] ids);
    public List<Employee> queryByIds_ForEach(List<Integer> ids);
    public List<Employee> queryByMap(Map<String,Object> paramMap);
    // 批量保存员工
    public void insertBatch(@Param("employees") List<Employee> employees);
    public void insertBatch_2(@Param("employees") List<Employee> employees);
}
