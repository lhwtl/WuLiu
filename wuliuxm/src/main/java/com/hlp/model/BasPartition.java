package com.hlp.model;

public class BasPartition {
    private Short id;

    private String province;//省

    private String city;//城市

    private String county;//区（县）

    private String zonecode;//定区编码

    private String keyword;//关键字

    private Short startint;//起始号

    private Short terminateint;//终止号

    private Short sdint;//单双号

    private String sortingcode;

    private BasZoneinfo basZoneinfo;/*定区信息表一对一*/

    public void setSortingcode(String sortingcode) {
        this.sortingcode = sortingcode;
    }

    public String getSortingcode() {
        return sortingcode;
    }

    public BasZoneinfo getBasZoneinfo() {
        return basZoneinfo;
    }

    public void setBasZoneinfo(BasZoneinfo basZoneinfo) {
        this.basZoneinfo = basZoneinfo;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getZonecode() {
        return zonecode;
    }

    public void setZonecode(String zonecode) {
        this.zonecode = zonecode == null ? null : zonecode.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Short getStartint() {
        return startint;
    }

    public void setStartint(Short startint) {
        this.startint = startint;
    }

    public Short getTerminateint() {
        return terminateint;
    }

    public void setTerminateint(Short terminateint) {
        this.terminateint = terminateint;
    }

    public Short getSdint() {
        return sdint;
    }

    public void setSdint(Short sdint) {
        this.sdint = sdint;
    }

    public BasPartition(Short id, String province, String city, String county, String zonecode, String keyword, Short startint, Short terminateint, Short sdint, String sortingcode) {
        this.id = id;
        this.province = province;
        this.city = city;
        this.county = county;
        this.zonecode = zonecode;
        this.keyword = keyword;
        this.startint = startint;
        this.terminateint = terminateint;
        this.sdint = sdint;
        this.sortingcode = sortingcode;
    }

    public BasPartition() {
    }

    @Override
    public String toString() {
        return "BasPartition{" +
                "id=" + id +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", zonecode='" + zonecode + '\'' +
                ", keyword='" + keyword + '\'' +
                ", startint=" + startint +
                ", terminateint=" + terminateint +
                ", sdint=" + sdint +
                ", basZoneinfo=" + basZoneinfo +
                ", sortingcode=" + sortingcode +
                '}';
    }
}