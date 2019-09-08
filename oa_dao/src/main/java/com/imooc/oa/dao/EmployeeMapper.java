package com.imooc.oa.dao;

import com.yhxd.bgn.common.dao.IMapper;
import com.imooc.oa.entity.Employee;
import com.imooc.oa.query.EmployeeQuery;
import org.springframework.stereotype.Repository;

/**
* (Employee)表Mapper类
*
* @author Mr.Wang
* @version 1.0
* @since 2019/9/8 18:56
*/
@Repository
public interface EmployeeMapper extends IMapper<Employee,EmployeeQuery> {

}