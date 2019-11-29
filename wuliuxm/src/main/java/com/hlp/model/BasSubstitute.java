package com.hlp.model;

public class BasSubstitute {
    private Short id;

    private String empno;//员工工号

    private String empname;//员工名称

    private Long mobileno;//手机号码

    private Short type;//取派员类型

    private Short pda;//是否使用PDA

    private Short standardkg;//收派标准（公斤）

    private Short standardlength;//收派标准（长度）

    private String models;//车型

    private String plateint;//车牌号

    private Short invalidatemark;//作废标记

    private Short subordinateunit;//所属单位

    private SyUnits syUnits;/*单位表一对一*/

    private BasBasicarchives basBasicarchives;/*基础数据表*/

    public BasBasicarchives getBasBasicarchives() {
        return basBasicarchives;
    }

    public void setBasBasicarchives(BasBasicarchives basBasicarchives) {
        this.basBasicarchives = basBasicarchives;
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

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno == null ? null : empno.trim();
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public Long getMobileno() {
        return mobileno;
    }

    public void setMobileno(Long mobileno) {
        this.mobileno = mobileno;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getPda() {
        return pda;
    }

    public void setPda(Short pda) {
        this.pda = pda;
    }

    public Short getStandardkg() {
        return standardkg;
    }

    public void setStandardkg(Short standardkg) {
        this.standardkg = standardkg;
    }

    public Short getStandardlength() {
        return standardlength;
    }

    public void setStandardlength(Short standardlength) {
        this.standardlength = standardlength;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models == null ? null : models.trim();
    }

    public String getPlateint() {
        return plateint;
    }

    public void setPlateint(String plateint) {
        this.plateint = plateint == null ? null : plateint.trim();
    }

    public Short getInvalidatemark() {
        return invalidatemark;
    }

    public void setInvalidatemark(Short invalidatemark) {
        this.invalidatemark = invalidatemark;
    }

    public Short getSubordinateunit() {
        return subordinateunit;
    }

    public void setSubordinateunit(Short subordinateunit) {
        this.subordinateunit = subordinateunit;
    }

    @Override
    public String toString() {
        return "BasSubstitute{" +
                "id=" + id +
                ", empno='" + empno + '\'' +
                ", empname='" + empname + '\'' +
                ", mobileno=" + mobileno +
                ", type=" + type +
                ", pda=" + pda +
                ", standardkg=" + standardkg +
                ", standardlength=" + standardlength +
                ", models='" + models + '\'' +
                ", plateint='" + plateint + '\'' +
                ", invalidatemark=" + invalidatemark +
                ", subordinateunit=" + subordinateunit +
                ", syUnits=" + syUnits +
                ", basBasicarchives=" + basBasicarchives +
                '}';
    }

    public BasSubstitute() {
    }

    public BasSubstitute(String empno, String empname, Long mobileno, Short type, Short pda, Short standardkg, Short standardlength, String models, String plateint, Short invalidatemark, Short subordinateunit, SyUnits syUnits, BasBasicarchives basBasicarchives) {
        this.empno = empno;
        this.empname = empname;
        this.mobileno = mobileno;
        this.type = type;
        this.pda = pda;
        this.standardkg = standardkg;
        this.standardlength = standardlength;
        this.models = models;
        this.plateint = plateint;
        this.invalidatemark = invalidatemark;
        this.subordinateunit = subordinateunit;
        this.syUnits = syUnits;
        this.basBasicarchives = basBasicarchives;
    }
}