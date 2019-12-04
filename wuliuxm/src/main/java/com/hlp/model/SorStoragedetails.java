package com.hlp.model;

public class SorStoragedetails {
    private Short id;

    private String packageid;

    private Short weight;

    private String outboundid;

    private Short state;

    private  SorStorage sorStorage;

    public SorStorage getSorStorage() {
        return sorStorage;
    }

    public void setSorStorage(SorStorage sorStorage) {
        this.sorStorage = sorStorage;
    }

    //定义一个string类型的
    private String list;

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
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

    public String getOutboundid() {
        return outboundid;
    }

    public void setOutboundid(String outboundid) {
        this.outboundid = outboundid == null ? null : outboundid.trim();
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public SorStoragedetails(String packageid, Short weight, String outboundid, Short state, String list) {
        this.packageid = packageid;
        this.weight = weight;
        this.outboundid = outboundid;
        this.state = state;
        this.list = list;
    }

    public SorStoragedetails() {
    }

    public SorStoragedetails(Short id, String packageid, Short weight, String outboundid, Short state) {
        this.id = id;
        this.packageid = packageid;
        this.weight = weight;
        this.outboundid = outboundid;
        this.state = state;
    }

    @Override
    public String toString() {
        return "SorStoragedetails{" +
                "id=" + id +
                ", packageid='" + packageid + '\'' +
                ", weight=" + weight +
                ", outboundid='" + outboundid + '\'' +
                ", state=" + state +
                ", sorStorage=" + sorStorage +
                ", list='" + list + '\'' +
                '}';
    }
}