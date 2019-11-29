package com.hlp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class PacPackagingc {
    private Short id;

    private String workint;

    private String warename;

    private String delivery;

    private String packingunit;

    private String storageperson;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date storagedate;

    private String packer;

    private String outbound;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date outbounddate;

    private String entrustcompany;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getWorkint() {
        return workint;
    }

    public void setWorkint(String workint) {
        this.workint = workint;
    }

    public String getWarename() {
        return warename;
    }

    public void setWarename(String warename) {
        this.warename = warename == null ? null : warename.trim();
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery == null ? null : delivery.trim();
    }

    public String getPackingunit() {
        return packingunit;
    }

    public void setPackingunit(String packingunit) {
        this.packingunit = packingunit == null ? null : packingunit.trim();
    }

    public String getStorageperson() {
        return storageperson;
    }

    public void setStorageperson(String storageperson) {
        this.storageperson = storageperson == null ? null : storageperson.trim();
    }

    public Date getStoragedate() {
        return storagedate;
    }

    public void setStoragedate(Date storagedate) {
        this.storagedate = storagedate;
    }

    public String getPacker() {
        return packer;
    }

    public void setPacker(String packer) {
        this.packer = packer == null ? null : packer.trim();
    }

    public String getOutbound() {
        return outbound;
    }

    public void setOutbound(String outbound) {
        this.outbound = outbound == null ? null : outbound.trim();
    }

    public Date getOutbounddate() {
        return outbounddate;
    }

    public void setOutbounddate(Date outbounddate) {
        this.outbounddate = outbounddate;
    }

    public String getEntrustcompany() {
        return entrustcompany;
    }

    public void setEntrustcompany(String entrustcompany) {
        this.entrustcompany = entrustcompany == null ? null : entrustcompany.trim();
    }

    @Override
    public String toString() {
        return "PacPackagingc{" +
                "id=" + id +
                ", workint=" + workint +
                ", warename='" + warename + '\'' +
                ", delivery='" + delivery + '\'' +
                ", packingunit='" + packingunit + '\'' +
                ", storageperson='" + storageperson + '\'' +
                ", storagedate=" + storagedate +
                ", packer='" + packer + '\'' +
                ", outbound='" + outbound + '\'' +
                ", outbounddate=" + outbounddate +
                ", entrustcompany='" + entrustcompany + '\'' +
                '}';
    }
}