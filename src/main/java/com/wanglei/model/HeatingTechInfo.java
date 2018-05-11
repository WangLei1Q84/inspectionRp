package com.wanglei.model;

public class HeatingTechInfo {
    private String heatTreatmentInfoId;

    private String heatTreatmentType;

    private String temperature;

    private String holdingTime;

    private String loadingTimes;

    private String heatingMedium;

    private String quenchant;

    public String getHeatTreatmentInfoId() {
        return heatTreatmentInfoId;
    }

    public void setHeatTreatmentInfoId(String heatTreatmentInfoId) {
        this.heatTreatmentInfoId = heatTreatmentInfoId == null ? null : heatTreatmentInfoId.trim();
    }

    public String getHeatTreatmentType() {
        return heatTreatmentType;
    }

    public void setHeatTreatmentType(String heatTreatmentType) {
        this.heatTreatmentType = heatTreatmentType == null ? null : heatTreatmentType.trim();
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
    }

    public String getHoldingTime() {
        return holdingTime;
    }

    public void setHoldingTime(String holdingTime) {
        this.holdingTime = holdingTime == null ? null : holdingTime.trim();
    }

    public String getLoadingTimes() {
        return loadingTimes;
    }

    public void setLoadingTimes(String loadingTimes) {
        this.loadingTimes = loadingTimes == null ? null : loadingTimes.trim();
    }

    public String getHeatingMedium() {
        return heatingMedium;
    }

    public void setHeatingMedium(String heatingMedium) {
        this.heatingMedium = heatingMedium == null ? null : heatingMedium.trim();
    }

    public String getQuenchant() {
        return quenchant;
    }

    public void setQuenchant(String quenchant) {
        this.quenchant = quenchant == null ? null : quenchant.trim();
    }
}