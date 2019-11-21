package com.hlp.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BasBasicarchives {
    private Short id;

    private String name;

    private Short grade;

    private String remarks;

    private Short operatorid;

    private Short operationunitid;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date operationtime;

    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private SyEmp syEmp;//员工表

    private SyUnits syUnits;//单位表

    public SyEmp getSyEmp() {
        return syEmp;
    }

    public void setSyEmp(SyEmp syEmp) {
        this.syEmp = syEmp;
    }

    public SyUnits getSyUnits() {
        return syUnits;
    }

    public void setSyUnits(SyUnits syUnits) {
        this.syUnits = syUnits;
    }

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

    public Short getGrade() {
        return grade;
    }

    public void setGrade(Short grade) {
        this.grade = grade;
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

    public Short getOperationunitid() {
        return operationunitid;
    }

    public void setOperationunitid(Short operationunitid) {
        this.operationunitid = operationunitid;
    }

    public Date getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }
}