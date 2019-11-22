package com.hlp.model;

public class SyRolesmenus {
    private Short id;

    private Short roleid;

    private Short menuid;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getRoleid() {
        return roleid;
    }

    public void setRoleid(Short roleid) {
        this.roleid = roleid;
    }

    public Short getMenuid() {
        return menuid;
    }

    public void setMenuid(Short menuid) {
        this.menuid = menuid;
    }

    public SyRolesmenus(Short roleid, Short menuid) {
        this.roleid = roleid;
        this.menuid = menuid;
    }

    public SyRolesmenus() {
    }

    @Override
    public String toString() {
        return "SyRolesmenus{" +
                "id=" + id +
                ", roleid=" + roleid +
                ", menuid=" + menuid +
                '}';
    }
}