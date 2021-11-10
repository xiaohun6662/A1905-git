package cn.bdqn.domain;

import java.util.List;

public class Dept {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    // 部门id
    private Integer id;



    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                "deptName='" + deptName + '\'' +
                '}';
    }

    // 部门名称
    private String deptName;

    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
