package com.hlp.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class IaeArrival {
    private String id;

    private String sendcompany;

    private String cargoaddress;

    private String issueperson;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date issuedate;

    private String workaddress;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date storagedate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date outbounddate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date timelimit;
    //@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private short batch;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSendcompany() {
        return sendcompany;
    }

    public void setSendcompany(String sendcompany) {
        this.sendcompany = sendcompany == null ? null : sendcompany.trim();
    }

    public String getCargoaddress() {
        return cargoaddress;
    }

    public void setCargoaddress(String cargoaddress) {
        this.cargoaddress = cargoaddress == null ? null : cargoaddress.trim();
    }

    public String getIssueperson() {
        return issueperson;
    }

    public void setIssueperson(String issueperson) {
        this.issueperson = issueperson == null ? null : issueperson.trim();
    }

    public Date getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    public String getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(String workaddress) {
        this.workaddress = workaddress == null ? null : workaddress.trim();
    }

    public Date getStoragedate() {
        return storagedate;
    }

    public void setStoragedate(Date storagedate) {
        this.storagedate = storagedate;
    }

    public Date getOutbounddate() {
        return outbounddate;
    }

    public void setOutbounddate(Date outbounddate) {
        this.outbounddate = outbounddate;
    }

    public Date getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Date timelimit) {
        this.timelimit = timelimit;
    }

    public short getBatch() {
        return batch;
    }

    public void setBatch(short batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "IaeArrival{" +
                "id='" + id + '\'' +
                ", sendcompany='" + sendcompany + '\'' +
                ", cargoaddress='" + cargoaddress + '\'' +
                ", issueperson='" + issueperson + '\'' +
                ", issuedate=" + issuedate +
                ", workaddress='" + workaddress + '\'' +
                ", storagedate=" + storagedate +
                ", outbounddate=" + outbounddate +
                ", timelimit=" + timelimit +
                ", batch=" + batch +
                '}';
    }
}