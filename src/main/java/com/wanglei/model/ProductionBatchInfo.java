package com.wanglei.model;

public class ProductionBatchInfo {
    private String batchId;

    private String productId;

    private String materialsId;

    private String heatNo;

    private String trimSize;

    private String heatTreatmentDate;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getMaterialsId() {
        return materialsId;
    }

    public void setMaterialsId(String materialsId) {
        this.materialsId = materialsId == null ? null : materialsId.trim();
    }

    public String getHeatNo() {
        return heatNo;
    }

    public void setHeatNo(String heatNo) {
        this.heatNo = heatNo == null ? null : heatNo.trim();
    }

    public String getTrimSize() {
        return trimSize;
    }

    public void setTrimSize(String trimSize) {
        this.trimSize = trimSize == null ? null : trimSize.trim();
    }

    public String getHeatTreatmentDate() {
        return heatTreatmentDate;
    }

    public void setHeatTreatmentDate(String heatTreatmentDate) {
        this.heatTreatmentDate = heatTreatmentDate == null ? null : heatTreatmentDate.trim();
    }
}