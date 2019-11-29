package com.hlp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SorCheckbound {
    private Integer id;

    private Short scanid;

    private Short cargosum;

    private Short checkperson;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date checkdate;

    private String checkcompany;

    public SorCheckbound() {
    }

    @Override
    public String toString() {
        return "SorCheckbound{" +
                "id=" + id +
                ", scanid=" + scanid +
                ", cargosum=" + cargosum +
                ", checkperson=" + checkperson +
                ", checkdate=" + checkdate +
                ", checkcompany='" + checkcompany + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getScanid() {
        return scanid;
    }

    public void setScanid(Short scanid) {
        this.scanid = scanid;
    }

    public Short getCargosum() {
        return cargosum;
    }

    public void setCargosum(Short cargosum) {
        this.cargosum = cargosum;
    }

    public Short getCheckperson() {
        return checkperson;
    }

    public void setCheckperson(Short checkperson) {
        this.checkperson = checkperson;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public String getCheckcompany() {
        return checkcompany;
    }

    public void setCheckcompany(String checkcompany) {
        this.checkcompany = checkcompany;
    }
}