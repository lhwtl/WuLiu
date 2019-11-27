package com.hlp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SorAbnormal {
    private Integer id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date launchdate;

    private String launchperson;

    private String launchcompany;

    private Short abnormaltype;

    private String transferint;

    private String cargoint;

    private String packageint;

    private Short hedgeabnint;

    private Short abostate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date handledate;

    /*异常表与入库表一对一*/
    private SorStorage sorStorage;

    public SorStorage getSorStorage() {
        return sorStorage;
    }

    public void setSorStorage(SorStorage sorStorage) {
        this.sorStorage = sorStorage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getLaunchdate() {
        return launchdate;
    }

    public void setLaunchdate(Date launchdate) {
        this.launchdate = launchdate;
    }

    public String getLaunchperson() {
        return launchperson;
    }

    public void setLaunchperson(String launchperson) {
        this.launchperson = launchperson;
    }

    public String getLaunchcompany() {
        return launchcompany;
    }

    public void setLaunchcompany(String launchcompany) {
        this.launchcompany = launchcompany;
    }

    public Short getAbnormaltype() {
        return abnormaltype;
    }

    public void setAbnormaltype(Short abnormaltype) {
        this.abnormaltype = abnormaltype;
    }

    public String getTransferint() {
        return transferint;
    }

    public void setTransferint(String transferint) {
        this.transferint = transferint;
    }

    public String getCargoint() {
        return cargoint;
    }

    public void setCargoint(String cargoint) {
        this.cargoint = cargoint;
    }

    public String getPackageint() {
        return packageint;
    }

    public void setPackageint(String packageint) {
        this.packageint = packageint;
    }

    public Short getHedgeabnint() {
        return hedgeabnint;
    }

    public void setHedgeabnint(Short hedgeabnint) {
        this.hedgeabnint = hedgeabnint;
    }

    public Short getAbostate() {
        return abostate;
    }

    public void setAbostate(Short abostate) {
        this.abostate = abostate;
    }

    public Date getHandledate() {
        return handledate;
    }

    public void setHandledate(Date handledate) {
        this.handledate = handledate;
    }

    public SorAbnormal() {
    }

    public SorAbnormal(Date launchdate, String launchperson, String launchcompany, Short abnormaltype, String transferint, String cargoint, String packageint, Short hedgeabnint, Short abostate, Date handledate) {
        this.launchdate = launchdate;
        this.launchperson = launchperson;
        this.launchcompany = launchcompany;
        this.abnormaltype = abnormaltype;
        this.transferint = transferint;
        this.cargoint = cargoint;
        this.packageint = packageint;
        this.hedgeabnint = hedgeabnint;
        this.abostate = abostate;
        this.handledate = handledate;
    }

    @Override
    public String toString() {
        return "SorAbnormal{" +
                "id=" + id +
                ", launchdate=" + launchdate +
                ", launchperson='" + launchperson + '\'' +
                ", launchcompany='" + launchcompany + '\'' +
                ", abnormaltype=" + abnormaltype +
                ", transferint='" + transferint + '\'' +
                ", cargoint='" + cargoint + '\'' +
                ", packageint='" + packageint + '\'' +
                ", hedgeabnint=" + hedgeabnint +
                ", abostate=" + abostate +
                ", handledate=" + handledate +
                '}';
    }
}