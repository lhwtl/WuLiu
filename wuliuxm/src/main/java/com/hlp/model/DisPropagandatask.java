package com.hlp.model;

import java.util.Date;

public class DisPropagandatask {
    private Short id;

    private String outline;

    private Date releasetime;
    private String releasetimes;

    private Date failuretime;
    private String failuretimes;

    private Short status;

    private String content;

    public void setReleasetimes(String releasetimes) {
        this.releasetimes = releasetimes;
    }

    public String getFailuretimes() {
        return failuretimes;
    }

    public void setFailuretimes(String failuretimes) {
        this.failuretimes = failuretimes;
    }

    public String getReleasetimes() {
        return releasetimes;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline == null ? null : outline.trim();
    }

    public Date getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
    }

    public Date getFailuretime() {
        return failuretime;
    }

    public void setFailuretime(Date failuretime) {
        this.failuretime = failuretime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "DisPropagandatask{" +
                "id=" + id +
                ", outline='" + outline + '\'' +
                ", releasetime=" + releasetime +
                ", releasetimes='" + releasetimes + '\'' +
                ", failuretime=" + failuretime +
                ", failuretimes='" + failuretimes + '\'' +
                ", status=" + status +
                ", content='" + content + '\'' +
                '}';
    }
}