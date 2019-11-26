package com.hlp.model;

import java.util.Date;

public class DisWorkordersign {
    private Short id;

    private Short workorderid;

    private String worksheetno;

    private Short workordertype;

    private Short signtype;

    private Short courierint;

    private String couriername;

    private String recipient;

    private Short signunit;

    private Date signtime;

    private Short invalidatemark;

    private String abnormalmark;

    private Short inputpersoncode;

    private Short inputpersonid;

    private Short inputid;

    private Date inputtime;

    private SyUnits syUnits;//与单位一对一
    private SyEmp syEmp;//与用户一对一
    private Worktype worktype;//与工作单类型一对一
    private QsType qsType;//与签收类型一对一
    private RetReturnlist retReturnlist;

    public void setRetReturnlist(RetReturnlist retReturnlist) {
        this.retReturnlist = retReturnlist;
    }

    public RetReturnlist getRetReturnlist() {
        return retReturnlist;
    }

    public void setWorktype(Worktype worktype) {
        this.worktype = worktype;
    }

    public Worktype getWorktype() {
        return worktype;
    }

    public void setQsType(QsType qsType) {
        this.qsType = qsType;
    }

    public QsType getQsType() {
        return qsType;
    }

    public void setSyEmp(SyEmp syEmp) {
        this.syEmp = syEmp;
    }

    public SyEmp getSyEmp() {
        return syEmp;
    }

    public void setSyUnits(SyUnits syUnits) {
        this.syUnits = syUnits;
    }

    public SyUnits getSyUnits() {
        return syUnits;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getWorkorderid() {
        return workorderid;
    }

    public void setWorkorderid(Short workorderid) {
        this.workorderid = workorderid;
    }

    public String getWorksheetno() {
        return worksheetno;
    }

    public void setWorksheetno(String worksheetno) {
        this.worksheetno = worksheetno == null ? null : worksheetno.trim();
    }

    public Short getWorkordertype() {
        return workordertype;
    }

    public void setWorkordertype(Short workordertype) {
        this.workordertype = workordertype;
    }

    public Short getSigntype() {
        return signtype;
    }

    public void setSigntype(Short signtype) {
        this.signtype = signtype;
    }

    public Short getCourierint() {
        return courierint;
    }

    public void setCourierint(Short courierint) {
        this.courierint = courierint;
    }

    public String getCouriername() {
        return couriername;
    }

    public void setCouriername(String couriername) {
        this.couriername = couriername == null ? null : couriername.trim();
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient == null ? null : recipient.trim();
    }

    public Short getSignunit() {
        return signunit;
    }

    public void setSignunit(Short signunit) {
        this.signunit = signunit;
    }

    public Date getSigntime() {
        return signtime;
    }

    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    public Short getInvalidatemark() {
        return invalidatemark;
    }

    public void setInvalidatemark(Short invalidatemark) {
        this.invalidatemark = invalidatemark;
    }

    public String getAbnormalmark() {
        return abnormalmark;
    }

    public void setAbnormalmark(String abnormalmark) {
        this.abnormalmark = abnormalmark == null ? null : abnormalmark.trim();
    }

    public Short getInputpersoncode() {
        return inputpersoncode;
    }

    public void setInputpersoncode(Short inputpersoncode) {
        this.inputpersoncode = inputpersoncode;
    }

    public Short getInputpersonid() {
        return inputpersonid;
    }

    public void setInputpersonid(Short inputpersonid) {
        this.inputpersonid = inputpersonid;
    }

    public Short getInputid() {
        return inputid;
    }

    public void setInputid(Short inputid) {
        this.inputid = inputid;
    }

    public Date getInputtime() {
        return inputtime;
    }

    public void setInputtime(Date inputtime) {
        this.inputtime = inputtime;
    }

    @Override
    public String toString() {
        return "DisWorkordersign{" +
                "id=" + id +
                ", workorderid=" + workorderid +
                ", worksheetno='" + worksheetno + '\'' +
                ", workordertype=" + workordertype +
                ", signtype=" + signtype +
                ", courierint=" + courierint +
                ", couriername='" + couriername + '\'' +
                ", recipient='" + recipient + '\'' +
                ", signunit=" + signunit +
                ", signtime=" + signtime +
                ", invalidatemark=" + invalidatemark +
                ", abnormalmark='" + abnormalmark + '\'' +
                ", inputpersoncode=" + inputpersoncode +
                ", inputpersonid=" + inputpersonid +
                ", inputid=" + inputid +
                ", inputtime=" + inputtime +
                ", syUnits=" + syUnits +
                ", syEmp=" + syEmp +
                ", worktype=" + worktype +
                ", qsType=" + qsType +
                ", retReturnlist=" + retReturnlist +
                '}';
    }
}