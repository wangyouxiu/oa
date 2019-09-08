package com.imooc.oa.entity;

import com.alibaba.fastjson.JSON;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * (Department)表实体类
 *
 * @author Mr.Wang
 * @version 1.0
 * @since 2019/9/8 19:5
 */
@Table(name = "department")
public class Department {

    
    @Id
    private String sn;

    
    private String name;

    
    private String address;

    public String getSn() {
        return sn;
    }
    public void setSn(String sn) {
        this.sn = sn;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}