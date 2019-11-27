package com.hlp.model;

public class SyEmp {
    private Short id;

    private String empname;

    private String empno;

    private String pwd;

    private String querypwd;

    private Short roleid;

    private Short empunit;

    private String remark;

    private Short disabled;

    private SyRole syRole;/*与角色一对一*/

    private SyUnits syUnits;/*与单位一对一*/

    private BasDeliverystandard basDeliverystandards;//与收派表一对一

    private BasShuttlebus basShuttlebus;//班车设置表一对一
    /*private SyUnits syUnits;

    public void setSyUnits(SyUnits syUnits) {
        this.syUnits = syUnits;
    }

    public SyUnits getSyUnits() {
        return syUnits;
    }*/

    public SyUnits getSyUnits() {
        return syUnits;
    }

    public void setSyUnits(SyUnits syUnits) {
        this.syUnits = syUnits;
    }

    public BasShuttlebus getBasShuttlebus() {
        return basShuttlebus;
    }

    public void setBasShuttlebus(BasShuttlebus basShuttlebus) {
        this.basShuttlebus = basShuttlebus;
    }

    public BasBasicarchives getBasBasicarchivess() {
        return basBasicarchivess;
    }

    public void setBasBasicarchivess(BasBasicarchives basBasicarchivess) {
        this.basBasicarchivess = basBasicarchivess;
    }

    private BasBasicarchives basBasicarchivess;//与基础档案表一对一

    public BasDeliverystandard getBasDeliverystandards() {
        return basDeliverystandards;
    }

    public void setBasDeliverystandards(BasDeliverystandard basDeliverystandards) {
        this.basDeliverystandards = basDeliverystandards;
    }

    public SyRole getSyRole() {
        return syRole;
    }

    public void setSyRole(SyRole syRole) {
        this.syRole = syRole;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno == null ? null : empno.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getQuerypwd() {
        return querypwd;
    }

    public void setQuerypwd(String querypwd) {
        this.querypwd = querypwd == null ? null : querypwd.trim();
    }

    public Short getRoleid() {
        return roleid;
    }

    public void setRoleid(Short roleid) {
        this.roleid = roleid;
    }

    public Short getEmpunit() {
        return empunit;
    }

    public void setEmpunit(Short empunit) {
        this.empunit = empunit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getDisabled() {
        return disabled;
    }

    public void setDisabled(Short disabled) {
        this.disabled = disabled;
    }

    public SyEmp(String empname, String empno, String pwd, String querypwd, Short roleid, Short empunit, String remark, Short disabled, SyRole syRole) {
        this.empname = empname;
        this.empno = empno;
        this.pwd = pwd;
        this.querypwd = querypwd;
        this.roleid = roleid;
        this.empunit = empunit;
        this.remark = remark;
        this.disabled = disabled;
        this.syRole = syRole;
    }

    public SyEmp() {
    }

    @Override
    public String toString() {
        return "SyEmp{" +
                "id=" + id +
                ", empname='" + empname + '\'' +
                ", empno='" + empno + '\'' +
                ", pwd='" + pwd + '\'' +
                ", querypwd='" + querypwd + '\'' +
                ", roleid=" + roleid +
                ", empunit=" + empunit +
                ", remark='" + remark + '\'' +
                ", disabled=" + disabled +
                ", syRole=" + syRole +
                '}';
    }
}