package com.imooc.oa.entity;

import com.alibaba.fastjson.JSON;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * (Employee)表实体类
 *
 * @author Mr.Wang
 * @version 1.0
 * @since 2019/9/8 19:5
 */
@Table(name = "employee")
public class Employee {

    
    @Id
    private String sn;

    
    private String password;

    
    private String name;

    
    private String departmentSn;

    
    private String post;

    public String getSn() {
        return sn;
    }
    public void setSn(String sn) {
        this.sn = sn;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartmentSn() {
        return departmentSn;
    }
    public void setDepartmentSn(String departmentSn) {
        this.departmentSn = departmentSn;
    }
    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}