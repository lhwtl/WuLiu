package com.hlp.model;

import java.util.List;

public class BasZoneinfo {
    private Short id;

    private String zonecode;//定区编码

    private String zonename;//定区名称

    private Short zonepeople;//定区负责人

    private String telphone;//联系电话

    private Short subordinateunit;//所属单位

    private SyEmp syEmp;//员工表一对一

    private SyUnits syUnits;//单位表一对一

    private BasPartition basPartition;//分区表一对一

    private BasZonecustominfo basZonecustominfo;//定区客户信息表一对一
    private List<BasZonecustominfo> basZonecustominfos;//定区客户信息表一对多

    public List<BasZonecustominfo> getBasZonecustominfos() {
        return basZonecustominfos;
    }

    public void setBasZonecustominfos(List<BasZonecustominfo> basZonecustominfos) {
        this.basZonecustominfos = basZonecustominfos;
    }

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

    @Override
    public String toString() {
        return "BasZoneinfo{" +
                "id=" + id +
                ", zonecode='" + zonecode + '\'' +
                ", zonename='" + zonename + '\'' +
                ", zonepeople=" + zonepeople +
                ", telphone='" + telphone + '\'' +
                ", subordinateunit=" + subordinateunit +
                ", syEmp=" + syEmp +
                ", syUnits=" + syUnits +
                ", basPartition=" + basPartition +
                ", basZonecustominfo=" + basZonecustominfo +
                '}';
    }

    public BasZoneinfo() {
    }

    public BasZoneinfo(String zonecode, String zonename, Short zonepeople, String telphone, Short subordinateunit, SyEmp syEmp, SyUnits syUnits, BasPartition basPartition, BasZonecustominfo basZonecustominfo) {
        this.zonecode = zonecode;
        this.zonename = zonename;
        this.zonepeople = zonepeople;
        this.telphone = telphone;
        this.subordinateunit = subordinateunit;
        this.syEmp = syEmp;
        this.syUnits = syUnits;
        this.basPartition = basPartition;
        this.basZonecustominfo = basZonecustominfo;
    }
}