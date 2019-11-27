package com.cn.pojo;

import java.util.Date;

public class PayInfo {
    private Integer id;

    private Integer userId;

    private Long orderNo;

    private Integer payPaltform;

    private String palyformNumber;

    private String palyformStatus;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getPayPaltform() {
        return payPaltform;
    }

    public void setPayPaltform(Integer payPaltform) {
        this.payPaltform = payPaltform;
    }

    public String getPalyformNumber() {
        return palyformNumber;
    }

    public void setPalyformNumber(String palyformNumber) {
        this.palyformNumber = palyformNumber == null ? null : palyformNumber.trim();
    }

    public String getPalyformStatus() {
        return palyformStatus;
    }

    public void setPalyformStatus(String palyformStatus) {
        this.palyformStatus = palyformStatus == null ? null : palyformStatus.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}