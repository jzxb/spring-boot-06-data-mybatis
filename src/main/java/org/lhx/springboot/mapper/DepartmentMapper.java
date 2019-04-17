package org.lhx.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lhx.springboot.bean.Department;

/**
 * @author lhx
 * @date 2019/4/17 - 13:33
 */
@Mapper
public interface DepartmentMapper {

    public Department getDeptById(Integer id);

    public int deleteDeptById(Integer id);

    public int insertDept(Department department);

    public int updateDept(Department department);
}
