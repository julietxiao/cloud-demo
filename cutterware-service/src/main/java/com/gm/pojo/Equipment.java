package com.gm.pojo;

public class Equipment {
    private Long id;

    private Long date;

    private Integer geology;

    private Integer model;

    private Integer runningTime;

    private Integer tunnelingDistance;

    private Integer plannedDistance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Integer getGeology() {
        return geology;
    }

    public void setGeology(Integer geology) {
        this.geology = geology;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public Integer getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(Integer runningTime) {
        this.runningTime = runningTime;
    }

    public Integer getTunnelingDistance() {
        return tunnelingDistance;
    }

    public void setTunnelingDistance(Integer tunnelingDistance) {
        this.tunnelingDistance = tunnelingDistance;
    }

    public Integer getPlannedDistance() {
        return plannedDistance;
    }

    public void setPlannedDistance(Integer plannedDistance) {
        this.plannedDistance = plannedDistance;
    }
}