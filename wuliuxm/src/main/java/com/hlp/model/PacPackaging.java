package com.hlp.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class PacPackaging {
    private Short id;

    private String itemcode;

    private String itemname;

    private Short plannedprice;

    private String specifications;

    private Short type;

    private String measurementunit;

    private Short status;

    private Short operatorid;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date operationtime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date invalidatejobint;

    private Short invalidatename;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date invalidatetime;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode == null ? null : itemcode.trim();
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public Short getPlannedprice() {
        return plannedprice;
    }

    public void setPlannedprice(Short plannedprice) {
        this.plannedprice = plannedprice;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getMeasurementunit() {
        return measurementunit;
    }

    public void setMeasurementunit(String measurementunit) {
        this.measurementunit = measurementunit == null ? null : measurementunit.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
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

    public Date getInvalidatejobint() {
        return invalidatejobint;
    }

    public void setInvalidatejobint(Date invalidatejobint) {
        this.invalidatejobint = invalidatejobint;
    }

    public Short getInvalidatename() {
        return invalidatename;
    }

    public void setInvalidatename(Short invalidatename) {
        this.invalidatename = invalidatename;
    }

    public Date getInvalidatetime() {
        return invalidatetime;
    }

    public void setInvalidatetime(Date invalidatetime) {
        this.invalidatetime = invalidatetime;
    }

    @Override
    public String toString() {
        return "PacPackaging{" +
                "id=" + id +
                ", itemcode='" + itemcode + '\'' +
                ", itemname='" + itemname + '\'' +
                ", plannedprice=" + plannedprice +
                ", specifications='" + specifications + '\'' +
                ", type=" + type +
                ", measurementunit='" + measurementunit + '\'' +
                ", status=" + status +
                ", operatorid=" + operatorid +
                ", operationtime=" + operationtime +
                ", invalidatejobint=" + invalidatejobint +
                ", invalidatename=" + invalidatename +
                ", invalidatetime=" + invalidatetime +
                '}';
    }
}