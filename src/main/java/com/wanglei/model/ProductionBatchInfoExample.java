package com.wanglei.model;

import java.util.ArrayList;
import java.util.List;

public class ProductionBatchInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductionBatchInfoExample() {
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

        public Criteria andMaterialsIdIsNull() {
            addCriterion("MATERIALS_ID is null");
            return (Criteria) this;
        }

        public Criteria andMaterialsIdIsNotNull() {
            addCriterion("MATERIALS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialsIdEqualTo(String value) {
            addCriterion("MATERIALS_ID =", value, "materialsId");
            return (Criteria) this;
        }

        public Criteria andMaterialsIdNotEqualTo(String value) {
            addCriterion("MATERIALS_ID <>", value, "materialsId");
            return (Criteria) this;
        }

        public Criteria andMaterialsIdGreaterThan(String value) {
            addCriterion("MATERIALS_ID >", value, "materialsId");
            return (Criteria) this;
        }

        public Criteria andMaterialsIdGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIALS_ID >=", value, "materialsId");
            return (Criteria) this;
        }

        public Criteria andMaterialsIdLessThan(String value) {
            addCriterion("MATERIALS_ID <", value, "materialsId");
            return (Criteria) this;
        }

        public Criteria andMaterialsIdLessThanOrEqualTo(String value) {
            addCriterion("MATERIALS_ID <=", value, "materialsId");
            return (Criteria) this;
        }

        public Criteria andMaterialsIdLike(String value) {
            addCriterion("MATERIALS_ID like", value, "materialsId");
            return (Criteria) this;
        }

        public Criteria andMaterialsIdNotLike(String value) {
            addCriterion("MATERIALS_ID not like", value, "materialsId");
            return (Criteria) this;
        }

        public Criteria andMaterialsIdIn(List<String> values) {
            addCriterion("MATERIALS_ID in", values, "materialsId");
            return (Criteria) this;
        }

        public Criteria andMaterialsIdNotIn(List<String> values) {
            addCriterion("MATERIALS_ID not in", values, "materialsId");
            return (Criteria) this;
        }

        public Criteria andMaterialsIdBetween(String value1, String value2) {
            addCriterion("MATERIALS_ID between", value1, value2, "materialsId");
            return (Criteria) this;
        }

        public Criteria andMaterialsIdNotBetween(String value1, String value2) {
            addCriterion("MATERIALS_ID not between", value1, value2, "materialsId");
            return (Criteria) this;
        }

        public Criteria andHeatNoIsNull() {
            addCriterion("HEAT_NO is null");
            return (Criteria) this;
        }

        public Criteria andHeatNoIsNotNull() {
            addCriterion("HEAT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andHeatNoEqualTo(String value) {
            addCriterion("HEAT_NO =", value, "heatNo");
            return (Criteria) this;
        }

        public Criteria andHeatNoNotEqualTo(String value) {
            addCriterion("HEAT_NO <>", value, "heatNo");
            return (Criteria) this;
        }

        public Criteria andHeatNoGreaterThan(String value) {
            addCriterion("HEAT_NO >", value, "heatNo");
            return (Criteria) this;
        }

        public Criteria andHeatNoGreaterThanOrEqualTo(String value) {
            addCriterion("HEAT_NO >=", value, "heatNo");
            return (Criteria) this;
        }

        public Criteria andHeatNoLessThan(String value) {
            addCriterion("HEAT_NO <", value, "heatNo");
            return (Criteria) this;
        }

        public Criteria andHeatNoLessThanOrEqualTo(String value) {
            addCriterion("HEAT_NO <=", value, "heatNo");
            return (Criteria) this;
        }

        public Criteria andHeatNoLike(String value) {
            addCriterion("HEAT_NO like", value, "heatNo");
            return (Criteria) this;
        }

        public Criteria andHeatNoNotLike(String value) {
            addCriterion("HEAT_NO not like", value, "heatNo");
            return (Criteria) this;
        }

        public Criteria andHeatNoIn(List<String> values) {
            addCriterion("HEAT_NO in", values, "heatNo");
            return (Criteria) this;
        }

        public Criteria andHeatNoNotIn(List<String> values) {
            addCriterion("HEAT_NO not in", values, "heatNo");
            return (Criteria) this;
        }

        public Criteria andHeatNoBetween(String value1, String value2) {
            addCriterion("HEAT_NO between", value1, value2, "heatNo");
            return (Criteria) this;
        }

        public Criteria andHeatNoNotBetween(String value1, String value2) {
            addCriterion("HEAT_NO not between", value1, value2, "heatNo");
            return (Criteria) this;
        }

        public Criteria andTrimSizeIsNull() {
            addCriterion("TRIM_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andTrimSizeIsNotNull() {
            addCriterion("TRIM_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andTrimSizeEqualTo(String value) {
            addCriterion("TRIM_SIZE =", value, "trimSize");
            return (Criteria) this;
        }

        public Criteria andTrimSizeNotEqualTo(String value) {
            addCriterion("TRIM_SIZE <>", value, "trimSize");
            return (Criteria) this;
        }

        public Criteria andTrimSizeGreaterThan(String value) {
            addCriterion("TRIM_SIZE >", value, "trimSize");
            return (Criteria) this;
        }

        public Criteria andTrimSizeGreaterThanOrEqualTo(String value) {
            addCriterion("TRIM_SIZE >=", value, "trimSize");
            return (Criteria) this;
        }

        public Criteria andTrimSizeLessThan(String value) {
            addCriterion("TRIM_SIZE <", value, "trimSize");
            return (Criteria) this;
        }

        public Criteria andTrimSizeLessThanOrEqualTo(String value) {
            addCriterion("TRIM_SIZE <=", value, "trimSize");
            return (Criteria) this;
        }

        public Criteria andTrimSizeLike(String value) {
            addCriterion("TRIM_SIZE like", value, "trimSize");
            return (Criteria) this;
        }

        public Criteria andTrimSizeNotLike(String value) {
            addCriterion("TRIM_SIZE not like", value, "trimSize");
            return (Criteria) this;
        }

        public Criteria andTrimSizeIn(List<String> values) {
            addCriterion("TRIM_SIZE in", values, "trimSize");
            return (Criteria) this;
        }

        public Criteria andTrimSizeNotIn(List<String> values) {
            addCriterion("TRIM_SIZE not in", values, "trimSize");
            return (Criteria) this;
        }

        public Criteria andTrimSizeBetween(String value1, String value2) {
            addCriterion("TRIM_SIZE between", value1, value2, "trimSize");
            return (Criteria) this;
        }

        public Criteria andTrimSizeNotBetween(String value1, String value2) {
            addCriterion("TRIM_SIZE not between", value1, value2, "trimSize");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentDateIsNull() {
            addCriterion("HEAT_TREATMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentDateIsNotNull() {
            addCriterion("HEAT_TREATMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentDateEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_DATE =", value, "heatTreatmentDate");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentDateNotEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_DATE <>", value, "heatTreatmentDate");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentDateGreaterThan(String value) {
            addCriterion("HEAT_TREATMENT_DATE >", value, "heatTreatmentDate");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentDateGreaterThanOrEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_DATE >=", value, "heatTreatmentDate");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentDateLessThan(String value) {
            addCriterion("HEAT_TREATMENT_DATE <", value, "heatTreatmentDate");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentDateLessThanOrEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_DATE <=", value, "heatTreatmentDate");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentDateLike(String value) {
            addCriterion("HEAT_TREATMENT_DATE like", value, "heatTreatmentDate");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentDateNotLike(String value) {
            addCriterion("HEAT_TREATMENT_DATE not like", value, "heatTreatmentDate");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentDateIn(List<String> values) {
            addCriterion("HEAT_TREATMENT_DATE in", values, "heatTreatmentDate");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentDateNotIn(List<String> values) {
            addCriterion("HEAT_TREATMENT_DATE not in", values, "heatTreatmentDate");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentDateBetween(String value1, String value2) {
            addCriterion("HEAT_TREATMENT_DATE between", value1, value2, "heatTreatmentDate");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentDateNotBetween(String value1, String value2) {
            addCriterion("HEAT_TREATMENT_DATE not between", value1, value2, "heatTreatmentDate");
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