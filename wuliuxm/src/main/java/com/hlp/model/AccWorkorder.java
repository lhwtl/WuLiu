package com.hlp.model;

import java.util.Date;

public class AccWorkorder {
    private Short id;

    private String businessnoticeno;

    private String jobno;

    private Short jobtype;

    private Short pickupstatus;

    private Short shortmessageint;

    private Date workgenerationtime;
    private String workgenerationtimes;

    private Short aftersinglenum;

    private Short smallmembernum;

    private Short pickupunit;

    private Date pickuptime;

    private String sortingcode;

    private DisWorkordersign disWorkordersign;//工作单签收表

    private AccWorksheet accWorksheet;//工作单表

    public DisWorkordersign getDisWorkordersign() {
        return disWorkordersign;
    }

    public void setDisWorkordersign(DisWorkordersign disWorkordersign) {
        this.disWorkordersign = disWorkordersign;
    }

    public AccWorksheet getAccWorksheet() {
        return accWorksheet;
    }

    public void setAccWorksheet(AccWorksheet accWorksheet) {
        this.accWorksheet = accWorksheet;
    }

    public AccBusinessadmissibility getAccBusinessadmissibility() {
        return accBusinessadmissibility;
    }

    public void setAccBusinessadmissibility(AccBusinessadmissibility accBusinessadmissibility) {
        this.accBusinessadmissibility = accBusinessadmissibility;
    }

    private AccBusinessadmissibility accBusinessadmissibility;/*业务受理表一对一*/

    public void setBusinessnoticeno(String businessnoticeno) {
        this.businessnoticeno = businessnoticeno;
    }

    public String getBusinessnoticeno() {
        return businessnoticeno;
    }

    public void setWorkgenerationtimes(String workgenerationtimes) {
        this.workgenerationtimes = workgenerationtimes;
    }

    public String getWorkgenerationtimes() {
        return workgenerationtimes;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getJobno() {
        return jobno;
    }

    public void setJobno(String jobno) {
        this.jobno = jobno == null ? null : jobno.trim();
    }

    public Short getJobtype() {
        return jobtype;
    }

    public void setJobtype(Short jobtype) {
        this.jobtype = jobtype;
    }

    public Short getPickupstatus() {
        return pickupstatus;
    }

    public void setPickupstatus(Short pickupstatus) {
        this.pickupstatus = pickupstatus;
    }

    public Short getShortmessageint() {
        return shortmessageint;
    }

    public void setShortmessageint(Short shortmessageint) {
        this.shortmessageint = shortmessageint;
    }

    public Date getWorkgenerationtime() {
        return workgenerationtime;
    }

    public void setWorkgenerationtime(Date workgenerationtime) {
        this.workgenerationtime = workgenerationtime;
    }

    public Short getAftersinglenum() {
        return aftersinglenum;
    }

    public void setAftersinglenum(Short aftersinglenum) {
        this.aftersinglenum = aftersinglenum;
    }

    public Short getSmallmembernum() {
        return smallmembernum;
    }

    public void setSmallmembernum(Short smallmembernum) {
        this.smallmembernum = smallmembernum;
    }

    public Short getPickupunit() {
        return pickupunit;
    }

    public void setPickupunit(Short pickupunit) {
        this.pickupunit = pickupunit;
    }

    public Date getPickuptime() {
        return pickuptime;
    }

    public void setPickuptime(Date pickuptime) {
        this.pickuptime = pickuptime;
    }

    public String getSortingcode() {
        return sortingcode;
    }

    public void setSortingcode(String sortingcode) {
        this.sortingcode = sortingcode == null ? null : sortingcode.trim();
    }

    public AccWorkorder(Short id, String jobno, Short jobtype, Short pickupstatus, Short shortmessageint, Date workgenerationtime, Short aftersinglenum, Short smallmembernum, Short pickupunit, Date pickuptime, String sortingcode) {
        this.id = id;
        this.jobno = jobno;
        this.jobtype = jobtype;
        this.pickupstatus = pickupstatus;
        this.shortmessageint = shortmessageint;
        this.workgenerationtime = workgenerationtime;
        this.aftersinglenum = aftersinglenum;
        this.smallmembernum = smallmembernum;
        this.pickupunit = pickupunit;
        this.pickuptime = pickuptime;
        this.sortingcode = sortingcode;
    }

    public AccWorkorder() {
    }

    @Override
    public String toString() {
        return "AccWorkorder{" +
                "id=" + id +
                ", jobno='" + jobno + '\'' +
                ", jobtype=" + jobtype +
                ", pickupstatus=" + pickupstatus +
                ", shortmessageint=" + shortmessageint +
                ", workgenerationtime=" + workgenerationtime +
                ", aftersinglenum=" + aftersinglenum +
                ", smallmembernum=" + smallmembernum +
                ", pickupunit=" + pickupunit +
                ", pickuptime=" + pickuptime +
                ", sortingcode='" + sortingcode + '\'' +
                '}';
    }
}