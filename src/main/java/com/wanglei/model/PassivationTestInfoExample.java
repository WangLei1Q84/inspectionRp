package com.wanglei.model;

import java.util.ArrayList;
import java.util.List;

public class PassivationTestInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PassivationTestInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPassivationIdIsNull() {
            addCriterion("PASSIVATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPassivationIdIsNotNull() {
            addCriterion("PASSIVATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPassivationIdEqualTo(String value) {
            addCriterion("PASSIVATION_ID =", value, "passivationId");
            return (Criteria) this;
        }

        public Criteria andPassivationIdNotEqualTo(String value) {
            addCriterion("PASSIVATION_ID <>", value, "passivationId");
            return (Criteria) this;
        }

        public Criteria andPassivationIdGreaterThan(String value) {
            addCriterion("PASSIVATION_ID >", value, "passivationId");
            return (Criteria) this;
        }

        public Criteria andPassivationIdGreaterThanOrEqualTo(String value) {
            addCriterion("PASSIVATION_ID >=", value, "passivationId");
            return (Criteria) this;
        }

        public Criteria andPassivationIdLessThan(String value) {
            addCriterion("PASSIVATION_ID <", value, "passivationId");
            return (Criteria) this;
        }

        public Criteria andPassivationIdLessThanOrEqualTo(String value) {
            addCriterion("PASSIVATION_ID <=", value, "passivationId");
            return (Criteria) this;
        }

        public Criteria andPassivationIdLike(String value) {
            addCriterion("PASSIVATION_ID like", value, "passivationId");
            return (Criteria) this;
        }

        public Criteria andPassivationIdNotLike(String value) {
            addCriterion("PASSIVATION_ID not like", value, "passivationId");
            return (Criteria) this;
        }

        public Criteria andPassivationIdIn(List<String> values) {
            addCriterion("PASSIVATION_ID in", values, "passivationId");
            return (Criteria) this;
        }

        public Criteria andPassivationIdNotIn(List<String> values) {
            addCriterion("PASSIVATION_ID not in", values, "passivationId");
            return (Criteria) this;
        }

        public Criteria andPassivationIdBetween(String value1, String value2) {
            addCriterion("PASSIVATION_ID between", value1, value2, "passivationId");
            return (Criteria) this;
        }

        public Criteria andPassivationIdNotBetween(String value1, String value2) {
            addCriterion("PASSIVATION_ID not between", value1, value2, "passivationId");
            return (Criteria) this;
        }

        public Criteria andPassivationTypeIsNull() {
            addCriterion("PASSIVATION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPassivationTypeIsNotNull() {
            addCriterion("PASSIVATION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPassivationTypeEqualTo(String value) {
            addCriterion("PASSIVATION_TYPE =", value, "passivationType");
            return (Criteria) this;
        }

        public Criteria andPassivationTypeNotEqualTo(String value) {
            addCriterion("PASSIVATION_TYPE <>", value, "passivationType");
            return (Criteria) this;
        }

        public Criteria andPassivationTypeGreaterThan(String value) {
            addCriterion("PASSIVATION_TYPE >", value, "passivationType");
            return (Criteria) this;
        }

        public Criteria andPassivationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PASSIVATION_TYPE >=", value, "passivationType");
            return (Criteria) this;
        }

        public Criteria andPassivationTypeLessThan(String value) {
            addCriterion("PASSIVATION_TYPE <", value, "passivationType");
            return (Criteria) this;
        }

        public Criteria andPassivationTypeLessThanOrEqualTo(String value) {
            addCriterion("PASSIVATION_TYPE <=", value, "passivationType");
            return (Criteria) this;
        }

        public Criteria andPassivationTypeLike(String value) {
            addCriterion("PASSIVATION_TYPE like", value, "passivationType");
            return (Criteria) this;
        }

        public Criteria andPassivationTypeNotLike(String value) {
            addCriterion("PASSIVATION_TYPE not like", value, "passivationType");
            return (Criteria) this;
        }

        public Criteria andPassivationTypeIn(List<String> values) {
            addCriterion("PASSIVATION_TYPE in", values, "passivationType");
            return (Criteria) this;
        }

        public Criteria andPassivationTypeNotIn(List<String> values) {
            addCriterion("PASSIVATION_TYPE not in", values, "passivationType");
            return (Criteria) this;
        }

        public Criteria andPassivationTypeBetween(String value1, String value2) {
            addCriterion("PASSIVATION_TYPE between", value1, value2, "passivationType");
            return (Criteria) this;
        }

        public Criteria andPassivationTypeNotBetween(String value1, String value2) {
            addCriterion("PASSIVATION_TYPE not between", value1, value2, "passivationType");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNull() {
            addCriterion("BATCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("BATCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(String value) {
            addCriterion("BATCH_ID =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(String value) {
            addCriterion("BATCH_ID <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(String value) {
            addCriterion("BATCH_ID >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("BATCH_ID >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(String value) {
            addCriterion("BATCH_ID <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(String value) {
            addCriterion("BATCH_ID <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLike(String value) {
            addCriterion("BATCH_ID like", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotLike(String value) {
            addCriterion("BATCH_ID not like", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<String> values) {
            addCriterion("BATCH_ID in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<String> values) {
            addCriterion("BATCH_ID not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(String value1, String value2) {
            addCriterion("BATCH_ID between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(String value1, String value2) {
            addCriterion("BATCH_ID not between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdIsNull() {
            addCriterion("INSPECTOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andInspectorIdIsNotNull() {
            addCriterion("INSPECTOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInspectorIdEqualTo(String value) {
            addCriterion("INSPECTOR_ID =", value, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdNotEqualTo(String value) {
            addCriterion("INSPECTOR_ID <>", value, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdGreaterThan(String value) {
            addCriterion("INSPECTOR_ID >", value, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdGreaterThanOrEqualTo(String value) {
            addCriterion("INSPECTOR_ID >=", value, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdLessThan(String value) {
            addCriterion("INSPECTOR_ID <", value, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdLessThanOrEqualTo(String value) {
            addCriterion("INSPECTOR_ID <=", value, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdLike(String value) {
            addCriterion("INSPECTOR_ID like", value, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdNotLike(String value) {
            addCriterion("INSPECTOR_ID not like", value, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdIn(List<String> values) {
            addCriterion("INSPECTOR_ID in", values, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdNotIn(List<String> values) {
            addCriterion("INSPECTOR_ID not in", values, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdBetween(String value1, String value2) {
            addCriterion("INSPECTOR_ID between", value1, value2, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andInspectorIdNotBetween(String value1, String value2) {
            addCriterion("INSPECTOR_ID not between", value1, value2, "inspectorId");
            return (Criteria) this;
        }

        public Criteria andProvingTimeIsNull() {
            addCriterion("PROVING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andProvingTimeIsNotNull() {
            addCriterion("PROVING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andProvingTimeEqualTo(String value) {
            addCriterion("PROVING_TIME =", value, "provingTime");
            return (Criteria) this;
        }

        public Criteria andProvingTimeNotEqualTo(String value) {
            addCriterion("PROVING_TIME <>", value, "provingTime");
            return (Criteria) this;
        }

        public Criteria andProvingTimeGreaterThan(String value) {
            addCriterion("PROVING_TIME >", value, "provingTime");
            return (Criteria) this;
        }

        public Criteria andProvingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("PROVING_TIME >=", value, "provingTime");
            return (Criteria) this;
        }

        public Criteria andProvingTimeLessThan(String value) {
            addCriterion("PROVING_TIME <", value, "provingTime");
            return (Criteria) this;
        }

        public Criteria andProvingTimeLessThanOrEqualTo(String value) {
            addCriterion("PROVING_TIME <=", value, "provingTime");
            return (Criteria) this;
        }

        public Criteria andProvingTimeLike(String value) {
            addCriterion("PROVING_TIME like", value, "provingTime");
            return (Criteria) this;
        }

        public Criteria andProvingTimeNotLike(String value) {
            addCriterion("PROVING_TIME not like", value, "provingTime");
            return (Criteria) this;
        }

        public Criteria andProvingTimeIn(List<String> values) {
            addCriterion("PROVING_TIME in", values, "provingTime");
            return (Criteria) this;
        }

        public Criteria andProvingTimeNotIn(List<String> values) {
            addCriterion("PROVING_TIME not in", values, "provingTime");
            return (Criteria) this;
        }

        public Criteria andProvingTimeBetween(String value1, String value2) {
            addCriterion("PROVING_TIME between", value1, value2, "provingTime");
            return (Criteria) this;
        }

        public Criteria andProvingTimeNotBetween(String value1, String value2) {
            addCriterion("PROVING_TIME not between", value1, value2, "provingTime");
            return (Criteria) this;
        }

        public Criteria andVisualProvingTimeIsNull() {
            addCriterion("VISUAL_PROVING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andVisualProvingTimeIsNotNull() {
            addCriterion("VISUAL_PROVING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andVisualProvingTimeEqualTo(String value) {
            addCriterion("VISUAL_PROVING_TIME =", value, "visualProvingTime");
            return (Criteria) this;
        }

        public Criteria andVisualProvingTimeNotEqualTo(String value) {
            addCriterion("VISUAL_PROVING_TIME <>", value, "visualProvingTime");
            return (Criteria) this;
        }

        public Criteria andVisualProvingTimeGreaterThan(String value) {
            addCriterion("VISUAL_PROVING_TIME >", value, "visualProvingTime");
            return (Criteria) this;
        }

        public Criteria andVisualProvingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("VISUAL_PROVING_TIME >=", value, "visualProvingTime");
            return (Criteria) this;
        }

        public Criteria andVisualProvingTimeLessThan(String value) {
            addCriterion("VISUAL_PROVING_TIME <", value, "visualProvingTime");
            return (Criteria) this;
        }

        public Criteria andVisualProvingTimeLessThanOrEqualTo(String value) {
            addCriterion("VISUAL_PROVING_TIME <=", value, "visualProvingTime");
            return (Criteria) this;
        }

        public Criteria andVisualProvingTimeLike(String value) {
            addCriterion("VISUAL_PROVING_TIME like", value, "visualProvingTime");
            return (Criteria) this;
        }

        public Criteria andVisualProvingTimeNotLike(String value) {
            addCriterion("VISUAL_PROVING_TIME not like", value, "visualProvingTime");
            return (Criteria) this;
        }

        public Criteria andVisualProvingTimeIn(List<String> values) {
            addCriterion("VISUAL_PROVING_TIME in", values, "visualProvingTime");
            return (Criteria) this;
        }

        public Criteria andVisualProvingTimeNotIn(List<String> values) {
            addCriterion("VISUAL_PROVING_TIME not in", values, "visualProvingTime");
            return (Criteria) this;
        }

        public Criteria andVisualProvingTimeBetween(String value1, String value2) {
            addCriterion("VISUAL_PROVING_TIME between", value1, value2, "visualProvingTime");
            return (Criteria) this;
        }

        public Criteria andVisualProvingTimeNotBetween(String value1, String value2) {
            addCriterion("VISUAL_PROVING_TIME not between", value1, value2, "visualProvingTime");
            return (Criteria) this;
        }

        public Criteria andPassivationTimeIsNull() {
            addCriterion("PASSIVATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPassivationTimeIsNotNull() {
            addCriterion("PASSIVATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPassivationTimeEqualTo(String value) {
            addCriterion("PASSIVATION_TIME =", value, "passivationTime");
            return (Criteria) this;
        }

        public Criteria andPassivationTimeNotEqualTo(String value) {
            addCriterion("PASSIVATION_TIME <>", value, "passivationTime");
            return (Criteria) this;
        }

        public Criteria andPassivationTimeGreaterThan(String value) {
            addCriterion("PASSIVATION_TIME >", value, "passivationTime");
            return (Criteria) this;
        }

        public Criteria andPassivationTimeGreaterThanOrEqualTo(String value) {
            addCriterion("PASSIVATION_TIME >=", value, "passivationTime");
            return (Criteria) this;
        }

        public Criteria andPassivationTimeLessThan(String value) {
            addCriterion("PASSIVATION_TIME <", value, "passivationTime");
            return (Criteria) this;
        }

        public Criteria andPassivationTimeLessThanOrEqualTo(String value) {
            addCriterion("PASSIVATION_TIME <=", value, "passivationTime");
            return (Criteria) this;
        }

        public Criteria andPassivationTimeLike(String value) {
            addCriterion("PASSIVATION_TIME like", value, "passivationTime");
            return (Criteria) this;
        }

        public Criteria andPassivationTimeNotLike(String value) {
            addCriterion("PASSIVATION_TIME not like", value, "passivationTime");
            return (Criteria) this;
        }

        public Criteria andPassivationTimeIn(List<String> values) {
            addCriterion("PASSIVATION_TIME in", values, "passivationTime");
            return (Criteria) this;
        }

        public Criteria andPassivationTimeNotIn(List<String> values) {
            addCriterion("PASSIVATION_TIME not in", values, "passivationTime");
            return (Criteria) this;
        }

        public Criteria andPassivationTimeBetween(String value1, String value2) {
            addCriterion("PASSIVATION_TIME between", value1, value2, "passivationTime");
            return (Criteria) this;
        }

        public Criteria andPassivationTimeNotBetween(String value1, String value2) {
            addCriterion("PASSIVATION_TIME not between", value1, value2, "passivationTime");
            return (Criteria) this;
        }

        public Criteria andPassivationTechStandardIsNull() {
            addCriterion("PASSIVATION_TECH_STANDARD is null");
            return (Criteria) this;
        }

        public Criteria andPassivationTechStandardIsNotNull() {
            addCriterion("PASSIVATION_TECH_STANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andPassivationTechStandardEqualTo(String value) {
            addCriterion("PASSIVATION_TECH_STANDARD =", value, "passivationTechStandard");
            return (Criteria) this;
        }

        public Criteria andPassivationTechStandardNotEqualTo(String value) {
            addCriterion("PASSIVATION_TECH_STANDARD <>", value, "passivationTechStandard");
            return (Criteria) this;
        }

        public Criteria andPassivationTechStandardGreaterThan(String value) {
            addCriterion("PASSIVATION_TECH_STANDARD >", value, "passivationTechStandard");
            return (Criteria) this;
        }

        public Criteria andPassivationTechStandardGreaterThanOrEqualTo(String value) {
            addCriterion("PASSIVATION_TECH_STANDARD >=", value, "passivationTechStandard");
            return (Criteria) this;
        }

        public Criteria andPassivationTechStandardLessThan(String value) {
            addCriterion("PASSIVATION_TECH_STANDARD <", value, "passivationTechStandard");
            return (Criteria) this;
        }

        public Criteria andPassivationTechStandardLessThanOrEqualTo(String value) {
            addCriterion("PASSIVATION_TECH_STANDARD <=", value, "passivationTechStandard");
            return (Criteria) this;
        }

        public Criteria andPassivationTechStandardLike(String value) {
            addCriterion("PASSIVATION_TECH_STANDARD like", value, "passivationTechStandard");
            return (Criteria) this;
        }

        public Criteria andPassivationTechStandardNotLike(String value) {
            addCriterion("PASSIVATION_TECH_STANDARD not like", value, "passivationTechStandard");
            return (Criteria) this;
        }

        public Criteria andPassivationTechStandardIn(List<String> values) {
            addCriterion("PASSIVATION_TECH_STANDARD in", values, "passivationTechStandard");
            return (Criteria) this;
        }

        public Criteria andPassivationTechStandardNotIn(List<String> values) {
            addCriterion("PASSIVATION_TECH_STANDARD not in", values, "passivationTechStandard");
            return (Criteria) this;
        }

        public Criteria andPassivationTechStandardBetween(String value1, String value2) {
            addCriterion("PASSIVATION_TECH_STANDARD between", value1, value2, "passivationTechStandard");
            return (Criteria) this;
        }

        public Criteria andPassivationTechStandardNotBetween(String value1, String value2) {
            addCriterion("PASSIVATION_TECH_STANDARD not between", value1, value2, "passivationTechStandard");
            return (Criteria) this;
        }

        public Criteria andTestBoxTemperatureIsNull() {
            addCriterion("TEST_BOX_TEMPERATURE is null");
            return (Criteria) this;
        }

        public Criteria andTestBoxTemperatureIsNotNull() {
            addCriterion("TEST_BOX_TEMPERATURE is not null");
            return (Criteria) this;
        }

        public Criteria andTestBoxTemperatureEqualTo(String value) {
            addCriterion("TEST_BOX_TEMPERATURE =", value, "testBoxTemperature");
            return (Criteria) this;
        }

        public Criteria andTestBoxTemperatureNotEqualTo(String value) {
            addCriterion("TEST_BOX_TEMPERATURE <>", value, "testBoxTemperature");
            return (Criteria) this;
        }

        public Criteria andTestBoxTemperatureGreaterThan(String value) {
            addCriterion("TEST_BOX_TEMPERATURE >", value, "testBoxTemperature");
            return (Criteria) this;
        }

        public Criteria andTestBoxTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_BOX_TEMPERATURE >=", value, "testBoxTemperature");
            return (Criteria) this;
        }

        public Criteria andTestBoxTemperatureLessThan(String value) {
            addCriterion("TEST_BOX_TEMPERATURE <", value, "testBoxTemperature");
            return (Criteria) this;
        }

        public Criteria andTestBoxTemperatureLessThanOrEqualTo(String value) {
            addCriterion("TEST_BOX_TEMPERATURE <=", value, "testBoxTemperature");
            return (Criteria) this;
        }

        public Criteria andTestBoxTemperatureLike(String value) {
            addCriterion("TEST_BOX_TEMPERATURE like", value, "testBoxTemperature");
            return (Criteria) this;
        }

        public Criteria andTestBoxTemperatureNotLike(String value) {
            addCriterion("TEST_BOX_TEMPERATURE not like", value, "testBoxTemperature");
            return (Criteria) this;
        }

        public Criteria andTestBoxTemperatureIn(List<String> values) {
            addCriterion("TEST_BOX_TEMPERATURE in", values, "testBoxTemperature");
            return (Criteria) this;
        }

        public Criteria andTestBoxTemperatureNotIn(List<String> values) {
            addCriterion("TEST_BOX_TEMPERATURE not in", values, "testBoxTemperature");
            return (Criteria) this;
        }

        public Criteria andTestBoxTemperatureBetween(String value1, String value2) {
            addCriterion("TEST_BOX_TEMPERATURE between", value1, value2, "testBoxTemperature");
            return (Criteria) this;
        }

        public Criteria andTestBoxTemperatureNotBetween(String value1, String value2) {
            addCriterion("TEST_BOX_TEMPERATURE not between", value1, value2, "testBoxTemperature");
            return (Criteria) this;
        }

        public Criteria andSprayTowerTemperatureIsNull() {
            addCriterion("SPRAY_TOWER_TEMPERATURE is null");
            return (Criteria) this;
        }

        public Criteria andSprayTowerTemperatureIsNotNull() {
            addCriterion("SPRAY_TOWER_TEMPERATURE is not null");
            return (Criteria) this;
        }

        public Criteria andSprayTowerTemperatureEqualTo(String value) {
            addCriterion("SPRAY_TOWER_TEMPERATURE =", value, "sprayTowerTemperature");
            return (Criteria) this;
        }

        public Criteria andSprayTowerTemperatureNotEqualTo(String value) {
            addCriterion("SPRAY_TOWER_TEMPERATURE <>", value, "sprayTowerTemperature");
            return (Criteria) this;
        }

        public Criteria andSprayTowerTemperatureGreaterThan(String value) {
            addCriterion("SPRAY_TOWER_TEMPERATURE >", value, "sprayTowerTemperature");
            return (Criteria) this;
        }

        public Criteria andSprayTowerTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("SPRAY_TOWER_TEMPERATURE >=", value, "sprayTowerTemperature");
            return (Criteria) this;
        }

        public Criteria andSprayTowerTemperatureLessThan(String value) {
            addCriterion("SPRAY_TOWER_TEMPERATURE <", value, "sprayTowerTemperature");
            return (Criteria) this;
        }

        public Criteria andSprayTowerTemperatureLessThanOrEqualTo(String value) {
            addCriterion("SPRAY_TOWER_TEMPERATURE <=", value, "sprayTowerTemperature");
            return (Criteria) this;
        }

        public Criteria andSprayTowerTemperatureLike(String value) {
            addCriterion("SPRAY_TOWER_TEMPERATURE like", value, "sprayTowerTemperature");
            return (Criteria) this;
        }

        public Criteria andSprayTowerTemperatureNotLike(String value) {
            addCriterion("SPRAY_TOWER_TEMPERATURE not like", value, "sprayTowerTemperature");
            return (Criteria) this;
        }

        public Criteria andSprayTowerTemperatureIn(List<String> values) {
            addCriterion("SPRAY_TOWER_TEMPERATURE in", values, "sprayTowerTemperature");
            return (Criteria) this;
        }

        public Criteria andSprayTowerTemperatureNotIn(List<String> values) {
            addCriterion("SPRAY_TOWER_TEMPERATURE not in", values, "sprayTowerTemperature");
            return (Criteria) this;
        }

        public Criteria andSprayTowerTemperatureBetween(String value1, String value2) {
            addCriterion("SPRAY_TOWER_TEMPERATURE between", value1, value2, "sprayTowerTemperature");
            return (Criteria) this;
        }

        public Criteria andSprayTowerTemperatureNotBetween(String value1, String value2) {
            addCriterion("SPRAY_TOWER_TEMPERATURE not between", value1, value2, "sprayTowerTemperature");
            return (Criteria) this;
        }

        public Criteria andSprayPressureIsNull() {
            addCriterion("SPRAY_PRESSURE is null");
            return (Criteria) this;
        }

        public Criteria andSprayPressureIsNotNull() {
            addCriterion("SPRAY_PRESSURE is not null");
            return (Criteria) this;
        }

        public Criteria andSprayPressureEqualTo(String value) {
            addCriterion("SPRAY_PRESSURE =", value, "sprayPressure");
            return (Criteria) this;
        }

        public Criteria andSprayPressureNotEqualTo(String value) {
            addCriterion("SPRAY_PRESSURE <>", value, "sprayPressure");
            return (Criteria) this;
        }

        public Criteria andSprayPressureGreaterThan(String value) {
            addCriterion("SPRAY_PRESSURE >", value, "sprayPressure");
            return (Criteria) this;
        }

        public Criteria andSprayPressureGreaterThanOrEqualTo(String value) {
            addCriterion("SPRAY_PRESSURE >=", value, "sprayPressure");
            return (Criteria) this;
        }

        public Criteria andSprayPressureLessThan(String value) {
            addCriterion("SPRAY_PRESSURE <", value, "sprayPressure");
            return (Criteria) this;
        }

        public Criteria andSprayPressureLessThanOrEqualTo(String value) {
            addCriterion("SPRAY_PRESSURE <=", value, "sprayPressure");
            return (Criteria) this;
        }

        public Criteria andSprayPressureLike(String value) {
            addCriterion("SPRAY_PRESSURE like", value, "sprayPressure");
            return (Criteria) this;
        }

        public Criteria andSprayPressureNotLike(String value) {
            addCriterion("SPRAY_PRESSURE not like", value, "sprayPressure");
            return (Criteria) this;
        }

        public Criteria andSprayPressureIn(List<String> values) {
            addCriterion("SPRAY_PRESSURE in", values, "sprayPressure");
            return (Criteria) this;
        }

        public Criteria andSprayPressureNotIn(List<String> values) {
            addCriterion("SPRAY_PRESSURE not in", values, "sprayPressure");
            return (Criteria) this;
        }

        public Criteria andSprayPressureBetween(String value1, String value2) {
            addCriterion("SPRAY_PRESSURE between", value1, value2, "sprayPressure");
            return (Criteria) this;
        }

        public Criteria andSprayPressureNotBetween(String value1, String value2) {
            addCriterion("SPRAY_PRESSURE not between", value1, value2, "sprayPressure");
            return (Criteria) this;
        }

        public Criteria andSaltWaterNumIsNull() {
            addCriterion("SALT_WATER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSaltWaterNumIsNotNull() {
            addCriterion("SALT_WATER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSaltWaterNumEqualTo(String value) {
            addCriterion("SALT_WATER_NUM =", value, "saltWaterNum");
            return (Criteria) this;
        }

        public Criteria andSaltWaterNumNotEqualTo(String value) {
            addCriterion("SALT_WATER_NUM <>", value, "saltWaterNum");
            return (Criteria) this;
        }

        public Criteria andSaltWaterNumGreaterThan(String value) {
            addCriterion("SALT_WATER_NUM >", value, "saltWaterNum");
            return (Criteria) this;
        }

        public Criteria andSaltWaterNumGreaterThanOrEqualTo(String value) {
            addCriterion("SALT_WATER_NUM >=", value, "saltWaterNum");
            return (Criteria) this;
        }

        public Criteria andSaltWaterNumLessThan(String value) {
            addCriterion("SALT_WATER_NUM <", value, "saltWaterNum");
            return (Criteria) this;
        }

        public Criteria andSaltWaterNumLessThanOrEqualTo(String value) {
            addCriterion("SALT_WATER_NUM <=", value, "saltWaterNum");
            return (Criteria) this;
        }

        public Criteria andSaltWaterNumLike(String value) {
            addCriterion("SALT_WATER_NUM like", value, "saltWaterNum");
            return (Criteria) this;
        }

        public Criteria andSaltWaterNumNotLike(String value) {
            addCriterion("SALT_WATER_NUM not like", value, "saltWaterNum");
            return (Criteria) this;
        }

        public Criteria andSaltWaterNumIn(List<String> values) {
            addCriterion("SALT_WATER_NUM in", values, "saltWaterNum");
            return (Criteria) this;
        }

        public Criteria andSaltWaterNumNotIn(List<String> values) {
            addCriterion("SALT_WATER_NUM not in", values, "saltWaterNum");
            return (Criteria) this;
        }

        public Criteria andSaltWaterNumBetween(String value1, String value2) {
            addCriterion("SALT_WATER_NUM between", value1, value2, "saltWaterNum");
            return (Criteria) this;
        }

        public Criteria andSaltWaterNumNotBetween(String value1, String value2) {
            addCriterion("SALT_WATER_NUM not between", value1, value2, "saltWaterNum");
            return (Criteria) this;
        }

        public Criteria andSaltWaterDensityTemperatureIsNull() {
            addCriterion("SALT_WATER_DENSITY_TEMPERATURE is null");
            return (Criteria) this;
        }

        public Criteria andSaltWaterDensityTemperatureIsNotNull() {
            addCriterion("SALT_WATER_DENSITY_TEMPERATURE is not null");
            return (Criteria) this;
        }

        public Criteria andSaltWaterDensityTemperatureEqualTo(String value) {
            addCriterion("SALT_WATER_DENSITY_TEMPERATURE =", value, "saltWaterDensityTemperature");
            return (Criteria) this;
        }

        public Criteria andSaltWaterDensityTemperatureNotEqualTo(String value) {
            addCriterion("SALT_WATER_DENSITY_TEMPERATURE <>", value, "saltWaterDensityTemperature");
            return (Criteria) this;
        }

        public Criteria andSaltWaterDensityTemperatureGreaterThan(String value) {
            addCriterion("SALT_WATER_DENSITY_TEMPERATURE >", value, "saltWaterDensityTemperature");
            return (Criteria) this;
        }

        public Criteria andSaltWaterDensityTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("SALT_WATER_DENSITY_TEMPERATURE >=", value, "saltWaterDensityTemperature");
            return (Criteria) this;
        }

        public Criteria andSaltWaterDensityTemperatureLessThan(String value) {
            addCriterion("SALT_WATER_DENSITY_TEMPERATURE <", value, "saltWaterDensityTemperature");
            return (Criteria) this;
        }

        public Criteria andSaltWaterDensityTemperatureLessThanOrEqualTo(String value) {
            addCriterion("SALT_WATER_DENSITY_TEMPERATURE <=", value, "saltWaterDensityTemperature");
            return (Criteria) this;
        }

        public Criteria andSaltWaterDensityTemperatureLike(String value) {
            addCriterion("SALT_WATER_DENSITY_TEMPERATURE like", value, "saltWaterDensityTemperature");
            return (Criteria) this;
        }

        public Criteria andSaltWaterDensityTemperatureNotLike(String value) {
            addCriterion("SALT_WATER_DENSITY_TEMPERATURE not like", value, "saltWaterDensityTemperature");
            return (Criteria) this;
        }

        public Criteria andSaltWaterDensityTemperatureIn(List<String> values) {
            addCriterion("SALT_WATER_DENSITY_TEMPERATURE in", values, "saltWaterDensityTemperature");
            return (Criteria) this;
        }

        public Criteria andSaltWaterDensityTemperatureNotIn(List<String> values) {
            addCriterion("SALT_WATER_DENSITY_TEMPERATURE not in", values, "saltWaterDensityTemperature");
            return (Criteria) this;
        }

        public Criteria andSaltWaterDensityTemperatureBetween(String value1, String value2) {
            addCriterion("SALT_WATER_DENSITY_TEMPERATURE between", value1, value2, "saltWaterDensityTemperature");
            return (Criteria) this;
        }

        public Criteria andSaltWaterDensityTemperatureNotBetween(String value1, String value2) {
            addCriterion("SALT_WATER_DENSITY_TEMPERATURE not between", value1, value2, "saltWaterDensityTemperature");
            return (Criteria) this;
        }

        public Criteria andSaltWaterPhIsNull() {
            addCriterion("SALT_WATER_PH is null");
            return (Criteria) this;
        }

        public Criteria andSaltWaterPhIsNotNull() {
            addCriterion("SALT_WATER_PH is not null");
            return (Criteria) this;
        }

        public Criteria andSaltWaterPhEqualTo(String value) {
            addCriterion("SALT_WATER_PH =", value, "saltWaterPh");
            return (Criteria) this;
        }

        public Criteria andSaltWaterPhNotEqualTo(String value) {
            addCriterion("SALT_WATER_PH <>", value, "saltWaterPh");
            return (Criteria) this;
        }

        public Criteria andSaltWaterPhGreaterThan(String value) {
            addCriterion("SALT_WATER_PH >", value, "saltWaterPh");
            return (Criteria) this;
        }

        public Criteria andSaltWaterPhGreaterThanOrEqualTo(String value) {
            addCriterion("SALT_WATER_PH >=", value, "saltWaterPh");
            return (Criteria) this;
        }

        public Criteria andSaltWaterPhLessThan(String value) {
            addCriterion("SALT_WATER_PH <", value, "saltWaterPh");
            return (Criteria) this;
        }

        public Criteria andSaltWaterPhLessThanOrEqualTo(String value) {
            addCriterion("SALT_WATER_PH <=", value, "saltWaterPh");
            return (Criteria) this;
        }

        public Criteria andSaltWaterPhLike(String value) {
            addCriterion("SALT_WATER_PH like", value, "saltWaterPh");
            return (Criteria) this;
        }

        public Criteria andSaltWaterPhNotLike(String value) {
            addCriterion("SALT_WATER_PH not like", value, "saltWaterPh");
            return (Criteria) this;
        }

        public Criteria andSaltWaterPhIn(List<String> values) {
            addCriterion("SALT_WATER_PH in", values, "saltWaterPh");
            return (Criteria) this;
        }

        public Criteria andSaltWaterPhNotIn(List<String> values) {
            addCriterion("SALT_WATER_PH not in", values, "saltWaterPh");
            return (Criteria) this;
        }

        public Criteria andSaltWaterPhBetween(String value1, String value2) {
            addCriterion("SALT_WATER_PH between", value1, value2, "saltWaterPh");
            return (Criteria) this;
        }

        public Criteria andSaltWaterPhNotBetween(String value1, String value2) {
            addCriterion("SALT_WATER_PH not between", value1, value2, "saltWaterPh");
            return (Criteria) this;
        }

        public Criteria andProvingResultIsNull() {
            addCriterion("PROVING_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andProvingResultIsNotNull() {
            addCriterion("PROVING_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andProvingResultEqualTo(String value) {
            addCriterion("PROVING_RESULT =", value, "provingResult");
            return (Criteria) this;
        }

        public Criteria andProvingResultNotEqualTo(String value) {
            addCriterion("PROVING_RESULT <>", value, "provingResult");
            return (Criteria) this;
        }

        public Criteria andProvingResultGreaterThan(String value) {
            addCriterion("PROVING_RESULT >", value, "provingResult");
            return (Criteria) this;
        }

        public Criteria andProvingResultGreaterThanOrEqualTo(String value) {
            addCriterion("PROVING_RESULT >=", value, "provingResult");
            return (Criteria) this;
        }

        public Criteria andProvingResultLessThan(String value) {
            addCriterion("PROVING_RESULT <", value, "provingResult");
            return (Criteria) this;
        }

        public Criteria andProvingResultLessThanOrEqualTo(String value) {
            addCriterion("PROVING_RESULT <=", value, "provingResult");
            return (Criteria) this;
        }

        public Criteria andProvingResultLike(String value) {
            addCriterion("PROVING_RESULT like", value, "provingResult");
            return (Criteria) this;
        }

        public Criteria andProvingResultNotLike(String value) {
            addCriterion("PROVING_RESULT not like", value, "provingResult");
            return (Criteria) this;
        }

        public Criteria andProvingResultIn(List<String> values) {
            addCriterion("PROVING_RESULT in", values, "provingResult");
            return (Criteria) this;
        }

        public Criteria andProvingResultNotIn(List<String> values) {
            addCriterion("PROVING_RESULT not in", values, "provingResult");
            return (Criteria) this;
        }

        public Criteria andProvingResultBetween(String value1, String value2) {
            addCriterion("PROVING_RESULT between", value1, value2, "provingResult");
            return (Criteria) this;
        }

        public Criteria andProvingResultNotBetween(String value1, String value2) {
            addCriterion("PROVING_RESULT not between", value1, value2, "provingResult");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}