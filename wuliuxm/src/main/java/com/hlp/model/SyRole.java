package com.hlp.model;

import sun.awt.Symbol;

import java.util.List;

public class SyRole {
    private Short id;

    private String rolename;

    private String roledesc;

    private Short disabled;

    private List<SyEmp> syEmps;/* 与用户一对多*/

    private List<SyMenus> syMenus;/*与权限列表多对的*/

    public List<SyMenus> getSyMenus() {
        return syMenus;
    }

    public void setSyMenus(List<SyMenus> syMenus) {
        this.syMenus = syMenus;
    }

    public List<SyEmp> getSyEmps() {
        return syEmps;
    }

    public void setSyEmps(List<SyEmp> syEmps) {
        this.syEmps = syEmps;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc == null ? null : roledesc.trim();
    }

    public Short getDisabled() {
        return disabled;
    }

    public void setDisabled(Short disabled) {
        this.disabled = disabled;
    }

    public SyRole(String rolename, String roledesc, Short disabled) {
        this.rolename = rolename;
        this.roledesc = roledesc;
        this.disabled = disabled;
    }

    public SyRole() {
    }

    @Override
    public String toString() {
        return "SyRole{" +
                "id=" + id +
                ", rolename='" + rolename + '\'' +
                ", roledesc='" + roledesc + '\'' +
                ", disabled=" + disabled +
                ", syEmps=" + syEmps +
                ", syMenus=" + syMenus +
                '}';
    }
}