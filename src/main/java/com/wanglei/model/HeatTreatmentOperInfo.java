package com.wanglei.model;

public class HeatTreatmentOperInfo {
    private String heatTreatmentId;

    private String productId;

    private String heatTreatmentType;

    private String equipmentId;

    private String heatTreatmentTime;

    private Short displayOrder;

    public String getHeatTreatmentId() {
        return heatTreatmentId;
    }

    public void setHeatTreatmentId(String heatTreatmentId) {
        this.heatTreatmentId = heatTreatmentId == null ? null : heatTreatmentId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getHeatTreatmentType() {
        return heatTreatmentType;
    }

    public void setHeatTreatmentType(String heatTreatmentType) {
        this.heatTreatmentType = heatTreatmentType == null ? null : heatTreatmentType.trim();
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId == null ? null : equipmentId.trim();
    }

    public String getHeatTreatmentTime() {
        return heatTreatmentTime;
    }

    public void setHeatTreatmentTime(String heatTreatmentTime) {
        this.heatTreatmentTime = heatTreatmentTime == null ? null : heatTreatmentTime.trim();
    }

    public Short getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Short displayOrder) {
        this.displayOrder = displayOrder;
    }
}