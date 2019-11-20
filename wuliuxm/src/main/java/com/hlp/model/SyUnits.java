package com.hlp.model;

import java.util.Date;

public class SyUnits {
    private Short id;

    private String name;

    private String remarks;

    private Short operatorid;

    private Date operationtime;

    private BasDeliverystandard basDeliverystandards;//与收派表一对一

    private BasBasicarchives basBasicarchivess;//与基础档案表一对一

    private BasShuttlebus basShuttlebus;//班车设置表一对一

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

    public BasDeliverystandard getBasDeliverystandards() {
        return basDeliverystandards;
    }

    public void setBasDeliverystandards(BasDeliverystandard basDeliverystandards) {
        this.basDeliverystandards = basDeliverystandards;
    }



    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Short getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Short operatorid) {
        this.operatorid = operatorid;
    }

    public Date getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }
}