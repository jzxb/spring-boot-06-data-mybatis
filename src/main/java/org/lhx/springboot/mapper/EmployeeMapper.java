package org.lhx.springboot.mapper;

import org.lhx.springboot.bean.Employee;

/**
 * @author lhx
 * @date 2019/4/17 - 13:49
 */
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
