package com.hlp.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BasShuttlebus {
    private Short id;

    private Short linetype;

    private Short lineid;

    private String licenseplateint;

    private String carrier;

    private String models;

    private String driver;

    private String telephone;

    private Short ton;

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

    public Short getLinetype() {
        return linetype;
    }

    public void setLinetype(Short linetype) {
        this.linetype = linetype;
    }

    public Short getLineid() {
        return lineid;
    }

    public void setLineid(Short lineid) {
        this.lineid = lineid;
    }

    public String getLicenseplateint() {
        return licenseplateint;
    }

    public void setLicenseplateint(String licenseplateint) {
        this.licenseplateint = licenseplateint == null ? null : licenseplateint.trim();
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier == null ? null : carrier.trim();
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models == null ? null : models.trim();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public Short getTon() {
        return ton;
    }

    public void setTon(Short ton) {
        this.ton = ton;
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