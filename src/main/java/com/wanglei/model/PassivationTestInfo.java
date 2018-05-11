package com.wanglei.model;

public class PassivationTestInfo {
    private String passivationId;

    private String passivationType;

    private String batchId;

    private String inspectorId;

    private String provingTime;

    private String visualProvingTime;

    private String passivationTime;

    private String passivationTechStandard;

    private String testBoxTemperature;

    private String sprayTowerTemperature;

    private String sprayPressure;

    private String saltWaterNum;

    private String saltWaterDensityTemperature;

    private String saltWaterPh;

    private String provingResult;

    public String getPassivationId() {
        return passivationId;
    }

    public void setPassivationId(String passivationId) {
        this.passivationId = passivationId == null ? null : passivationId.trim();
    }

    public String getPassivationType() {
        return passivationType;
    }

    public void setPassivationType(String passivationType) {
        this.passivationType = passivationType == null ? null : passivationType.trim();
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    public String getInspectorId() {
        return inspectorId;
    }

    public void setInspectorId(String inspectorId) {
        this.inspectorId = inspectorId == null ? null : inspectorId.trim();
    }

    public String getProvingTime() {
        return provingTime;
    }

    public void setProvingTime(String provingTime) {
        this.provingTime = provingTime == null ? null : provingTime.trim();
    }

    public String getVisualProvingTime() {
        return visualProvingTime;
    }

    public void setVisualProvingTime(String visualProvingTime) {
        this.visualProvingTime = visualProvingTime == null ? null : visualProvingTime.trim();
    }

    public String getPassivationTime() {
        return passivationTime;
    }

    public void setPassivationTime(String passivationTime) {
        this.passivationTime = passivationTime == null ? null : passivationTime.trim();
    }

    public String getPassivationTechStandard() {
        return passivationTechStandard;
    }

    public void setPassivationTechStandard(String passivationTechStandard) {
        this.passivationTechStandard = passivationTechStandard == null ? null : passivationTechStandard.trim();
    }

    public String getTestBoxTemperature() {
        return testBoxTemperature;
    }

    public void setTestBoxTemperature(String testBoxTemperature) {
        this.testBoxTemperature = testBoxTemperature == null ? null : testBoxTemperature.trim();
    }

    public String getSprayTowerTemperature() {
        return sprayTowerTemperature;
    }

    public void setSprayTowerTemperature(String sprayTowerTemperature) {
        this.sprayTowerTemperature = sprayTowerTemperature == null ? null : sprayTowerTemperature.trim();
    }

    public String getSprayPressure() {
        return sprayPressure;
    }

    public void setSprayPressure(String sprayPressure) {
        this.sprayPressure = sprayPressure == null ? null : sprayPressure.trim();
    }

    public String getSaltWaterNum() {
        return saltWaterNum;
    }

    public void setSaltWaterNum(String saltWaterNum) {
        this.saltWaterNum = saltWaterNum == null ? null : saltWaterNum.trim();
    }

    public String getSaltWaterDensityTemperature() {
        return saltWaterDensityTemperature;
    }

    public void setSaltWaterDensityTemperature(String saltWaterDensityTemperature) {
        this.saltWaterDensityTemperature = saltWaterDensityTemperature == null ? null : saltWaterDensityTemperature.trim();
    }

    public String getSaltWaterPh() {
        return saltWaterPh;
    }

    public void setSaltWaterPh(String saltWaterPh) {
        this.saltWaterPh = saltWaterPh == null ? null : saltWaterPh.trim();
    }

    public String getProvingResult() {
        return provingResult;
    }

    public void setProvingResult(String provingResult) {
        this.provingResult = provingResult == null ? null : provingResult.trim();
    }
}