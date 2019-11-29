package com.hlp.model;

import java.util.Date;

public class  LogTrack {
    private Short id;

    private String linetype;

    private String linename;

    private String logisticscar;

    private Short linestate;

    private String nodename;

    private Date starttime;
    private String starttimes;

    private Date arrivaltime;
    private String arrivaltimes;

    private String carint;

    private String nextnodeload;

    private String describe;
    private BasShuttlebus basShuttlebus;

    public void setArrivaltimes(String arrivaltimes) {
        this.arrivaltimes = arrivaltimes;
    }

    public String getArrivaltimes() {
        return arrivaltimes;
    }

    public void setStarttimes(String starttimes) {
        this.starttimes = starttimes;
    }

    public String getStarttimes() {
        return starttimes;
    }

    public void setBasShuttlebus(BasShuttlebus basShuttlebus) {
        this.basShuttlebus = basShuttlebus;
    }

    public BasShuttlebus getBasShuttlebus() {
        return basShuttlebus;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getLinetype() {
        return linetype;
    }

    public void setLinetype(String linetype) {
        this.linetype = linetype == null ? null : linetype.trim();
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename == null ? null : linename.trim();
    }

    public String getLogisticscar() {
        return logisticscar;
    }

    public void setLogisticscar(String logisticscar) {
        this.logisticscar = logisticscar == null ? null : logisticscar.trim();
    }

    public Short getLinestate() {
        return linestate;
    }

    public void setLinestate(Short linestate) {
        this.linestate = linestate;
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename == null ? null : nodename.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(Date arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public String getCarint() {
        return carint;
    }

    public void setCarint(String carint) {
        this.carint = carint == null ? null : carint.trim();
    }

    public String getNextnodeload() {
        return nextnodeload;
    }

    public void setNextnodeload(String nextnodeload) {
        this.nextnodeload = nextnodeload == null ? null : nextnodeload.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
}