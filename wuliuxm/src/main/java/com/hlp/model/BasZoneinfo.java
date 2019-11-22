package com.hlp.model;

public class BasZoneinfo {
    private Short id;

    private String zonecode;

    private String zonename;

    private Short zonepeople;

    private String telphone;

    private Short subordinateunit;

    private SyEmp syEmp;//员工表一对一

    private SyUnits syUnits;//单位表一对一

    private BasPartition basPartition;//分区表一对一

    private BasZonecustominfo basZonecustominfo;//定区客户信息表一对一

    public BasZonecustominfo getBasZonecustominfo() {
        return basZonecustominfo;
    }

    public void setBasZonecustominfo(BasZonecustominfo basZonecustominfo) {
        this.basZonecustominfo = basZonecustominfo;
    }

    public BasPartition getBasPartition() {
        return basPartition;
    }

    public void setBasPartition(BasPartition basPartition) {
        this.basPartition = basPartition;
    }

    public SyEmp getSyEmp() {
        return syEmp;
    }

    public void setSyEmp(SyEmp syEmp) {
        this.syEmp = syEmp;
    }

    public SyUnits getSyUnits() {
        return syUnits;
    }

    public void setSyUnits(SyUnits syUnits) {
        this.syUnits = syUnits;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getZonecode() {
        return zonecode;
    }

    public void setZonecode(String zonecode) {
        this.zonecode = zonecode == null ? null : zonecode.trim();
    }

    public String getZonename() {
        return zonename;
    }

    public void setZonename(String zonename) {
        this.zonename = zonename == null ? null : zonename.trim();
    }

    public Short getZonepeople() {
        return zonepeople;
    }

    public void setZonepeople(Short zonepeople) {
        this.zonepeople = zonepeople;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public Short getSubordinateunit() {
        return subordinateunit;
    }

    public void setSubordinateunit(Short subordinateunit) {
        this.subordinateunit = subordinateunit;
    }
}