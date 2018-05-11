package com.wanglei.model;

import java.util.ArrayList;
import java.util.List;

public class HeatingTechInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HeatingTechInfoExample() {
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

        public Criteria andHeatTreatmentInfoIdIsNull() {
            addCriterion("HEAT_TREATMENT_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentInfoIdIsNotNull() {
            addCriterion("HEAT_TREATMENT_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentInfoIdEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_INFO_ID =", value, "heatTreatmentInfoId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentInfoIdNotEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_INFO_ID <>", value, "heatTreatmentInfoId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentInfoIdGreaterThan(String value) {
            addCriterion("HEAT_TREATMENT_INFO_ID >", value, "heatTreatmentInfoId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_INFO_ID >=", value, "heatTreatmentInfoId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentInfoIdLessThan(String value) {
            addCriterion("HEAT_TREATMENT_INFO_ID <", value, "heatTreatmentInfoId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentInfoIdLessThanOrEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_INFO_ID <=", value, "heatTreatmentInfoId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentInfoIdLike(String value) {
            addCriterion("HEAT_TREATMENT_INFO_ID like", value, "heatTreatmentInfoId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentInfoIdNotLike(String value) {
            addCriterion("HEAT_TREATMENT_INFO_ID not like", value, "heatTreatmentInfoId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentInfoIdIn(List<String> values) {
            addCriterion("HEAT_TREATMENT_INFO_ID in", values, "heatTreatmentInfoId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentInfoIdNotIn(List<String> values) {
            addCriterion("HEAT_TREATMENT_INFO_ID not in", values, "heatTreatmentInfoId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentInfoIdBetween(String value1, String value2) {
            addCriterion("HEAT_TREATMENT_INFO_ID between", value1, value2, "heatTreatmentInfoId");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentInfoIdNotBetween(String value1, String value2) {
            addCriterion("HEAT_TREATMENT_INFO_ID not between", value1, value2, "heatTreatmentInfoId");
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

        public Criteria andTemperatureIsNull() {
            addCriterion("TEMPERATURE is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("TEMPERATURE is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(String value) {
            addCriterion("TEMPERATURE =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(String value) {
            addCriterion("TEMPERATURE <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(String value) {
            addCriterion("TEMPERATURE >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPERATURE >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(String value) {
            addCriterion("TEMPERATURE <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(String value) {
            addCriterion("TEMPERATURE <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLike(String value) {
            addCriterion("TEMPERATURE like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotLike(String value) {
            addCriterion("TEMPERATURE not like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<String> values) {
            addCriterion("TEMPERATURE in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<String> values) {
            addCriterion("TEMPERATURE not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(String value1, String value2) {
            addCriterion("TEMPERATURE between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(String value1, String value2) {
            addCriterion("TEMPERATURE not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andHoldingTimeIsNull() {
            addCriterion("HOLDING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andHoldingTimeIsNotNull() {
            addCriterion("HOLDING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andHoldingTimeEqualTo(String value) {
            addCriterion("HOLDING_TIME =", value, "holdingTime");
            return (Criteria) this;
        }

        public Criteria andHoldingTimeNotEqualTo(String value) {
            addCriterion("HOLDING_TIME <>", value, "holdingTime");
            return (Criteria) this;
        }

        public Criteria andHoldingTimeGreaterThan(String value) {
            addCriterion("HOLDING_TIME >", value, "holdingTime");
            return (Criteria) this;
        }

        public Criteria andHoldingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("HOLDING_TIME >=", value, "holdingTime");
            return (Criteria) this;
        }

        public Criteria andHoldingTimeLessThan(String value) {
            addCriterion("HOLDING_TIME <", value, "holdingTime");
            return (Criteria) this;
        }

        public Criteria andHoldingTimeLessThanOrEqualTo(String value) {
            addCriterion("HOLDING_TIME <=", value, "holdingTime");
            return (Criteria) this;
        }

        public Criteria andHoldingTimeLike(String value) {
            addCriterion("HOLDING_TIME like", value, "holdingTime");
            return (Criteria) this;
        }

        public Criteria andHoldingTimeNotLike(String value) {
            addCriterion("HOLDING_TIME not like", value, "holdingTime");
            return (Criteria) this;
        }

        public Criteria andHoldingTimeIn(List<String> values) {
            addCriterion("HOLDING_TIME in", values, "holdingTime");
            return (Criteria) this;
        }

        public Criteria andHoldingTimeNotIn(List<String> values) {
            addCriterion("HOLDING_TIME not in", values, "holdingTime");
            return (Criteria) this;
        }

        public Criteria andHoldingTimeBetween(String value1, String value2) {
            addCriterion("HOLDING_TIME between", value1, value2, "holdingTime");
            return (Criteria) this;
        }

        public Criteria andHoldingTimeNotBetween(String value1, String value2) {
            addCriterion("HOLDING_TIME not between", value1, value2, "holdingTime");
            return (Criteria) this;
        }

        public Criteria andLoadingTimesIsNull() {
            addCriterion("LOADING_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andLoadingTimesIsNotNull() {
            addCriterion("LOADING_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andLoadingTimesEqualTo(String value) {
            addCriterion("LOADING_TIMES =", value, "loadingTimes");
            return (Criteria) this;
        }

        public Criteria andLoadingTimesNotEqualTo(String value) {
            addCriterion("LOADING_TIMES <>", value, "loadingTimes");
            return (Criteria) this;
        }

        public Criteria andLoadingTimesGreaterThan(String value) {
            addCriterion("LOADING_TIMES >", value, "loadingTimes");
            return (Criteria) this;
        }

        public Criteria andLoadingTimesGreaterThanOrEqualTo(String value) {
            addCriterion("LOADING_TIMES >=", value, "loadingTimes");
            return (Criteria) this;
        }

        public Criteria andLoadingTimesLessThan(String value) {
            addCriterion("LOADING_TIMES <", value, "loadingTimes");
            return (Criteria) this;
        }

        public Criteria andLoadingTimesLessThanOrEqualTo(String value) {
            addCriterion("LOADING_TIMES <=", value, "loadingTimes");
            return (Criteria) this;
        }

        public Criteria andLoadingTimesLike(String value) {
            addCriterion("LOADING_TIMES like", value, "loadingTimes");
            return (Criteria) this;
        }

        public Criteria andLoadingTimesNotLike(String value) {
            addCriterion("LOADING_TIMES not like", value, "loadingTimes");
            return (Criteria) this;
        }

        public Criteria andLoadingTimesIn(List<String> values) {
            addCriterion("LOADING_TIMES in", values, "loadingTimes");
            return (Criteria) this;
        }

        public Criteria andLoadingTimesNotIn(List<String> values) {
            addCriterion("LOADING_TIMES not in", values, "loadingTimes");
            return (Criteria) this;
        }

        public Criteria andLoadingTimesBetween(String value1, String value2) {
            addCriterion("LOADING_TIMES between", value1, value2, "loadingTimes");
            return (Criteria) this;
        }

        public Criteria andLoadingTimesNotBetween(String value1, String value2) {
            addCriterion("LOADING_TIMES not between", value1, value2, "loadingTimes");
            return (Criteria) this;
        }

        public Criteria andHeatingMediumIsNull() {
            addCriterion("HEATING_MEDIUM is null");
            return (Criteria) this;
        }

        public Criteria andHeatingMediumIsNotNull() {
            addCriterion("HEATING_MEDIUM is not null");
            return (Criteria) this;
        }

        public Criteria andHeatingMediumEqualTo(String value) {
            addCriterion("HEATING_MEDIUM =", value, "heatingMedium");
            return (Criteria) this;
        }

        public Criteria andHeatingMediumNotEqualTo(String value) {
            addCriterion("HEATING_MEDIUM <>", value, "heatingMedium");
            return (Criteria) this;
        }

        public Criteria andHeatingMediumGreaterThan(String value) {
            addCriterion("HEATING_MEDIUM >", value, "heatingMedium");
            return (Criteria) this;
        }

        public Criteria andHeatingMediumGreaterThanOrEqualTo(String value) {
            addCriterion("HEATING_MEDIUM >=", value, "heatingMedium");
            return (Criteria) this;
        }

        public Criteria andHeatingMediumLessThan(String value) {
            addCriterion("HEATING_MEDIUM <", value, "heatingMedium");
            return (Criteria) this;
        }

        public Criteria andHeatingMediumLessThanOrEqualTo(String value) {
            addCriterion("HEATING_MEDIUM <=", value, "heatingMedium");
            return (Criteria) this;
        }

        public Criteria andHeatingMediumLike(String value) {
            addCriterion("HEATING_MEDIUM like", value, "heatingMedium");
            return (Criteria) this;
        }

        public Criteria andHeatingMediumNotLike(String value) {
            addCriterion("HEATING_MEDIUM not like", value, "heatingMedium");
            return (Criteria) this;
        }

        public Criteria andHeatingMediumIn(List<String> values) {
            addCriterion("HEATING_MEDIUM in", values, "heatingMedium");
            return (Criteria) this;
        }

        public Criteria andHeatingMediumNotIn(List<String> values) {
            addCriterion("HEATING_MEDIUM not in", values, "heatingMedium");
            return (Criteria) this;
        }

        public Criteria andHeatingMediumBetween(String value1, String value2) {
            addCriterion("HEATING_MEDIUM between", value1, value2, "heatingMedium");
            return (Criteria) this;
        }

        public Criteria andHeatingMediumNotBetween(String value1, String value2) {
            addCriterion("HEATING_MEDIUM not between", value1, value2, "heatingMedium");
            return (Criteria) this;
        }

        public Criteria andQuenchantIsNull() {
            addCriterion("QUENCHANT is null");
            return (Criteria) this;
        }

        public Criteria andQuenchantIsNotNull() {
            addCriterion("QUENCHANT is not null");
            return (Criteria) this;
        }

        public Criteria andQuenchantEqualTo(String value) {
            addCriterion("QUENCHANT =", value, "quenchant");
            return (Criteria) this;
        }

        public Criteria andQuenchantNotEqualTo(String value) {
            addCriterion("QUENCHANT <>", value, "quenchant");
            return (Criteria) this;
        }

        public Criteria andQuenchantGreaterThan(String value) {
            addCriterion("QUENCHANT >", value, "quenchant");
            return (Criteria) this;
        }

        public Criteria andQuenchantGreaterThanOrEqualTo(String value) {
            addCriterion("QUENCHANT >=", value, "quenchant");
            return (Criteria) this;
        }

        public Criteria andQuenchantLessThan(String value) {
            addCriterion("QUENCHANT <", value, "quenchant");
            return (Criteria) this;
        }

        public Criteria andQuenchantLessThanOrEqualTo(String value) {
            addCriterion("QUENCHANT <=", value, "quenchant");
            return (Criteria) this;
        }

        public Criteria andQuenchantLike(String value) {
            addCriterion("QUENCHANT like", value, "quenchant");
            return (Criteria) this;
        }

        public Criteria andQuenchantNotLike(String value) {
            addCriterion("QUENCHANT not like", value, "quenchant");
            return (Criteria) this;
        }

        public Criteria andQuenchantIn(List<String> values) {
            addCriterion("QUENCHANT in", values, "quenchant");
            return (Criteria) this;
        }

        public Criteria andQuenchantNotIn(List<String> values) {
            addCriterion("QUENCHANT not in", values, "quenchant");
            return (Criteria) this;
        }

        public Criteria andQuenchantBetween(String value1, String value2) {
            addCriterion("QUENCHANT between", value1, value2, "quenchant");
            return (Criteria) this;
        }

        public Criteria andQuenchantNotBetween(String value1, String value2) {
            addCriterion("QUENCHANT not between", value1, value2, "quenchant");
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