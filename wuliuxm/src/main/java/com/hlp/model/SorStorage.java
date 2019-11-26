package com.hlp.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SorStorage {
    private int id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date acceptdate;

    private Short acceptperson;

    private String acceptcompany;

    private Short deliveryperson;

    private String deliverycompany;

    private SyEmp syEmp;/*与员工一对一*/

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAcceptdate() {
        return acceptdate;
    }

    public void setAcceptdate(Date acceptdate) {
        this.acceptdate = acceptdate;
    }

    public Short getAcceptperson() {
        return acceptperson;
    }

    public void setAcceptperson(Short acceptperson) {
        this.acceptperson = acceptperson;
    }

    public String getAcceptcompany() {
        return acceptcompany;
    }

    public void setAcceptcompany(String acceptcompany) {
        this.acceptcompany = acceptcompany == null ? null : acceptcompany.trim();
    }

    public Short getDeliveryperson() {
        return deliveryperson;
    }

    public void setDeliveryperson(Short deliveryperson) {
        this.deliveryperson = deliveryperson;
    }

    public String getDeliverycompany() {
        return deliverycompany;
    }

    public void setDeliverycompany(String deliverycompany) {
        this.deliverycompany = deliverycompany == null ? null : deliverycompany.trim();
    }

    public SorStorage(Date acceptdate, Short acceptperson, String acceptcompany, Short deliveryperson, String deliverycompany, SyEmp syEmp) {
        this.acceptdate = acceptdate;
        this.acceptperson = acceptperson;
        this.acceptcompany = acceptcompany;
        this.deliveryperson = deliveryperson;
        this.deliverycompany = deliverycompany;
        this.syEmp = syEmp;
    }

    public SorStorage() {
    }

    @Override
    public String toString() {
        return "SorStorage{" +
                "id=" + id +
                ", acceptdate=" + acceptdate +
                ", acceptperson=" + acceptperson +
                ", acceptcompany='" + acceptcompany + '\'' +
                ", deliveryperson=" + deliveryperson +
                ", deliverycompany='" + deliverycompany + '\'' +
                ", syEmp=" + syEmp +
                '}';
    }

}