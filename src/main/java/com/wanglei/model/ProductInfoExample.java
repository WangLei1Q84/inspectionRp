package com.wanglei.model;

import java.util.ArrayList;
import java.util.List;

public class ProductInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductInfoExample() {
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

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("PRODUCT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("PRODUCT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("PRODUCT_TYPE =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("PRODUCT_TYPE <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("PRODUCT_TYPE >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("PRODUCT_TYPE <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("PRODUCT_TYPE like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("PRODUCT_TYPE not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("PRODUCT_TYPE in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("PRODUCT_TYPE not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductSizeIsNull() {
            addCriterion("PRODUCT_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andProductSizeIsNotNull() {
            addCriterion("PRODUCT_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andProductSizeEqualTo(String value) {
            addCriterion("PRODUCT_SIZE =", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeNotEqualTo(String value) {
            addCriterion("PRODUCT_SIZE <>", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeGreaterThan(String value) {
            addCriterion("PRODUCT_SIZE >", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SIZE >=", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeLessThan(String value) {
            addCriterion("PRODUCT_SIZE <", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SIZE <=", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeLike(String value) {
            addCriterion("PRODUCT_SIZE like", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeNotLike(String value) {
            addCriterion("PRODUCT_SIZE not like", value, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeIn(List<String> values) {
            addCriterion("PRODUCT_SIZE in", values, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeNotIn(List<String> values) {
            addCriterion("PRODUCT_SIZE not in", values, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeBetween(String value1, String value2) {
            addCriterion("PRODUCT_SIZE between", value1, value2, "productSize");
            return (Criteria) this;
        }

        public Criteria andProductSizeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_SIZE not between", value1, value2, "productSize");
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

        public Criteria andLeverlIsNull() {
            addCriterion("LEVERL is null");
            return (Criteria) this;
        }

        public Criteria andLeverlIsNotNull() {
            addCriterion("LEVERL is not null");
            return (Criteria) this;
        }

        public Criteria andLeverlEqualTo(String value) {
            addCriterion("LEVERL =", value, "leverl");
            return (Criteria) this;
        }

        public Criteria andLeverlNotEqualTo(String value) {
            addCriterion("LEVERL <>", value, "leverl");
            return (Criteria) this;
        }

        public Criteria andLeverlGreaterThan(String value) {
            addCriterion("LEVERL >", value, "leverl");
            return (Criteria) this;
        }

        public Criteria andLeverlGreaterThanOrEqualTo(String value) {
            addCriterion("LEVERL >=", value, "leverl");
            return (Criteria) this;
        }

        public Criteria andLeverlLessThan(String value) {
            addCriterion("LEVERL <", value, "leverl");
            return (Criteria) this;
        }

        public Criteria andLeverlLessThanOrEqualTo(String value) {
            addCriterion("LEVERL <=", value, "leverl");
            return (Criteria) this;
        }

        public Criteria andLeverlLike(String value) {
            addCriterion("LEVERL like", value, "leverl");
            return (Criteria) this;
        }

        public Criteria andLeverlNotLike(String value) {
            addCriterion("LEVERL not like", value, "leverl");
            return (Criteria) this;
        }

        public Criteria andLeverlIn(List<String> values) {
            addCriterion("LEVERL in", values, "leverl");
            return (Criteria) this;
        }

        public Criteria andLeverlNotIn(List<String> values) {
            addCriterion("LEVERL not in", values, "leverl");
            return (Criteria) this;
        }

        public Criteria andLeverlBetween(String value1, String value2) {
            addCriterion("LEVERL between", value1, value2, "leverl");
            return (Criteria) this;
        }

        public Criteria andLeverlNotBetween(String value1, String value2) {
            addCriterion("LEVERL not between", value1, value2, "leverl");
            return (Criteria) this;
        }

        public Criteria andBallGaugeIsNull() {
            addCriterion("BALL_GAUGE is null");
            return (Criteria) this;
        }

        public Criteria andBallGaugeIsNotNull() {
            addCriterion("BALL_GAUGE is not null");
            return (Criteria) this;
        }

        public Criteria andBallGaugeEqualTo(String value) {
            addCriterion("BALL_GAUGE =", value, "ballGauge");
            return (Criteria) this;
        }

        public Criteria andBallGaugeNotEqualTo(String value) {
            addCriterion("BALL_GAUGE <>", value, "ballGauge");
            return (Criteria) this;
        }

        public Criteria andBallGaugeGreaterThan(String value) {
            addCriterion("BALL_GAUGE >", value, "ballGauge");
            return (Criteria) this;
        }

        public Criteria andBallGaugeGreaterThanOrEqualTo(String value) {
            addCriterion("BALL_GAUGE >=", value, "ballGauge");
            return (Criteria) this;
        }

        public Criteria andBallGaugeLessThan(String value) {
            addCriterion("BALL_GAUGE <", value, "ballGauge");
            return (Criteria) this;
        }

        public Criteria andBallGaugeLessThanOrEqualTo(String value) {
            addCriterion("BALL_GAUGE <=", value, "ballGauge");
            return (Criteria) this;
        }

        public Criteria andBallGaugeLike(String value) {
            addCriterion("BALL_GAUGE like", value, "ballGauge");
            return (Criteria) this;
        }

        public Criteria andBallGaugeNotLike(String value) {
            addCriterion("BALL_GAUGE not like", value, "ballGauge");
            return (Criteria) this;
        }

        public Criteria andBallGaugeIn(List<String> values) {
            addCriterion("BALL_GAUGE in", values, "ballGauge");
            return (Criteria) this;
        }

        public Criteria andBallGaugeNotIn(List<String> values) {
            addCriterion("BALL_GAUGE not in", values, "ballGauge");
            return (Criteria) this;
        }

        public Criteria andBallGaugeBetween(String value1, String value2) {
            addCriterion("BALL_GAUGE between", value1, value2, "ballGauge");
            return (Criteria) this;
        }

        public Criteria andBallGaugeNotBetween(String value1, String value2) {
            addCriterion("BALL_GAUGE not between", value1, value2, "ballGauge");
            return (Criteria) this;
        }

        public Criteria andThicknessIsNull() {
            addCriterion("THICKNESS is null");
            return (Criteria) this;
        }

        public Criteria andThicknessIsNotNull() {
            addCriterion("THICKNESS is not null");
            return (Criteria) this;
        }

        public Criteria andThicknessEqualTo(String value) {
            addCriterion("THICKNESS =", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessNotEqualTo(String value) {
            addCriterion("THICKNESS <>", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessGreaterThan(String value) {
            addCriterion("THICKNESS >", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessGreaterThanOrEqualTo(String value) {
            addCriterion("THICKNESS >=", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessLessThan(String value) {
            addCriterion("THICKNESS <", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessLessThanOrEqualTo(String value) {
            addCriterion("THICKNESS <=", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessLike(String value) {
            addCriterion("THICKNESS like", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessNotLike(String value) {
            addCriterion("THICKNESS not like", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessIn(List<String> values) {
            addCriterion("THICKNESS in", values, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessNotIn(List<String> values) {
            addCriterion("THICKNESS not in", values, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessBetween(String value1, String value2) {
            addCriterion("THICKNESS between", value1, value2, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessNotBetween(String value1, String value2) {
            addCriterion("THICKNESS not between", value1, value2, "thickness");
            return (Criteria) this;
        }

        public Criteria andHardnessTestStandardIsNull() {
            addCriterion("HARDNESS_TEST_STANDARD is null");
            return (Criteria) this;
        }

        public Criteria andHardnessTestStandardIsNotNull() {
            addCriterion("HARDNESS_TEST_STANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andHardnessTestStandardEqualTo(String value) {
            addCriterion("HARDNESS_TEST_STANDARD =", value, "hardnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andHardnessTestStandardNotEqualTo(String value) {
            addCriterion("HARDNESS_TEST_STANDARD <>", value, "hardnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andHardnessTestStandardGreaterThan(String value) {
            addCriterion("HARDNESS_TEST_STANDARD >", value, "hardnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andHardnessTestStandardGreaterThanOrEqualTo(String value) {
            addCriterion("HARDNESS_TEST_STANDARD >=", value, "hardnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andHardnessTestStandardLessThan(String value) {
            addCriterion("HARDNESS_TEST_STANDARD <", value, "hardnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andHardnessTestStandardLessThanOrEqualTo(String value) {
            addCriterion("HARDNESS_TEST_STANDARD <=", value, "hardnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andHardnessTestStandardLike(String value) {
            addCriterion("HARDNESS_TEST_STANDARD like", value, "hardnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andHardnessTestStandardNotLike(String value) {
            addCriterion("HARDNESS_TEST_STANDARD not like", value, "hardnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andHardnessTestStandardIn(List<String> values) {
            addCriterion("HARDNESS_TEST_STANDARD in", values, "hardnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andHardnessTestStandardNotIn(List<String> values) {
            addCriterion("HARDNESS_TEST_STANDARD not in", values, "hardnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andHardnessTestStandardBetween(String value1, String value2) {
            addCriterion("HARDNESS_TEST_STANDARD between", value1, value2, "hardnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andHardnessTestStandardNotBetween(String value1, String value2) {
            addCriterion("HARDNESS_TEST_STANDARD not between", value1, value2, "hardnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoundnessTestStandardIsNull() {
            addCriterion("ROUNDNESS_TEST_STANDARD is null");
            return (Criteria) this;
        }

        public Criteria andRoundnessTestStandardIsNotNull() {
            addCriterion("ROUNDNESS_TEST_STANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andRoundnessTestStandardEqualTo(String value) {
            addCriterion("ROUNDNESS_TEST_STANDARD =", value, "roundnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoundnessTestStandardNotEqualTo(String value) {
            addCriterion("ROUNDNESS_TEST_STANDARD <>", value, "roundnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoundnessTestStandardGreaterThan(String value) {
            addCriterion("ROUNDNESS_TEST_STANDARD >", value, "roundnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoundnessTestStandardGreaterThanOrEqualTo(String value) {
            addCriterion("ROUNDNESS_TEST_STANDARD >=", value, "roundnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoundnessTestStandardLessThan(String value) {
            addCriterion("ROUNDNESS_TEST_STANDARD <", value, "roundnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoundnessTestStandardLessThanOrEqualTo(String value) {
            addCriterion("ROUNDNESS_TEST_STANDARD <=", value, "roundnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoundnessTestStandardLike(String value) {
            addCriterion("ROUNDNESS_TEST_STANDARD like", value, "roundnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoundnessTestStandardNotLike(String value) {
            addCriterion("ROUNDNESS_TEST_STANDARD not like", value, "roundnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoundnessTestStandardIn(List<String> values) {
            addCriterion("ROUNDNESS_TEST_STANDARD in", values, "roundnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoundnessTestStandardNotIn(List<String> values) {
            addCriterion("ROUNDNESS_TEST_STANDARD not in", values, "roundnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoundnessTestStandardBetween(String value1, String value2) {
            addCriterion("ROUNDNESS_TEST_STANDARD between", value1, value2, "roundnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoundnessTestStandardNotBetween(String value1, String value2) {
            addCriterion("ROUNDNESS_TEST_STANDARD not between", value1, value2, "roundnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andCrushingTestStandardIsNull() {
            addCriterion("CRUSHING_TEST_STANDARD is null");
            return (Criteria) this;
        }

        public Criteria andCrushingTestStandardIsNotNull() {
            addCriterion("CRUSHING_TEST_STANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andCrushingTestStandardEqualTo(String value) {
            addCriterion("CRUSHING_TEST_STANDARD =", value, "crushingTestStandard");
            return (Criteria) this;
        }

        public Criteria andCrushingTestStandardNotEqualTo(String value) {
            addCriterion("CRUSHING_TEST_STANDARD <>", value, "crushingTestStandard");
            return (Criteria) this;
        }

        public Criteria andCrushingTestStandardGreaterThan(String value) {
            addCriterion("CRUSHING_TEST_STANDARD >", value, "crushingTestStandard");
            return (Criteria) this;
        }

        public Criteria andCrushingTestStandardGreaterThanOrEqualTo(String value) {
            addCriterion("CRUSHING_TEST_STANDARD >=", value, "crushingTestStandard");
            return (Criteria) this;
        }

        public Criteria andCrushingTestStandardLessThan(String value) {
            addCriterion("CRUSHING_TEST_STANDARD <", value, "crushingTestStandard");
            return (Criteria) this;
        }

        public Criteria andCrushingTestStandardLessThanOrEqualTo(String value) {
            addCriterion("CRUSHING_TEST_STANDARD <=", value, "crushingTestStandard");
            return (Criteria) this;
        }

        public Criteria andCrushingTestStandardLike(String value) {
            addCriterion("CRUSHING_TEST_STANDARD like", value, "crushingTestStandard");
            return (Criteria) this;
        }

        public Criteria andCrushingTestStandardNotLike(String value) {
            addCriterion("CRUSHING_TEST_STANDARD not like", value, "crushingTestStandard");
            return (Criteria) this;
        }

        public Criteria andCrushingTestStandardIn(List<String> values) {
            addCriterion("CRUSHING_TEST_STANDARD in", values, "crushingTestStandard");
            return (Criteria) this;
        }

        public Criteria andCrushingTestStandardNotIn(List<String> values) {
            addCriterion("CRUSHING_TEST_STANDARD not in", values, "crushingTestStandard");
            return (Criteria) this;
        }

        public Criteria andCrushingTestStandardBetween(String value1, String value2) {
            addCriterion("CRUSHING_TEST_STANDARD between", value1, value2, "crushingTestStandard");
            return (Criteria) this;
        }

        public Criteria andCrushingTestStandardNotBetween(String value1, String value2) {
            addCriterion("CRUSHING_TEST_STANDARD not between", value1, value2, "crushingTestStandard");
            return (Criteria) this;
        }

        public Criteria andWeightTestStandardIsNull() {
            addCriterion("WEIGHT_TEST_STANDARD is null");
            return (Criteria) this;
        }

        public Criteria andWeightTestStandardIsNotNull() {
            addCriterion("WEIGHT_TEST_STANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andWeightTestStandardEqualTo(String value) {
            addCriterion("WEIGHT_TEST_STANDARD =", value, "weightTestStandard");
            return (Criteria) this;
        }

        public Criteria andWeightTestStandardNotEqualTo(String value) {
            addCriterion("WEIGHT_TEST_STANDARD <>", value, "weightTestStandard");
            return (Criteria) this;
        }

        public Criteria andWeightTestStandardGreaterThan(String value) {
            addCriterion("WEIGHT_TEST_STANDARD >", value, "weightTestStandard");
            return (Criteria) this;
        }

        public Criteria andWeightTestStandardGreaterThanOrEqualTo(String value) {
            addCriterion("WEIGHT_TEST_STANDARD >=", value, "weightTestStandard");
            return (Criteria) this;
        }

        public Criteria andWeightTestStandardLessThan(String value) {
            addCriterion("WEIGHT_TEST_STANDARD <", value, "weightTestStandard");
            return (Criteria) this;
        }

        public Criteria andWeightTestStandardLessThanOrEqualTo(String value) {
            addCriterion("WEIGHT_TEST_STANDARD <=", value, "weightTestStandard");
            return (Criteria) this;
        }

        public Criteria andWeightTestStandardLike(String value) {
            addCriterion("WEIGHT_TEST_STANDARD like", value, "weightTestStandard");
            return (Criteria) this;
        }

        public Criteria andWeightTestStandardNotLike(String value) {
            addCriterion("WEIGHT_TEST_STANDARD not like", value, "weightTestStandard");
            return (Criteria) this;
        }

        public Criteria andWeightTestStandardIn(List<String> values) {
            addCriterion("WEIGHT_TEST_STANDARD in", values, "weightTestStandard");
            return (Criteria) this;
        }

        public Criteria andWeightTestStandardNotIn(List<String> values) {
            addCriterion("WEIGHT_TEST_STANDARD not in", values, "weightTestStandard");
            return (Criteria) this;
        }

        public Criteria andWeightTestStandardBetween(String value1, String value2) {
            addCriterion("WEIGHT_TEST_STANDARD between", value1, value2, "weightTestStandard");
            return (Criteria) this;
        }

        public Criteria andWeightTestStandardNotBetween(String value1, String value2) {
            addCriterion("WEIGHT_TEST_STANDARD not between", value1, value2, "weightTestStandard");
            return (Criteria) this;
        }

        public Criteria andBatchDiameterTestStandardIsNull() {
            addCriterion("BATCH_DIAMETER_TEST_STANDARD is null");
            return (Criteria) this;
        }

        public Criteria andBatchDiameterTestStandardIsNotNull() {
            addCriterion("BATCH_DIAMETER_TEST_STANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andBatchDiameterTestStandardEqualTo(String value) {
            addCriterion("BATCH_DIAMETER_TEST_STANDARD =", value, "batchDiameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andBatchDiameterTestStandardNotEqualTo(String value) {
            addCriterion("BATCH_DIAMETER_TEST_STANDARD <>", value, "batchDiameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andBatchDiameterTestStandardGreaterThan(String value) {
            addCriterion("BATCH_DIAMETER_TEST_STANDARD >", value, "batchDiameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andBatchDiameterTestStandardGreaterThanOrEqualTo(String value) {
            addCriterion("BATCH_DIAMETER_TEST_STANDARD >=", value, "batchDiameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andBatchDiameterTestStandardLessThan(String value) {
            addCriterion("BATCH_DIAMETER_TEST_STANDARD <", value, "batchDiameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andBatchDiameterTestStandardLessThanOrEqualTo(String value) {
            addCriterion("BATCH_DIAMETER_TEST_STANDARD <=", value, "batchDiameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andBatchDiameterTestStandardLike(String value) {
            addCriterion("BATCH_DIAMETER_TEST_STANDARD like", value, "batchDiameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andBatchDiameterTestStandardNotLike(String value) {
            addCriterion("BATCH_DIAMETER_TEST_STANDARD not like", value, "batchDiameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andBatchDiameterTestStandardIn(List<String> values) {
            addCriterion("BATCH_DIAMETER_TEST_STANDARD in", values, "batchDiameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andBatchDiameterTestStandardNotIn(List<String> values) {
            addCriterion("BATCH_DIAMETER_TEST_STANDARD not in", values, "batchDiameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andBatchDiameterTestStandardBetween(String value1, String value2) {
            addCriterion("BATCH_DIAMETER_TEST_STANDARD between", value1, value2, "batchDiameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andBatchDiameterTestStandardNotBetween(String value1, String value2) {
            addCriterion("BATCH_DIAMETER_TEST_STANDARD not between", value1, value2, "batchDiameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoughnessTestStandardIsNull() {
            addCriterion("ROUGHNESS_TEST_STANDARD is null");
            return (Criteria) this;
        }

        public Criteria andRoughnessTestStandardIsNotNull() {
            addCriterion("ROUGHNESS_TEST_STANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andRoughnessTestStandardEqualTo(String value) {
            addCriterion("ROUGHNESS_TEST_STANDARD =", value, "roughnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoughnessTestStandardNotEqualTo(String value) {
            addCriterion("ROUGHNESS_TEST_STANDARD <>", value, "roughnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoughnessTestStandardGreaterThan(String value) {
            addCriterion("ROUGHNESS_TEST_STANDARD >", value, "roughnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoughnessTestStandardGreaterThanOrEqualTo(String value) {
            addCriterion("ROUGHNESS_TEST_STANDARD >=", value, "roughnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoughnessTestStandardLessThan(String value) {
            addCriterion("ROUGHNESS_TEST_STANDARD <", value, "roughnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoughnessTestStandardLessThanOrEqualTo(String value) {
            addCriterion("ROUGHNESS_TEST_STANDARD <=", value, "roughnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoughnessTestStandardLike(String value) {
            addCriterion("ROUGHNESS_TEST_STANDARD like", value, "roughnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoughnessTestStandardNotLike(String value) {
            addCriterion("ROUGHNESS_TEST_STANDARD not like", value, "roughnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoughnessTestStandardIn(List<String> values) {
            addCriterion("ROUGHNESS_TEST_STANDARD in", values, "roughnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoughnessTestStandardNotIn(List<String> values) {
            addCriterion("ROUGHNESS_TEST_STANDARD not in", values, "roughnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoughnessTestStandardBetween(String value1, String value2) {
            addCriterion("ROUGHNESS_TEST_STANDARD between", value1, value2, "roughnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andRoughnessTestStandardNotBetween(String value1, String value2) {
            addCriterion("ROUGHNESS_TEST_STANDARD not between", value1, value2, "roughnessTestStandard");
            return (Criteria) this;
        }

        public Criteria andDiameterTestStandardIsNull() {
            addCriterion("DIAMETER_TEST_STANDARD is null");
            return (Criteria) this;
        }

        public Criteria andDiameterTestStandardIsNotNull() {
            addCriterion("DIAMETER_TEST_STANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andDiameterTestStandardEqualTo(String value) {
            addCriterion("DIAMETER_TEST_STANDARD =", value, "diameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andDiameterTestStandardNotEqualTo(String value) {
            addCriterion("DIAMETER_TEST_STANDARD <>", value, "diameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andDiameterTestStandardGreaterThan(String value) {
            addCriterion("DIAMETER_TEST_STANDARD >", value, "diameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andDiameterTestStandardGreaterThanOrEqualTo(String value) {
            addCriterion("DIAMETER_TEST_STANDARD >=", value, "diameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andDiameterTestStandardLessThan(String value) {
            addCriterion("DIAMETER_TEST_STANDARD <", value, "diameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andDiameterTestStandardLessThanOrEqualTo(String value) {
            addCriterion("DIAMETER_TEST_STANDARD <=", value, "diameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andDiameterTestStandardLike(String value) {
            addCriterion("DIAMETER_TEST_STANDARD like", value, "diameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andDiameterTestStandardNotLike(String value) {
            addCriterion("DIAMETER_TEST_STANDARD not like", value, "diameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andDiameterTestStandardIn(List<String> values) {
            addCriterion("DIAMETER_TEST_STANDARD in", values, "diameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andDiameterTestStandardNotIn(List<String> values) {
            addCriterion("DIAMETER_TEST_STANDARD not in", values, "diameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andDiameterTestStandardBetween(String value1, String value2) {
            addCriterion("DIAMETER_TEST_STANDARD between", value1, value2, "diameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andDiameterTestStandardNotBetween(String value1, String value2) {
            addCriterion("DIAMETER_TEST_STANDARD not between", value1, value2, "diameterTestStandard");
            return (Criteria) this;
        }

        public Criteria andTestItemsIsNull() {
            addCriterion("TEST_ITEMS is null");
            return (Criteria) this;
        }

        public Criteria andTestItemsIsNotNull() {
            addCriterion("TEST_ITEMS is not null");
            return (Criteria) this;
        }

        public Criteria andTestItemsEqualTo(String value) {
            addCriterion("TEST_ITEMS =", value, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsNotEqualTo(String value) {
            addCriterion("TEST_ITEMS <>", value, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsGreaterThan(String value) {
            addCriterion("TEST_ITEMS >", value, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_ITEMS >=", value, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsLessThan(String value) {
            addCriterion("TEST_ITEMS <", value, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsLessThanOrEqualTo(String value) {
            addCriterion("TEST_ITEMS <=", value, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsLike(String value) {
            addCriterion("TEST_ITEMS like", value, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsNotLike(String value) {
            addCriterion("TEST_ITEMS not like", value, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsIn(List<String> values) {
            addCriterion("TEST_ITEMS in", values, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsNotIn(List<String> values) {
            addCriterion("TEST_ITEMS not in", values, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsBetween(String value1, String value2) {
            addCriterion("TEST_ITEMS between", value1, value2, "testItems");
            return (Criteria) this;
        }

        public Criteria andTestItemsNotBetween(String value1, String value2) {
            addCriterion("TEST_ITEMS not between", value1, value2, "testItems");
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

        public Criteria andHeatTreatmentProIsNull() {
            addCriterion("HEAT_TREATMENT_PRO is null");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentProIsNotNull() {
            addCriterion("HEAT_TREATMENT_PRO is not null");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentProEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_PRO =", value, "heatTreatmentPro");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentProNotEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_PRO <>", value, "heatTreatmentPro");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentProGreaterThan(String value) {
            addCriterion("HEAT_TREATMENT_PRO >", value, "heatTreatmentPro");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentProGreaterThanOrEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_PRO >=", value, "heatTreatmentPro");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentProLessThan(String value) {
            addCriterion("HEAT_TREATMENT_PRO <", value, "heatTreatmentPro");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentProLessThanOrEqualTo(String value) {
            addCriterion("HEAT_TREATMENT_PRO <=", value, "heatTreatmentPro");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentProLike(String value) {
            addCriterion("HEAT_TREATMENT_PRO like", value, "heatTreatmentPro");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentProNotLike(String value) {
            addCriterion("HEAT_TREATMENT_PRO not like", value, "heatTreatmentPro");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentProIn(List<String> values) {
            addCriterion("HEAT_TREATMENT_PRO in", values, "heatTreatmentPro");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentProNotIn(List<String> values) {
            addCriterion("HEAT_TREATMENT_PRO not in", values, "heatTreatmentPro");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentProBetween(String value1, String value2) {
            addCriterion("HEAT_TREATMENT_PRO between", value1, value2, "heatTreatmentPro");
            return (Criteria) this;
        }

        public Criteria andHeatTreatmentProNotBetween(String value1, String value2) {
            addCriterion("HEAT_TREATMENT_PRO not between", value1, value2, "heatTreatmentPro");
            return (Criteria) this;
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