package com.imooc.oa.entity;

import java.util.Date;
import com.alibaba.fastjson.JSON;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * (DealRecord)表实体类
 *
 * @author Mr.Wang
 * @version 1.0
 * @since 2019/9/8 19:5
 */
@Table(name = "deal_record")
public class DealRecord {

    
    @Id
    private Integer id;

    
    private Integer claimVoucherId;

    
    private String dealSn;

    
    private Date dealTime;

    
    private String dealWay;

    
    private String dealResult;

    
    private String comment;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getClaimVoucherId() {
        return claimVoucherId;
    }
    public void setClaimVoucherId(Integer claimVoucherId) {
        this.claimVoucherId = claimVoucherId;
    }
    public String getDealSn() {
        return dealSn;
    }
    public void setDealSn(String dealSn) {
        this.dealSn = dealSn;
    }
    public Date getDealTime() {
        return dealTime;
    }
    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }
    public String getDealWay() {
        return dealWay;
    }
    public void setDealWay(String dealWay) {
        this.dealWay = dealWay;
    }
    public String getDealResult() {
        return dealResult;
    }
    public void setDealResult(String dealResult) {
        this.dealResult = dealResult;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}