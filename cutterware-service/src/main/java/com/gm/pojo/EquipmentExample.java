package com.gm.pojo;

import java.util.ArrayList;
import java.util.List;

public class EquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("`date` is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("`date` is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Long value) {
            addCriterion("`date` =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Long value) {
            addCriterion("`date` <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Long value) {
            addCriterion("`date` >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Long value) {
            addCriterion("`date` >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Long value) {
            addCriterion("`date` <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Long value) {
            addCriterion("`date` <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Long> values) {
            addCriterion("`date` in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Long> values) {
            addCriterion("`date` not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Long value1, Long value2) {
            addCriterion("`date` between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Long value1, Long value2) {
            addCriterion("`date` not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andGeologyIsNull() {
            addCriterion("geology is null");
            return (Criteria) this;
        }

        public Criteria andGeologyIsNotNull() {
            addCriterion("geology is not null");
            return (Criteria) this;
        }

        public Criteria andGeologyEqualTo(Integer value) {
            addCriterion("geology =", value, "geology");
            return (Criteria) this;
        }

        public Criteria andGeologyNotEqualTo(Integer value) {
            addCriterion("geology <>", value, "geology");
            return (Criteria) this;
        }

        public Criteria andGeologyGreaterThan(Integer value) {
            addCriterion("geology >", value, "geology");
            return (Criteria) this;
        }

        public Criteria andGeologyGreaterThanOrEqualTo(Integer value) {
            addCriterion("geology >=", value, "geology");
            return (Criteria) this;
        }

        public Criteria andGeologyLessThan(Integer value) {
            addCriterion("geology <", value, "geology");
            return (Criteria) this;
        }

        public Criteria andGeologyLessThanOrEqualTo(Integer value) {
            addCriterion("geology <=", value, "geology");
            return (Criteria) this;
        }

        public Criteria andGeologyIn(List<Integer> values) {
            addCriterion("geology in", values, "geology");
            return (Criteria) this;
        }

        public Criteria andGeologyNotIn(List<Integer> values) {
            addCriterion("geology not in", values, "geology");
            return (Criteria) this;
        }

        public Criteria andGeologyBetween(Integer value1, Integer value2) {
            addCriterion("geology between", value1, value2, "geology");
            return (Criteria) this;
        }

        public Criteria andGeologyNotBetween(Integer value1, Integer value2) {
            addCriterion("geology not between", value1, value2, "geology");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(Integer value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(Integer value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(Integer value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(Integer value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(Integer value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(Integer value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<Integer> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<Integer> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(Integer value1, Integer value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(Integer value1, Integer value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andRunningTimeIsNull() {
            addCriterion("running_time is null");
            return (Criteria) this;
        }

        public Criteria andRunningTimeIsNotNull() {
            addCriterion("running_time is not null");
            return (Criteria) this;
        }

        public Criteria andRunningTimeEqualTo(Integer value) {
            addCriterion("running_time =", value, "runningTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeNotEqualTo(Integer value) {
            addCriterion("running_time <>", value, "runningTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeGreaterThan(Integer value) {
            addCriterion("running_time >", value, "runningTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("running_time >=", value, "runningTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeLessThan(Integer value) {
            addCriterion("running_time <", value, "runningTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeLessThanOrEqualTo(Integer value) {
            addCriterion("running_time <=", value, "runningTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeIn(List<Integer> values) {
            addCriterion("running_time in", values, "runningTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeNotIn(List<Integer> values) {
            addCriterion("running_time not in", values, "runningTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeBetween(Integer value1, Integer value2) {
            addCriterion("running_time between", value1, value2, "runningTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("running_time not between", value1, value2, "runningTime");
            return (Criteria) this;
        }

        public Criteria andTunnelingDistanceIsNull() {
            addCriterion("`tunneling distance` is null");
            return (Criteria) this;
        }

        public Criteria andTunnelingDistanceIsNotNull() {
            addCriterion("`tunneling distance` is not null");
            return (Criteria) this;
        }

        public Criteria andTunnelingDistanceEqualTo(Integer value) {
            addCriterion("`tunneling distance` =", value, "tunnelingDistance");
            return (Criteria) this;
        }

        public Criteria andTunnelingDistanceNotEqualTo(Integer value) {
            addCriterion("`tunneling distance` <>", value, "tunnelingDistance");
            return (Criteria) this;
        }

        public Criteria andTunnelingDistanceGreaterThan(Integer value) {
            addCriterion("`tunneling distance` >", value, "tunnelingDistance");
            return (Criteria) this;
        }

        public Criteria andTunnelingDistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("`tunneling distance` >=", value, "tunnelingDistance");
            return (Criteria) this;
        }

        public Criteria andTunnelingDistanceLessThan(Integer value) {
            addCriterion("`tunneling distance` <", value, "tunnelingDistance");
            return (Criteria) this;
        }

        public Criteria andTunnelingDistanceLessThanOrEqualTo(Integer value) {
            addCriterion("`tunneling distance` <=", value, "tunnelingDistance");
            return (Criteria) this;
        }

        public Criteria andTunnelingDistanceIn(List<Integer> values) {
            addCriterion("`tunneling distance` in", values, "tunnelingDistance");
            return (Criteria) this;
        }

        public Criteria andTunnelingDistanceNotIn(List<Integer> values) {
            addCriterion("`tunneling distance` not in", values, "tunnelingDistance");
            return (Criteria) this;
        }

        public Criteria andTunnelingDistanceBetween(Integer value1, Integer value2) {
            addCriterion("`tunneling distance` between", value1, value2, "tunnelingDistance");
            return (Criteria) this;
        }

        public Criteria andTunnelingDistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("`tunneling distance` not between", value1, value2, "tunnelingDistance");
            return (Criteria) this;
        }

        public Criteria andPlannedDistanceIsNull() {
            addCriterion("`planned _distance` is null");
            return (Criteria) this;
        }

        public Criteria andPlannedDistanceIsNotNull() {
            addCriterion("`planned _distance` is not null");
            return (Criteria) this;
        }

        public Criteria andPlannedDistanceEqualTo(Integer value) {
            addCriterion("`planned _distance` =", value, "plannedDistance");
            return (Criteria) this;
        }

        public Criteria andPlannedDistanceNotEqualTo(Integer value) {
            addCriterion("`planned _distance` <>", value, "plannedDistance");
            return (Criteria) this;
        }

        public Criteria andPlannedDistanceGreaterThan(Integer value) {
            addCriterion("`planned _distance` >", value, "plannedDistance");
            return (Criteria) this;
        }

        public Criteria andPlannedDistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("`planned _distance` >=", value, "plannedDistance");
            return (Criteria) this;
        }

        public Criteria andPlannedDistanceLessThan(Integer value) {
            addCriterion("`planned _distance` <", value, "plannedDistance");
            return (Criteria) this;
        }

        public Criteria andPlannedDistanceLessThanOrEqualTo(Integer value) {
            addCriterion("`planned _distance` <=", value, "plannedDistance");
            return (Criteria) this;
        }

        public Criteria andPlannedDistanceIn(List<Integer> values) {
            addCriterion("`planned _distance` in", values, "plannedDistance");
            return (Criteria) this;
        }

        public Criteria andPlannedDistanceNotIn(List<Integer> values) {
            addCriterion("`planned _distance` not in", values, "plannedDistance");
            return (Criteria) this;
        }

        public Criteria andPlannedDistanceBetween(Integer value1, Integer value2) {
            addCriterion("`planned _distance` between", value1, value2, "plannedDistance");
            return (Criteria) this;
        }

        public Criteria andPlannedDistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("`planned _distance` not between", value1, value2, "plannedDistance");
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