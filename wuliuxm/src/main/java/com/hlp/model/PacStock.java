package com.hlp.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class PacStock {
    private Short id;

    private String warehouseno;

    private Short reservoirtype;

    private String transport;

    private String subordinateunit;

    private Short drawerno;

    private String drawername;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date drawertime;

    private String remark;

   private PacStockitem pacStockitem;

    public PacStockitem getPacStockitem() {
        return pacStockitem;
    }

    public void setPacStockitem(PacStockitem pacStockitem) {
        this.pacStockitem = pacStockitem;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getWarehouseno() {
        return warehouseno;
    }

    public void setWarehouseno(String warehouseno) {
        this.warehouseno = warehouseno == null ? null : warehouseno.trim();
    }

    public Short getReservoirtype() {
        return reservoirtype;
    }

    public void setReservoirtype(Short reservoirtype) {
        this.reservoirtype = reservoirtype;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport == null ? null : transport.trim();
    }

    public String getSubordinateunit() {
        return subordinateunit;
    }

    public void setSubordinateunit(String subordinateunit) {
        this.subordinateunit = subordinateunit == null ? null : subordinateunit.trim();
    }

    public Short getDrawerno() {
        return drawerno;
    }

    public void setDrawerno(Short drawerno) {
        this.drawerno = drawerno;
    }

    public String getDrawername() {
        return drawername;
    }

    public void setDrawername(String drawername) {
        this.drawername = drawername == null ? null : drawername.trim();
    }

    public Date getDrawertime() {
        return drawertime;
    }

    public void setDrawertime(Date drawertime) {
        this.drawertime = drawertime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "PacStock{" +
                "id=" + id +
                ", warehouseno='" + warehouseno + '\'' +
                ", reservoirtype=" + reservoirtype +
                ", transport='" + transport + '\'' +
                ", subordinateunit='" + subordinateunit + '\'' +
                ", drawerno=" + drawerno +
                ", drawername='" + drawername + '\'' +
                ", drawertime=" + drawertime +
                ", remark='" + remark + '\'' +
                '}';
    }
}