package com.hlp.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SorOutbound {
    private Integer id;

    private Short handovertype;

    private String line;

    private Short direction;

    private Short acceptperson;

    private Short carriers;

    private Short deliveryperson;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date deliverydate;

    private String deliverycompany;

    private Short enterperson;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date enterdate;

    private  SyEmp syEmp;

    private  SyEmp syEmps;

    private  SyEmp syEmpss;

    //定义一个string类型的
    private String list;

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public SyEmp getSyEmp() {
        return syEmp;
    }

    public void setSyEmp(SyEmp syEmp) {
        this.syEmp = syEmp;
    }

    public SyEmp getSyEmps() {
        return syEmps;
    }

    public void setSyEmps(SyEmp syEmps) {
        this.syEmps = syEmps;
    }

    public SyEmp getSyEmpss() {
        return syEmpss;
    }

    public void setSyEmpss(SyEmp syEmpss) {
        this.syEmpss = syEmpss;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getHandovertype() {
        return handovertype;
    }

    public void setHandovertype(Short handovertype) {
        this.handovertype = handovertype;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line == null ? null : line.trim();
    }

    public Short getDirection() {
        return direction;
    }

    public void setDirection(Short direction) {
        this.direction = direction;
    }

    public Short getAcceptperson() {
        return acceptperson;
    }

    public void setAcceptperson(Short acceptperson) {
        this.acceptperson = acceptperson;
    }

    public Short getCarriers() {
        return carriers;
    }

    public void setCarriers(Short carriers) {
        this.carriers = carriers;
    }

    public Short getDeliveryperson() {
        return deliveryperson;
    }

    public void setDeliveryperson(Short deliveryperson) {
        this.deliveryperson = deliveryperson;
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public String getDeliverycompany() {
        return deliverycompany;
    }

    public void setDeliverycompany(String deliverycompany) {
        this.deliverycompany = deliverycompany == null ? null : deliverycompany.trim();
    }

    public Short getEnterperson() {
        return enterperson;
    }

    public void setEnterperson(Short enterperson) {
        this.enterperson = enterperson;
    }

    public Date getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(Date enterdate) {
        this.enterdate = enterdate;
    }


    @Override
    public String toString() {
        return "SorOutbound{" +
                "id=" + id +
                ", handovertype=" + handovertype +
                ", line='" + line + '\'' +
                ", direction=" + direction +
                ", acceptperson=" + acceptperson +
                ", carriers=" + carriers +
                ", deliveryperson=" + deliveryperson +
                ", deliverydate=" + deliverydate +
                ", deliverycompany='" + deliverycompany + '\'' +
                ", enterperson=" + enterperson +
                ", enterdate=" + enterdate +
                ", syEmp=" + syEmp +
                ", syEmps=" + syEmps +
                ", syEmpss=" + syEmpss +
                ", list='" + list + '\'' +
                '}';
    }
}