package com.hlp.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SorPackage {
    private Integer id;

    private Short packageperson;

    private String sealint;

    private String destination;

    private String reckondes;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date timelimit;

    private Short ticketsum;

    private Short cargosum;

    private Short weightsum;

    private Short volumesum;

    private Short state;

    private Short ask;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getPackageperson() {
        return packageperson;
    }

    public void setPackageperson(Short packageperson) {
        this.packageperson = packageperson;
    }

    public String getSealint() {
        return sealint;
    }

    public void setSealint(String sealint) {
        this.sealint = sealint == null ? null : sealint.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getReckondes() {
        return reckondes;
    }

    public void setReckondes(String reckondes) {
        this.reckondes = reckondes == null ? null : reckondes.trim();
    }

    public Date getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Date timelimit) {
        this.timelimit = timelimit;
    }

    public Short getTicketsum() {
        return ticketsum;
    }

    public void setTicketsum(Short ticketsum) {
        this.ticketsum = ticketsum;
    }

    public Short getCargosum() {
        return cargosum;
    }

    public void setCargosum(Short cargosum) {
        this.cargosum = cargosum;
    }

    public Short getWeightsum() {
        return weightsum;
    }

    public void setWeightsum(Short weightsum) {
        this.weightsum = weightsum;
    }

    public Short getVolumesum() {
        return volumesum;
    }

    public void setVolumesum(Short volumesum) {
        this.volumesum = volumesum;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Short getAsk() {
        return ask;
    }

    public void setAsk(Short ask) {
        this.ask = ask;
    }

    @Override
    public String toString() {
        return "SorPackage{" +
                "id=" + id +
                ", packageperson=" + packageperson +
                ", sealint='" + sealint + '\'' +
                ", destination='" + destination + '\'' +
                ", reckondes='" + reckondes + '\'' +
                ", timelimit=" + timelimit +
                ", ticketsum=" + ticketsum +
                ", cargosum=" + cargosum +
                ", weightsum=" + weightsum +
                ", volumesum=" + volumesum +
                ", state=" + state +
                ", ask=" + ask +
                '}';
    }
}