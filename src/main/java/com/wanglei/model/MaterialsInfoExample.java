package com.wanglei.model;

import java.util.ArrayList;
import java.util.List;

public class MaterialsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialsInfoExample() {
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

        public Criteria andMaterialsNameIsNull() {
            addCriterion("MATERIALS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMaterialsNameIsNotNull() {
            addCriterion("MATERIALS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialsNameEqualTo(String value) {
            addCriterion("MATERIALS_NAME =", value, "materialsName");
            return (Criteria) this;
        }

        public Criteria andMaterialsNameNotEqualTo(String value) {
            addCriterion("MATERIALS_NAME <>", value, "materialsName");
            return (Criteria) this;
        }

        public Criteria andMaterialsNameGreaterThan(String value) {
            addCriterion("MATERIALS_NAME >", value, "materialsName");
            return (Criteria) this;
        }

        public Criteria andMaterialsNameGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIALS_NAME >=", value, "materialsName");
            return (Criteria) this;
        }

        public Criteria andMaterialsNameLessThan(String value) {
            addCriterion("MATERIALS_NAME <", value, "materialsName");
            return (Criteria) this;
        }

        public Criteria andMaterialsNameLessThanOrEqualTo(String value) {
            addCriterion("MATERIALS_NAME <=", value, "materialsName");
            return (Criteria) this;
        }

        public Criteria andMaterialsNameLike(String value) {
            addCriterion("MATERIALS_NAME like", value, "materialsName");
            return (Criteria) this;
        }

        public Criteria andMaterialsNameNotLike(String value) {
            addCriterion("MATERIALS_NAME not like", value, "materialsName");
            return (Criteria) this;
        }

        public Criteria andMaterialsNameIn(List<String> values) {
            addCriterion("MATERIALS_NAME in", values, "materialsName");
            return (Criteria) this;
        }

        public Criteria andMaterialsNameNotIn(List<String> values) {
            addCriterion("MATERIALS_NAME not in", values, "materialsName");
            return (Criteria) this;
        }

        public Criteria andMaterialsNameBetween(String value1, String value2) {
            addCriterion("MATERIALS_NAME between", value1, value2, "materialsName");
            return (Criteria) this;
        }

        public Criteria andMaterialsNameNotBetween(String value1, String value2) {
            addCriterion("MATERIALS_NAME not between", value1, value2, "materialsName");
            return (Criteria) this;
        }

        public Criteria andMaterialsHeatNoIsNull() {
            addCriterion("MATERIALS_HEAT_NO is null");
            return (Criteria) this;
        }

        public Criteria andMaterialsHeatNoIsNotNull() {
            addCriterion("MATERIALS_HEAT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialsHeatNoEqualTo(String value) {
            addCriterion("MATERIALS_HEAT_NO =", value, "materialsHeatNo");
            return (Criteria) this;
        }

        public Criteria andMaterialsHeatNoNotEqualTo(String value) {
            addCriterion("MATERIALS_HEAT_NO <>", value, "materialsHeatNo");
            return (Criteria) this;
        }

        public Criteria andMaterialsHeatNoGreaterThan(String value) {
            addCriterion("MATERIALS_HEAT_NO >", value, "materialsHeatNo");
            return (Criteria) this;
        }

        public Criteria andMaterialsHeatNoGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIALS_HEAT_NO >=", value, "materialsHeatNo");
            return (Criteria) this;
        }

        public Criteria andMaterialsHeatNoLessThan(String value) {
            addCriterion("MATERIALS_HEAT_NO <", value, "materialsHeatNo");
            return (Criteria) this;
        }

        public Criteria andMaterialsHeatNoLessThanOrEqualTo(String value) {
            addCriterion("MATERIALS_HEAT_NO <=", value, "materialsHeatNo");
            return (Criteria) this;
        }

        public Criteria andMaterialsHeatNoLike(String value) {
            addCriterion("MATERIALS_HEAT_NO like", value, "materialsHeatNo");
            return (Criteria) this;
        }

        public Criteria andMaterialsHeatNoNotLike(String value) {
            addCriterion("MATERIALS_HEAT_NO not like", value, "materialsHeatNo");
            return (Criteria) this;
        }

        public Criteria andMaterialsHeatNoIn(List<String> values) {
            addCriterion("MATERIALS_HEAT_NO in", values, "materialsHeatNo");
            return (Criteria) this;
        }

        public Criteria andMaterialsHeatNoNotIn(List<String> values) {
            addCriterion("MATERIALS_HEAT_NO not in", values, "materialsHeatNo");
            return (Criteria) this;
        }

        public Criteria andMaterialsHeatNoBetween(String value1, String value2) {
            addCriterion("MATERIALS_HEAT_NO between", value1, value2, "materialsHeatNo");
            return (Criteria) this;
        }

        public Criteria andMaterialsHeatNoNotBetween(String value1, String value2) {
            addCriterion("MATERIALS_HEAT_NO not between", value1, value2, "materialsHeatNo");
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