package com.hlp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class BasShuttlebus {
    private Short id;

    private Short linetype;//线路类型

    private Short lineid;//线路

    private String licenseplateint;//车牌号

    private String carrier;//承运商

    private String models;//车型

    private String driver;//司机

    private String telephone;//电话

    private Short ton;//吨控

    private String remarks;//备注

    private Short operatorid;//操作人员

    private Short operationunitid;//操作单位
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date operationtime;//操作时间

    private String time;
    private List<LogTrack> logTracks;

    public void setLogTracks(List<LogTrack> logTracks) {
        this.logTracks = logTracks;
    }

    public List<LogTrack> getLogTracks() {
        return logTracks;
    }

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

    @Override
    public String toString() {
        return "BasShuttlebus{" +
                "id=" + id +
                ", linetype=" + linetype +
                ", lineid=" + lineid +
                ", licenseplateint='" + licenseplateint + '\'' +
                ", carrier='" + carrier + '\'' +
                ", models='" + models + '\'' +
                ", driver='" + driver + '\'' +
                ", telephone='" + telephone + '\'' +
                ", ton=" + ton +
                ", remarks='" + remarks + '\'' +
                ", operatorid=" + operatorid +
                ", operationunitid=" + operationunitid +
                ", operationtime=" + operationtime +
                ", time='" + time + '\'' +
                ", logTracks=" + logTracks +
                ", syEmp=" + syEmp +
                ", syUnits=" + syUnits +
                '}';
    }

    public BasShuttlebus() {
    }

    public BasShuttlebus(Short linetype, Short lineid, String licenseplateint, String carrier, String models, String driver, String telephone, Short ton, String remarks, Short operatorid, Short operationunitid, Date operationtime, String time, List<LogTrack> logTracks, SyEmp syEmp, SyUnits syUnits) {
        this.linetype = linetype;
        this.lineid = lineid;
        this.licenseplateint = licenseplateint;
        this.carrier = carrier;
        this.models = models;
        this.driver = driver;
        this.telephone = telephone;
        this.ton = ton;
        this.remarks = remarks;
        this.operatorid = operatorid;
        this.operationunitid = operationunitid;
        this.operationtime = operationtime;
        this.time = time;
        this.logTracks = logTracks;
        this.syEmp = syEmp;
        this.syUnits = syUnits;
    }
}