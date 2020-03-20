package com.neuedu.oms.entity;

import java.util.ArrayList;
import java.util.List;

public class ClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassExample() {
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

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassYearIsNull() {
            addCriterion("class_year is null");
            return (Criteria) this;
        }

        public Criteria andClassYearIsNotNull() {
            addCriterion("class_year is not null");
            return (Criteria) this;
        }

        public Criteria andClassYearEqualTo(Short value) {
            addCriterion("class_year =", value, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassYearNotEqualTo(Short value) {
            addCriterion("class_year <>", value, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassYearGreaterThan(Short value) {
            addCriterion("class_year >", value, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassYearGreaterThanOrEqualTo(Short value) {
            addCriterion("class_year >=", value, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassYearLessThan(Short value) {
            addCriterion("class_year <", value, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassYearLessThanOrEqualTo(Short value) {
            addCriterion("class_year <=", value, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassYearIn(List<Short> values) {
            addCriterion("class_year in", values, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassYearNotIn(List<Short> values) {
            addCriterion("class_year not in", values, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassYearBetween(Short value1, Short value2) {
            addCriterion("class_year between", value1, value2, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassYearNotBetween(Short value1, Short value2) {
            addCriterion("class_year not between", value1, value2, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassNumIsNull() {
            addCriterion("class_num is null");
            return (Criteria) this;
        }

        public Criteria andClassNumIsNotNull() {
            addCriterion("class_num is not null");
            return (Criteria) this;
        }

        public Criteria andClassNumEqualTo(Byte value) {
            addCriterion("class_num =", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotEqualTo(Byte value) {
            addCriterion("class_num <>", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumGreaterThan(Byte value) {
            addCriterion("class_num >", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("class_num >=", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLessThan(Byte value) {
            addCriterion("class_num <", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLessThanOrEqualTo(Byte value) {
            addCriterion("class_num <=", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumIn(List<Byte> values) {
            addCriterion("class_num in", values, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotIn(List<Byte> values) {
            addCriterion("class_num not in", values, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumBetween(Byte value1, Byte value2) {
            addCriterion("class_num between", value1, value2, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotBetween(Byte value1, Byte value2) {
            addCriterion("class_num not between", value1, value2, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andStudentNumIsNull() {
            addCriterion("student_num is null");
            return (Criteria) this;
        }

        public Criteria andStudentNumIsNotNull() {
            addCriterion("student_num is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNumEqualTo(Short value) {
            addCriterion("student_num =", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumNotEqualTo(Short value) {
            addCriterion("student_num <>", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumGreaterThan(Short value) {
            addCriterion("student_num >", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumGreaterThanOrEqualTo(Short value) {
            addCriterion("student_num >=", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumLessThan(Short value) {
            addCriterion("student_num <", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumLessThanOrEqualTo(Short value) {
            addCriterion("student_num <=", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumIn(List<Short> values) {
            addCriterion("student_num in", values, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumNotIn(List<Short> values) {
            addCriterion("student_num not in", values, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumBetween(Short value1, Short value2) {
            addCriterion("student_num between", value1, value2, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumNotBetween(Short value1, Short value2) {
            addCriterion("student_num not between", value1, value2, "studentNum");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNull() {
            addCriterion("college is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNotNull() {
            addCriterion("college is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeEqualTo(String value) {
            addCriterion("college =", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotEqualTo(String value) {
            addCriterion("college <>", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThan(String value) {
            addCriterion("college >", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("college >=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThan(String value) {
            addCriterion("college <", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThanOrEqualTo(String value) {
            addCriterion("college <=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLike(String value) {
            addCriterion("college like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotLike(String value) {
            addCriterion("college not like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeIn(List<String> values) {
            addCriterion("college in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotIn(List<String> values) {
            addCriterion("college not in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeBetween(String value1, String value2) {
            addCriterion("college between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotBetween(String value1, String value2) {
            addCriterion("college not between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andReserve1IsNull() {
            addCriterion("reserve1 is null");
            return (Criteria) this;
        }

        public Criteria andReserve1IsNotNull() {
            addCriterion("reserve1 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve1EqualTo(String value) {
            addCriterion("reserve1 =", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotEqualTo(String value) {
            addCriterion("reserve1 <>", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThan(String value) {
            addCriterion("reserve1 >", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThanOrEqualTo(String value) {
            addCriterion("reserve1 >=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThan(String value) {
            addCriterion("reserve1 <", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThanOrEqualTo(String value) {
            addCriterion("reserve1 <=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Like(String value) {
            addCriterion("reserve1 like", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotLike(String value) {
            addCriterion("reserve1 not like", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1In(List<String> values) {
            addCriterion("reserve1 in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotIn(List<String> values) {
            addCriterion("reserve1 not in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Between(String value1, String value2) {
            addCriterion("reserve1 between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotBetween(String value1, String value2) {
            addCriterion("reserve1 not between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNull() {
            addCriterion("reserve2 is null");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNotNull() {
            addCriterion("reserve2 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve2EqualTo(String value) {
            addCriterion("reserve2 =", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotEqualTo(String value) {
            addCriterion("reserve2 <>", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThan(String value) {
            addCriterion("reserve2 >", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThanOrEqualTo(String value) {
            addCriterion("reserve2 >=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThan(String value) {
            addCriterion("reserve2 <", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThanOrEqualTo(String value) {
            addCriterion("reserve2 <=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2Like(String value) {
            addCriterion("reserve2 like", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotLike(String value) {
            addCriterion("reserve2 not like", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2In(List<String> values) {
            addCriterion("reserve2 in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotIn(List<String> values) {
            addCriterion("reserve2 not in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2Between(String value1, String value2) {
            addCriterion("reserve2 between", value1, value2, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotBetween(String value1, String value2) {
            addCriterion("reserve2 not between", value1, value2, "reserve2");
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