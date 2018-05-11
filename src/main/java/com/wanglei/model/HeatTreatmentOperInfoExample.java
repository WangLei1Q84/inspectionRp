package com.wanglei.model;

import java.util.ArrayList;
import java.util.List;

public class HeatTreatmentOperInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HeatTreatmentOperInfoExample() {
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

        public Criteria andHeatTreatmentIdIsNull() {
            addCriterion("HEAT_TREATMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentIdIsNotNull() {
            addCriterion("HEAT_TREATMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentIdEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_ID =", value, "heatTreatmentId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentIdNotEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_ID <>", value, "heatTreatmentId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentIdGreaterThan(String value) {
            addCriterion("HEAT_TREATMENT_ID >", value, "heatTreatmentId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_ID >=", value, "heatTreatmentId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentIdLessThan(String value) {
            addCriterion("HEAT_TREATMENT_ID <", value, "heatTreatmentId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentIdLessThanOrEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_ID <=", value, "heatTreatmentId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentIdLike(String value) {
            addCriterion("HEAT_TREATMENT_ID like", value, "heatTreatmentId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentIdNotLike(String value) {
            addCriterion("HEAT_TREATMENT_ID not like", value, "heatTreatmentId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentIdIn(List<String> values) {
            addCriterion("HEAT_TREATMENT_ID in", values, "heatTreatmentId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentIdNotIn(List<String> values) {
            addCriterion("HEAT_TREATMENT_ID not in", values, "heatTreatmentId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentIdBetween(String value1, String value2) {
            addCriterion("HEAT_TREATMENT_ID between", value1, value2, "heatTreatmentId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentIdNotBetween(String value1, String value2) {
            addCriterion("HEAT_TREATMENT_ID not between", value1, value2, "heatTreatmentId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("PRODUCT_ID like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("PRODUCT_ID not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTypeIsNull() {
            addCriterion("HEAT_TREATMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTypeIsNotNull() {
            addCriterion("HEAT_TREATMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTypeEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_TYPE =", value, "heatTreatmentType");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTypeNotEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_TYPE <>", value, "heatTreatmentType");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTypeGreaterThan(String value) {
            addCriterion("HEAT_TREATMENT_TYPE >", value, "heatTreatmentType");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_TYPE >=", value, "heatTreatmentType");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTypeLessThan(String value) {
            addCriterion("HEAT_TREATMENT_TYPE <", value, "heatTreatmentType");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTypeLessThanOrEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_TYPE <=", value, "heatTreatmentType");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTypeLike(String value) {
            addCriterion("HEAT_TREATMENT_TYPE like", value, "heatTreatmentType");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTypeNotLike(String value) {
            addCriterion("HEAT_TREATMENT_TYPE not like", value, "heatTreatmentType");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTypeIn(List<String> values) {
            addCriterion("HEAT_TREATMENT_TYPE in", values, "heatTreatmentType");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTypeNotIn(List<String> values) {
            addCriterion("HEAT_TREATMENT_TYPE not in", values, "heatTreatmentType");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTypeBetween(String value1, String value2) {
            addCriterion("HEAT_TREATMENT_TYPE between", value1, value2, "heatTreatmentType");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTypeNotBetween(String value1, String value2) {
            addCriterion("HEAT_TREATMENT_TYPE not between", value1, value2, "heatTreatmentType");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNull() {
            addCriterion("EQUIPMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNotNull() {
            addCriterion("EQUIPMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdEqualTo(String value) {
            addCriterion("EQUIPMENT_ID =", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotEqualTo(String value) {
            addCriterion("EQUIPMENT_ID <>", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThan(String value) {
            addCriterion("EQUIPMENT_ID >", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMENT_ID >=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThan(String value) {
            addCriterion("EQUIPMENT_ID <", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThanOrEqualTo(String value) {
            addCriterion("EQUIPMENT_ID <=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLike(String value) {
            addCriterion("EQUIPMENT_ID like", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotLike(String value) {
            addCriterion("EQUIPMENT_ID not like", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIn(List<String> values) {
            addCriterion("EQUIPMENT_ID in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotIn(List<String> values) {
            addCriterion("EQUIPMENT_ID not in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdBetween(String value1, String value2) {
            addCriterion("EQUIPMENT_ID between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotBetween(String value1, String value2) {
            addCriterion("EQUIPMENT_ID not between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTimeIsNull() {
            addCriterion("HEAT_TREATMENT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTimeIsNotNull() {
            addCriterion("HEAT_TREATMENT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTimeEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_TIME =", value, "heatTreatmentTime");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTimeNotEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_TIME <>", value, "heatTreatmentTime");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTimeGreaterThan(String value) {
            addCriterion("HEAT_TREATMENT_TIME >", value, "heatTreatmentTime");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_TIME >=", value, "heatTreatmentTime");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTimeLessThan(String value) {
            addCriterion("HEAT_TREATMENT_TIME <", value, "heatTreatmentTime");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTimeLessThanOrEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_TIME <=", value, "heatTreatmentTime");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTimeLike(String value) {
            addCriterion("HEAT_TREATMENT_TIME like", value, "heatTreatmentTime");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTimeNotLike(String value) {
            addCriterion("HEAT_TREATMENT_TIME not like", value, "heatTreatmentTime");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTimeIn(List<String> values) {
            addCriterion("HEAT_TREATMENT_TIME in", values, "heatTreatmentTime");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTimeNotIn(List<String> values) {
            addCriterion("HEAT_TREATMENT_TIME not in", values, "heatTreatmentTime");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTimeBetween(String value1, String value2) {
            addCriterion("HEAT_TREATMENT_TIME between", value1, value2, "heatTreatmentTime");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentTimeNotBetween(String value1, String value2) {
            addCriterion("HEAT_TREATMENT_TIME not between", value1, value2, "heatTreatmentTime");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIsNull() {
            addCriterion("DISPLAY_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIsNotNull() {
            addCriterion("DISPLAY_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderEqualTo(Short value) {
            addCriterion("DISPLAY_ORDER =", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotEqualTo(Short value) {
            addCriterion("DISPLAY_ORDER <>", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderGreaterThan(Short value) {
            addCriterion("DISPLAY_ORDER >", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderGreaterThanOrEqualTo(Short value) {
            addCriterion("DISPLAY_ORDER >=", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderLessThan(Short value) {
            addCriterion("DISPLAY_ORDER <", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderLessThanOrEqualTo(Short value) {
            addCriterion("DISPLAY_ORDER <=", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIn(List<Short> values) {
            addCriterion("DISPLAY_ORDER in", values, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotIn(List<Short> values) {
            addCriterion("DISPLAY_ORDER not in", values, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderBetween(Short value1, Short value2) {
            addCriterion("DISPLAY_ORDER between", value1, value2, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotBetween(Short value1, Short value2) {
            addCriterion("DISPLAY_ORDER not between", value1, value2, "displayOrder");
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