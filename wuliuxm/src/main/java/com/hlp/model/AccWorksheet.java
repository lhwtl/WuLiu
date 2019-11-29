package com.hlp.model;

public class AccWorksheet {
    private Short id;

    private String worksheetno;//工作单号

    private String destination;//到达地

    private String producttime;//产品时限

    private Short total;//总件数

    private Short weight;//重量

    private String stowagerequirements;//配载要求

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getWorksheetno() {
        return worksheetno;
    }

    public void setWorksheetno(String worksheetno) {
        this.worksheetno = worksheetno == null ? null : worksheetno.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getProducttime() {
        return producttime;
    }

    public void setProducttime(String producttime) {
        this.producttime = producttime == null ? null : producttime.trim();
    }

    public Short getTotal() {
        return total;
    }

    public void setTotal(Short total) {
        this.total = total;
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    public String getStowagerequirements() {
        return stowagerequirements;
    }

    public void setStowagerequirements(String stowagerequirements) {
        this.stowagerequirements = stowagerequirements == null ? null : stowagerequirements.trim();
    }

    @Override
    public String toString() {
        return "AccWorksheet{" +
                "id=" + id +
                ", worksheetno='" + worksheetno + '\'' +
                ", destination='" + destination + '\'' +
                ", producttime='" + producttime + '\'' +
                ", total=" + total +
                ", weight=" + weight +
                ", stowagerequirements='" + stowagerequirements + '\'' +
                '}';
    }
}