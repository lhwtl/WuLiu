package com.hlp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BasStandartime {
    private Short id;

    private String timename;//时间名称

    private Short subordinateunit;//所属单位
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date workingtime;//平时上班时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date closingtime;//平时下班时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date saturdayworkingtime;//周六上班时间
    public SyUnits getSyUnits() {
        return syUnits;
    }

    public void setSyUnits(SyUnits syUnits) {
        this.syUnits = syUnits;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date saturdayclosingtime;//周六下班时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date sundayworkingtime;//周日上班时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date sundayclosingtime;//周日下班时间
    private SyUnits syUnits;
    public Short getId() {
        return id;
    }
    public void setId(Short id) {
        this.id = id;
    }
    public String getTimename() {
        return timename;
    }
    public void setTimename(String timename) {
        this.timename = timename == null ? null : timename.trim();
    }
    public Short getSubordinateunit() {
        return subordinateunit;
    }

    public void setSubordinateunit(Short subordinateunit) {
        this.subordinateunit = subordinateunit;
    }

    public Date getWorkingtime() {
        return workingtime;
    }

    public void setWorkingtime(Date workingtime) {
        this.workingtime = workingtime;
    }

    public Date getClosingtime() {
        return closingtime;
    }

    public void setClosingtime(Date closingtime) {
        this.closingtime = closingtime;
    }

    public Date getSaturdayworkingtime() {
        return saturdayworkingtime;
    }

    public void setSaturdayworkingtime(Date saturdayworkingtime) {
        this.saturdayworkingtime = saturdayworkingtime;
    }

    public Date getSaturdayclosingtime() {
        return saturdayclosingtime;
    }

    public void setSaturdayclosingtime(Date saturdayclosingtime) {
        this.saturdayclosingtime = saturdayclosingtime;
    }

    public Date getSundayworkingtime() {
        return sundayworkingtime;
    }

    public void setSundayworkingtime(Date sundayworkingtime) {
        this.sundayworkingtime = sundayworkingtime;
    }

    public Date getSundayclosingtime() {
        return sundayclosingtime;
    }

    public void setSundayclosingtime(Date sundayclosingtime) {
        this.sundayclosingtime = sundayclosingtime;
    }

    @Override
    public String toString() {
        return "BasStandartime{" +
                "id=" + id +
                ", timename='" + timename + '\'' +
                ", subordinateunit=" + subordinateunit +
                ", workingtime=" + workingtime +
                ", closingtime=" + closingtime +
                ", saturdayworkingtime=" + saturdayworkingtime +
                ", saturdayclosingtime=" + saturdayclosingtime +
                ", sundayworkingtime=" + sundayworkingtime +
                ", sundayclosingtime=" + sundayclosingtime +
                ", syUnits=" + syUnits +
                '}';
    }

    public BasStandartime() {
    }

    public BasStandartime(String timename, Short subordinateunit, Date workingtime, Date closingtime, Date saturdayworkingtime, Date saturdayclosingtime, Date sundayworkingtime, Date sundayclosingtime, SyUnits syUnits) {
        this.timename = timename;
        this.subordinateunit = subordinateunit;
        this.workingtime = workingtime;
        this.closingtime = closingtime;
        this.saturdayworkingtime = saturdayworkingtime;
        this.saturdayclosingtime = saturdayclosingtime;
        this.sundayworkingtime = sundayworkingtime;
        this.sundayclosingtime = sundayclosingtime;
        this.syUnits = syUnits;
    }
}