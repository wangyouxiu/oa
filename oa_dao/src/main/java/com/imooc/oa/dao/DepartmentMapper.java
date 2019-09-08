package com.imooc.oa.dao;

import com.yhxd.bgn.common.dao.IMapper;
import com.imooc.oa.entity.Department;
import com.imooc.oa.query.DepartmentQuery;
import org.springframework.stereotype.Repository;

/**
* (Department)表Mapper类
*
* @author Mr.Wang
* @version 1.0
* @since 2019/9/8 18:56
*/
@Repository
public interface DepartmentMapper extends IMapper<Department,DepartmentQuery> {

}