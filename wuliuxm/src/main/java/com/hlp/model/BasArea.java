package com.hlp.model;

public class BasArea {
    private Short id;

    private String province;//省

    private String city;//城市

    private String county;//区（县）

    private Short postalcode;//邮政编码

    private String simplecode;//简码

    private Short citycode;//城市编码

    private String entryunitid;//进港单位

    private String complementunitid;//出港单位

    private Short nature;//性质

    private Short thearea;//所属区域

    private SyUnits syUnits;//单位表

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

    public Short getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(Short postalcode) {
        this.postalcode = postalcode;
    }

    public String getSimplecode() {
        return simplecode;
    }

    public void setSimplecode(String simplecode) {
        this.simplecode = simplecode == null ? null : simplecode.trim();
    }

    public Short getCitycode() {
        return citycode;
    }

    public void setCitycode(Short citycode) {
        this.citycode = citycode;
    }

    public String getEntryunitid() {
        return entryunitid;
    }

    public void setEntryunitid(String entryunitid) {
        this.entryunitid = entryunitid == null ? null : entryunitid.trim();
    }

    public String getComplementunitid() {
        return complementunitid;
    }

    public void setComplementunitid(String complementunitid) {
        this.complementunitid = complementunitid == null ? null : complementunitid.trim();
    }

    public Short getNature() {
        return nature;
    }

    public void setNature(Short nature) {
        this.nature = nature;
    }

    public Short getThearea() {
        return thearea;
    }

    public void setThearea(Short thearea) {
        this.thearea = thearea;
    }

    @Override
    public String toString() {
        return "BasArea{" +
                "id=" + id +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", postalcode=" + postalcode +
                ", simplecode='" + simplecode + '\'' +
                ", citycode=" + citycode +
                ", entryunitid='" + entryunitid + '\'' +
                ", complementunitid='" + complementunitid + '\'' +
                ", nature=" + nature +
                ", thearea=" + thearea +
                ", syUnits=" + syUnits +
                '}';
    }

    public BasArea() {
    }

    public BasArea(String province, String city, String county, Short postalcode, String simplecode, Short citycode, String entryunitid, String complementunitid, Short nature, Short thearea, SyUnits syUnits) {
        this.province = province;
        this.city = city;
        this.county = county;
        this.postalcode = postalcode;
        this.simplecode = simplecode;
        this.citycode = citycode;
        this.entryunitid = entryunitid;
        this.complementunitid = complementunitid;
        this.nature = nature;
        this.thearea = thearea;
        this.syUnits = syUnits;
    }
}