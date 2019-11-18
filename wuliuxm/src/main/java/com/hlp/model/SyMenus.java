package com.hlp.model;

import sun.awt.Symbol;

import java.util.List;

public class SyMenus {
    private Short id;

    private String parentid;

    private String type;

    private String text;

    private String url;

    private String tip;

    private List<SyRole> syRoles;/*与角色多对的*/

    private List<SyMenus> symbols;/*再加一个自身*/

    public List<SyMenus> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<SyMenus> symbols) {
        this.symbols = symbols;
    }

    public List<SyRole> getSyRoles() {
        return syRoles;
    }

    public void setSyRoles(List<SyRole> syRoles) {
        this.syRoles = syRoles;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip == null ? null : tip.trim();
    }

    public SyMenus(String parentid, String type, String text, String url, String tip) {
        this.parentid = parentid;
        this.type = type;
        this.text = text;
        this.url = url;
        this.tip = tip;
    }

    public SyMenus() {
    }

    @Override
    public String toString() {
        return "SyMenus{" +
                "id=" + id +
                ", parentid='" + parentid + '\'' +
                ", type='" + type + '\'' +
                ", text='" + text + '\'' +
                ", url='" + url + '\'' +
                ", tip='" + tip + '\'' +
                ", syRoles=" + syRoles +
                ", symbols=" + symbols +
                '}';
    }
}