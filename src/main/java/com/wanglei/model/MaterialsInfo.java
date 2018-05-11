package com.wanglei.model;

public class MaterialsInfo {
    private String materialsId;

    private String materialsName;

    private String materialsHeatNo;

    public String getMaterialsId() {
        return materialsId;
    }

    public void setMaterialsId(String materialsId) {
        this.materialsId = materialsId == null ? null : materialsId.trim();
    }

    public String getMaterialsName() {
        return materialsName;
    }

    public void setMaterialsName(String materialsName) {
        this.materialsName = materialsName == null ? null : materialsName.trim();
    }

    public String getMaterialsHeatNo() {
        return materialsHeatNo;
    }

    public void setMaterialsHeatNo(String materialsHeatNo) {
        this.materialsHeatNo = materialsHeatNo == null ? null : materialsHeatNo.trim();
    }
}