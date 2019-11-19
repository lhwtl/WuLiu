package com.hlp.model;

import java.util.Date;

public class SyUnits {
    private Short id;

    private String name;

    private String remarks;

    private Short operatorid;

    private Date operationtime;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Short getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Short operatorid) {
        this.operatorid = operatorid;
    }

    public Date getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }

    public SyUnits(String name, String remarks, Short operatorid, Date operationtime) {
        this.name = name;
        this.remarks = remarks;
        this.operatorid = operatorid;
        this.operationtime = operationtime;
    }

    public SyUnits() {
    }

    @Override
    public String toString() {
        return "SyUnits{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remarks='" + remarks + '\'' +
                ", operatorid=" + operatorid +
                ", operationtime=" + operationtime +
                '}';
    }
}