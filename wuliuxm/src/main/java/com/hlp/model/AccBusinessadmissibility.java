package com.hlp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.EmptyStackException;
import java.util.List;

public class AccBusinessadmissibility {
    private Short id;

    private String businessnoticeno;//业务通知单号
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date reservationtime;//预约收件时间
    private String reservationtimes;

    private String customname;//客户姓名

    private String pickupaddress;//取件地址

    private String customcode;//客户编号

    private String linkman;//联系人

    private String telphone;//电话

    private Short weight;//重量

    private Short volume;//体积

    private String importanthints;//重要提示

    private String arrivecity;//到达城市

    private Short pickerinfo;//取货人员信息

    private String sendaddress;//派送地址

    private Short processingunit;//处理单位

    private Short notificationsource;//通知单来源

    private Short customnomodifyflag;//客户单号修改标志

    private String singletype;//分单类型

    private Short packagesnum;//件数

    private Short actualweight;//实际重量

    private Short billingweight;//计费重量

    private Short packingfee;//包装费

    private Short actualpacking;//实际包装

    private BasZonecustominfo basZonecustominfo;/* 定区客户信息表一对一*/

    private AccWorkorder accWorkorders;/*工单表一对一*/

    public AccWorkorder getAccWorkorders() {
        return accWorkorders;
    }

    public void setAccWorkorders(AccWorkorder accWorkorders) {
        this.accWorkorders = accWorkorders;
    }

    public BasZonecustominfo getBasZonecustominfo() {
        return basZonecustominfo;
    }

    public void setBasZonecustominfo(BasZonecustominfo basZonecustominfo) {
        this.basZonecustominfo = basZonecustominfo;
    }

    private AccWorkorder accWorkorder;
    private SyEmp syEmp;
    private SyUnits syUnits;
    private DisDispatchhistory disDispatchhistory;

    public void setReservationtimes(String reservationtimes) {
        this.reservationtimes = reservationtimes;
    }

    public String getReservationtimes() {
        return reservationtimes;
    }

    public void setDisDispatchhistory(DisDispatchhistory disDispatchhistory) {
        this.disDispatchhistory = disDispatchhistory;
    }

    public DisDispatchhistory getDisDispatchhistory() {
        return disDispatchhistory;
    }

    public void setSyUnits(SyUnits syUnits) {
        this.syUnits = syUnits;
    }

    public SyUnits getSyUnits() {
        return syUnits;
    }

    public void setSyEmp(SyEmp syEmp) {
        this.syEmp = syEmp;
    }

    public SyEmp getSyEmp() {
        return syEmp;
    }

    public void setAccWorkorder(AccWorkorder accWorkorder) {
        this.accWorkorder = accWorkorder;
    }

    public AccWorkorder getAccWorkorder() {
        return accWorkorder;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getBusinessnoticeno() {
        return businessnoticeno;
    }

    public void setBusinessnoticeno(String businessnoticeno) {
        this.businessnoticeno = businessnoticeno == null ? null : businessnoticeno.trim();
    }

    public Date getReservationtime() {
        return reservationtime;
    }

    public void setReservationtime(Date reservationtime) {
        this.reservationtime = reservationtime;
    }

    public String getCustomname() {
        return customname;
    }

    public void setCustomname(String customname) {
        this.customname = customname == null ? null : customname.trim();
    }

    public String getPickupaddress() {
        return pickupaddress;
    }

    public void setPickupaddress(String pickupaddress) {
        this.pickupaddress = pickupaddress == null ? null : pickupaddress.trim();
    }

    public String getCustomcode() {
        return customcode;
    }

    public void setCustomcode(String customcode) {
        this.customcode = customcode == null ? null : customcode.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
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

    public String getImportanthints() {
        return importanthints;
    }

    public void setImportanthints(String importanthints) {
        this.importanthints = importanthints == null ? null : importanthints.trim();
    }

    public String getArrivecity() {
        return arrivecity;
    }

    public void setArrivecity(String arrivecity) {
        this.arrivecity = arrivecity == null ? null : arrivecity.trim();
    }

    public Short getPickerinfo() {
        return pickerinfo;
    }

    public void setPickerinfo(Short pickerinfo) {
        this.pickerinfo = pickerinfo;
    }

    public String getSendaddress() {
        return sendaddress;
    }

    public void setSendaddress(String sendaddress) {
        this.sendaddress = sendaddress == null ? null : sendaddress.trim();
    }

    public Short getProcessingunit() {
        return processingunit;
    }

    public void setProcessingunit(Short processingunit) {
        this.processingunit = processingunit;
    }

    public Short getNotificationsource() {
        return notificationsource;
    }

    public void setNotificationsource(Short notificationsource) {
        this.notificationsource = notificationsource;
    }

    public Short getCustomnomodifyflag() {
        return customnomodifyflag;
    }

    public void setCustomnomodifyflag(Short customnomodifyflag) {
        this.customnomodifyflag = customnomodifyflag;
    }

    public String getSingletype() {
        return singletype;
    }

    public void setSingletype(String singletype) {
        this.singletype = singletype == null ? null : singletype.trim();
    }

    public Short getPackagesnum() {
        return packagesnum;
    }

    public void setPackagesnum(Short packagesnum) {
        this.packagesnum = packagesnum;
    }

    public Short getActualweight() {
        return actualweight;
    }

    public void setActualweight(Short actualweight) {
        this.actualweight = actualweight;
    }

    public Short getBillingweight() {
        return billingweight;
    }

    public void setBillingweight(Short billingweight) {
        this.billingweight = billingweight;
    }

    public Short getPackingfee() {
        return packingfee;
    }

    public void setPackingfee(Short packingfee) {
        this.packingfee = packingfee;
    }

    public Short getActualpacking() {
        return actualpacking;
    }

    public void setActualpacking(Short actualpacking) {
        this.actualpacking = actualpacking;
    }

    public AccBusinessadmissibility(Short id, String businessnoticeno, Date reservationtime, String customname, String pickupaddress, String customcode, String linkman, String telphone, Short weight, Short volume, String importanthints, String arrivecity, Short pickerinfo, String sendaddress, Short processingunit, Short notificationsource, Short customnomodifyflag, String singletype, Short packagesnum, Short actualweight, Short billingweight, Short packingfee, Short actualpacking) {
        this.id = id;
        this.businessnoticeno = businessnoticeno;
        this.reservationtime = reservationtime;
        this.customname = customname;
        this.pickupaddress = pickupaddress;
        this.customcode = customcode;
        this.linkman = linkman;
        this.telphone = telphone;
        this.weight = weight;
        this.volume = volume;
        this.importanthints = importanthints;
        this.arrivecity = arrivecity;
        this.pickerinfo = pickerinfo;
        this.sendaddress = sendaddress;
        this.processingunit = processingunit;
        this.notificationsource = notificationsource;
        this.customnomodifyflag = customnomodifyflag;
        this.singletype = singletype;
        this.packagesnum = packagesnum;
        this.actualweight = actualweight;
        this.billingweight = billingweight;
        this.packingfee = packingfee;
        this.actualpacking = actualpacking;
    }

    public AccBusinessadmissibility() {
    }

    @Override
    public String toString() {
        return "AccBusinessadmissibility{" +
                "id=" + id +
                ", businessnoticeno='" + businessnoticeno + '\'' +
                ", reservationtime=" + reservationtime +
                ", customname='" + customname + '\'' +
                ", pickupaddress='" + pickupaddress + '\'' +
                ", customcode='" + customcode + '\'' +
                ", linkman='" + linkman + '\'' +
                ", telphone='" + telphone + '\'' +
                ", weight=" + weight +
                ", volume=" + volume +
                ", importanthints='" + importanthints + '\'' +
                ", arrivecity='" + arrivecity + '\'' +
                ", pickerinfo=" + pickerinfo +
                ", sendaddress='" + sendaddress + '\'' +
                ", processingunit=" + processingunit +
                ", notificationsource=" + notificationsource +
                ", customnomodifyflag=" + customnomodifyflag +
                ", singletype='" + singletype + '\'' +
                ", packagesnum=" + packagesnum +
                ", actualweight=" + actualweight +
                ", billingweight=" + billingweight +
                ", packingfee=" + packingfee +
                ", actualpacking=" + actualpacking +
                ", accWorkorder=" + accWorkorder +
                ", syEmp=" + syEmp +
                ", syUnits=" + syUnits +
                ", disDispatchhistory=" + disDispatchhistory +
                '}';
    }
}
