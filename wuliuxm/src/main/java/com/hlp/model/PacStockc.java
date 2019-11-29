package com.hlp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class PacStockc {
    private Short id;

    private String outboundno;

    private Short outboundtype;

    private String transport;

    private String subordinateunit;

    private String issuedunit;

    private String handlingunit;

    private Short handlingnumber;

    private String handlingname;

    private Short customerid;

    private String customername;

    private Short recipientnumber;

    private String recipientname;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date recipienttime;

    private Short drawerno;

    private String drawername;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date drawertime;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getOutboundno() {
        return outboundno;
    }

    public void setOutboundno(String outboundno) {
        this.outboundno = outboundno == null ? null : outboundno.trim();
    }

    public Short getOutboundtype() {
        return outboundtype;
    }

    public void setOutboundtype(Short outboundtype) {
        this.outboundtype = outboundtype;
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

    public String getIssuedunit() {
        return issuedunit;
    }

    public void setIssuedunit(String issuedunit) {
        this.issuedunit = issuedunit == null ? null : issuedunit.trim();
    }

    public String getHandlingunit() {
        return handlingunit;
    }

    public void setHandlingunit(String handlingunit) {
        this.handlingunit = handlingunit == null ? null : handlingunit.trim();
    }

    public Short getHandlingnumber() {
        return handlingnumber;
    }

    public void setHandlingnumber(Short handlingnumber) {
        this.handlingnumber = handlingnumber;
    }

    public String getHandlingname() {
        return handlingname;
    }

    public void setHandlingname(String handlingname) {
        this.handlingname = handlingname == null ? null : handlingname.trim();
    }

    public Short getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Short customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public Short getRecipientnumber() {
        return recipientnumber;
    }

    public void setRecipientnumber(Short recipientnumber) {
        this.recipientnumber = recipientnumber;
    }

    public String getRecipientname() {
        return recipientname;
    }

    public void setRecipientname(String recipientname) {
        this.recipientname = recipientname == null ? null : recipientname.trim();
    }

    public Date getRecipienttime() {
        return recipienttime;
    }

    public void setRecipienttime(Date recipienttime) {
        this.recipienttime = recipienttime;
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
}