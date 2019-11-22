package com.hlp.model;

public class BasZonecustominfo {
    private Short customcode;

    private String customname;

    private Short mobileno;

    private String cityname;

    private String cstomaddress;

    private Short zoneinfoid;

    private BasZoneinfo basZoneinfo;//定区信息表一对一

    private AccBusinessadmissibility accBusinessadmissibility;/*业务受理表一对一*/

    public AccBusinessadmissibility getAccBusinessadmissibility() {
        return accBusinessadmissibility;
    }

    public void setAccBusinessadmissibility(AccBusinessadmissibility accBusinessadmissibility) {
        this.accBusinessadmissibility = accBusinessadmissibility;
    }

    public BasZoneinfo getBasZoneinfo() {
        return basZoneinfo;
    }

    public void setBasZoneinfo(BasZoneinfo basZoneinfo) {
        this.basZoneinfo = basZoneinfo;
    }

    public Short getCustomcode() {
        return customcode;
    }

    public void setCustomcode(Short customcode) {
        this.customcode = customcode;
    }

    public String getCustomname() {
        return customname;
    }

    public void setCustomname(String customname) {
        this.customname = customname == null ? null : customname.trim();
    }

    public Short getMobileno() {
        return mobileno;
    }

    public void setMobileno(Short mobileno) {
        this.mobileno = mobileno;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public String getCstomaddress() {
        return cstomaddress;
    }

    public void setCstomaddress(String cstomaddress) {
        this.cstomaddress = cstomaddress == null ? null : cstomaddress.trim();
    }

    public Short getZoneinfoid() {
        return zoneinfoid;
    }

    public void setZoneinfoid(Short zoneinfoid) {
        this.zoneinfoid = zoneinfoid;
    }
}