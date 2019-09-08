package com.imooc.oa.entity;

import java.util.Date;
import com.alibaba.fastjson.JSON;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * (ClaimVoucher)表实体类
 *
 * @author Mr.Wang
 * @version 1.0
 * @since 2019/9/8 19:5
 */
@Table(name = "claim_voucher")
@Data
public class ClaimVoucher {

    
    @Id
    private Integer id;

    
    private String cause;

    
    private String createSn;

    
    private Date createTime;

    
    private String nextDealSn;

    
    private Double totalAmount;

    
    private String status;

}