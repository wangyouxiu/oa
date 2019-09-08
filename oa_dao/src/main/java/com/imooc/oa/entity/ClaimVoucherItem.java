package com.imooc.oa.entity;

import com.alibaba.fastjson.JSON;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * (ClaimVoucherItem)表实体类
 *
 * @author Mr.Wang
 * @version 1.0
 * @since 2019/9/8 19:5
 */
@Table(name = "claim_voucher_item")
public class ClaimVoucherItem {

    
    @Id
    private Integer id;

    
    private Integer claimVoucherId;

    
    private String item;

    
    private Double amount;

    
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
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
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