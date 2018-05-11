package com.wanglei.model;

public class PhysicalPropertyTestInfo {
    private String sampleId;

    private String batchId;

    private String inspectorId;

    private String provingTime;

    private String provingType;

    private String provingResult;

    public String getSampleId() {
        return sampleId;
    }

    public void setSampleId(String sampleId) {
        this.sampleId = sampleId == null ? null : sampleId.trim();
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

    public String getProvingType() {
        return provingType;
    }

    public void setProvingType(String provingType) {
        this.provingType = provingType == null ? null : provingType.trim();
    }

    public String getProvingResult() {
        return provingResult;
    }

    public void setProvingResult(String provingResult) {
        this.provingResult = provingResult == null ? null : provingResult.trim();
    }
}