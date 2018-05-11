package com.wanglei.model;

import java.util.ArrayList;
import java.util.List;

public class PhysicalPropertyTestInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhysicalPropertyTestInfoExample() {
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

        public Criteria andSampleIdIsNull() {
            addCriterion("SAMPLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSampleIdIsNotNull() {
            addCriterion("SAMPLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSampleIdEqualTo(String value) {
            addCriterion("SAMPLE_ID =", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotEqualTo(String value) {
            addCriterion("SAMPLE_ID <>", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThan(String value) {
            addCriterion("SAMPLE_ID >", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_ID >=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThan(String value) {
            addCriterion("SAMPLE_ID <", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_ID <=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLike(String value) {
            addCriterion("SAMPLE_ID like", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotLike(String value) {
            addCriterion("SAMPLE_ID not like", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdIn(List<String> values) {
            addCriterion("SAMPLE_ID in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotIn(List<String> values) {
            addCriterion("SAMPLE_ID not in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdBetween(String value1, String value2) {
            addCriterion("SAMPLE_ID between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotBetween(String value1, String value2) {
            addCriterion("SAMPLE_ID not between", value1, value2, "sampleId");
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

        public Criteria andProvingTypeIsNull() {
            addCriterion("PROVING_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProvingTypeIsNotNull() {
            addCriterion("PROVING_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProvingTypeEqualTo(String value) {
            addCriterion("PROVING_TYPE =", value, "provingType");
            return (Criteria) this;
        }

        public Criteria andProvingTypeNotEqualTo(String value) {
            addCriterion("PROVING_TYPE <>", value, "provingType");
            return (Criteria) this;
        }

        public Criteria andProvingTypeGreaterThan(String value) {
            addCriterion("PROVING_TYPE >", value, "provingType");
            return (Criteria) this;
        }

        public Criteria andProvingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROVING_TYPE >=", value, "provingType");
            return (Criteria) this;
        }

        public Criteria andProvingTypeLessThan(String value) {
            addCriterion("PROVING_TYPE <", value, "provingType");
            return (Criteria) this;
        }

        public Criteria andProvingTypeLessThanOrEqualTo(String value) {
            addCriterion("PROVING_TYPE <=", value, "provingType");
            return (Criteria) this;
        }

        public Criteria andProvingTypeLike(String value) {
            addCriterion("PROVING_TYPE like", value, "provingType");
            return (Criteria) this;
        }

        public Criteria andProvingTypeNotLike(String value) {
            addCriterion("PROVING_TYPE not like", value, "provingType");
            return (Criteria) this;
        }

        public Criteria andProvingTypeIn(List<String> values) {
            addCriterion("PROVING_TYPE in", values, "provingType");
            return (Criteria) this;
        }

        public Criteria andProvingTypeNotIn(List<String> values) {
            addCriterion("PROVING_TYPE not in", values, "provingType");
            return (Criteria) this;
        }

        public Criteria andProvingTypeBetween(String value1, String value2) {
            addCriterion("PROVING_TYPE between", value1, value2, "provingType");
            return (Criteria) this;
        }

        public Criteria andProvingTypeNotBetween(String value1, String value2) {
            addCriterion("PROVING_TYPE not between", value1, value2, "provingType");
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