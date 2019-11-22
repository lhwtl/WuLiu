package com.hlp.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BasStandartime {
    private Short id;

    private String timename;

    private Short subordinateunit;
    @DateTimeFormat(pattern = "HH:mm:ss")
    private Date workingtime;
    private  String workingtime1;

    private Date closingtime;
    private  String closingtime1;

    private Date saturdayworkingtime;

    public String getSaturdayworkingtime1() {
        return saturdayworkingtime1;
    }

    public String getWorkingtime1() {
        return workingtime1;
    }

    public void setWorkingtime1(String workingtime1) {
        this.workingtime1 = workingtime1;
    }

    public String getClosingtime1() {
        return closingtime1;
    }

    public void setClosingtime1(String closingtime1) {
        this.closingtime1 = closingtime1;
    }

    public String getSaturdayclosingtime1() {
        return saturdayclosingtime1;
    }

    public void setSaturdayclosingtime1(String saturdayclosingtime1) {
        this.saturdayclosingtime1 = saturdayclosingtime1;
    }

    public String getSundayworkingtime1() {
        return sundayworkingtime1;
    }

    public void setSundayworkingtime1(String sundayworkingtime1) {
        this.sundayworkingtime1 = sundayworkingtime1;
    }

    public String getSundayclosingtime1() {
        return sundayclosingtime1;
    }

    public void setSundayclosingtime1(String sundayclosingtime1) {
        this.sundayclosingtime1 = sundayclosingtime1;
    }

    public SyUnits getSyUnits() {
        return syUnits;
    }

    public void setSyUnits(SyUnits syUnits) {
        this.syUnits = syUnits;
    }

    public void setSaturdayworkingtime1(String saturdayworkingtime1) {
        this.saturdayworkingtime1 = saturdayworkingtime1;
    }

    private  String saturdayworkingtime1;

    private Date saturdayclosingtime;
    private  String saturdayclosingtime1;

    private Date sundayworkingtime;
    private  String sundayworkingtime1;

    private Date sundayclosingtime;
    private  String sundayclosingtime1;

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
}