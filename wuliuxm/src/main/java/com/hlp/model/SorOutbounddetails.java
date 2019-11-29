package com.hlp.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SorOutbounddetails {
    private Integer id;

    private String packageid;

    private Short weight;

    private Short volume;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date scandate;

    private Short isscan;

    private Short isnextstorage;

    private Short isdoublestorage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPackageid() {
        return packageid;
    }

    public void setPackageid(String packageid) {
        this.packageid = packageid == null ? null : packageid.trim();
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    public Short getVolume() {
        return volume;
    }

    public void setVolume(Short volume) {
        this.volume = volume;
    }

    public Date getScandate() {
        return scandate;
    }

    public void setScandate(Date scandate) {
        this.scandate = scandate;
    }

    public Short getIsscan() {
        return isscan;
    }

    public void setIsscan(Short isscan) {
        this.isscan = isscan;
    }

    public Short getIsnextstorage() {
        return isnextstorage;
    }

    public void setIsnextstorage(Short isnextstorage) {
        this.isnextstorage = isnextstorage;
    }

    public Short getIsdoublestorage() {
        return isdoublestorage;
    }

    public void setIsdoublestorage(Short isdoublestorage) {
        this.isdoublestorage = isdoublestorage;
    }

    @Override
    public String toString() {
        return "SorOutbounddetails{" +
                "id=" + id +
                ", packageid='" + packageid + '\'' +
                ", weight=" + weight +
                ", volume=" + volume +
                ", scandate=" + scandate +
                ", isscan=" + isscan +
                ", isnextstorage=" + isnextstorage +
                ", isdoublestorage=" + isdoublestorage +
                '}';
    }
}