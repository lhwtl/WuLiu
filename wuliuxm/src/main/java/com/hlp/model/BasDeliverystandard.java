package com.hlp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

//收派标准表
public class BasDeliverystandard {
    private Short id;

    private String name;

    private Short minweight;

    private Short maxweight;

    private Short operatorid;//操作人员

    private Short operationunitid;//操作单位

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")

/*    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")*/
    private Date operationtime;//操作时间

    private String time;

    private Short cancel;//作废

    public Short getCancel() {
        return cancel;
    }

    public void setCancel(Short cancel) {
        this.cancel = cancel;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private SyEmp syEmps;//员工表一对一

    private SyUnits syUnitss;//单位表一对一

    public SyUnits getSyUnitss() {
        return syUnitss;
    }

    public void setSyUnitss(SyUnits syUnitss) {
        this.syUnitss = syUnitss;
    }

    public SyEmp getSyEmps() {
        return syEmps;
    }

    public void setSyEmps(SyEmp syEmps) {
        this.syEmps = syEmps;
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

    public Short getMinweight() {
        return minweight;
    }

    public void setMinweight(Short minweight) {
        this.minweight = minweight;
    }

    public Short getMaxweight() {
        return maxweight;
    }

    public void setMaxweight(Short maxweight) {
        this.maxweight = maxweight;
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
        return "BasDeliverystandard{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", minweight=" + minweight +
                ", maxweight=" + maxweight +
                ", operatorid=" + operatorid +
                ", operationunitid=" + operationunitid +
                ", operationtime=" + operationtime +
                ", time='" + time + '\'' +
                ", cancel=" + cancel +
                ", syEmps=" + syEmps +
                ", syUnitss=" + syUnitss +
                '}';
    }

    public BasDeliverystandard() {
    }

    public BasDeliverystandard(String name, Short minweight, Short maxweight, Short operatorid, Short operationunitid, Date operationtime, String time, Short cancel, SyEmp syEmps, SyUnits syUnitss) {
        this.name = name;
        this.minweight = minweight;
        this.maxweight = maxweight;
        this.operatorid = operatorid;
        this.operationunitid = operationunitid;
        this.operationtime = operationtime;
        this.time = time;
        this.cancel = cancel;
        this.syEmps = syEmps;
        this.syUnitss = syUnitss;
    }
}