package com.neuedu.oms.entity;

import java.util.ArrayList;
import java.util.List;

public class SubjAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjAnswerExample() {
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

        public Criteria andSubjAnswerIdIsNull() {
            addCriterion("subj_answer_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjAnswerIdIsNotNull() {
            addCriterion("subj_answer_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjAnswerIdEqualTo(Integer value) {
            addCriterion("subj_answer_id =", value, "subjAnswerId");
            return (Criteria) this;
        }

        public Criteria andSubjAnswerIdNotEqualTo(Integer value) {
            addCriterion("subj_answer_id <>", value, "subjAnswerId");
            return (Criteria) this;
        }

        public Criteria andSubjAnswerIdGreaterThan(Integer value) {
            addCriterion("subj_answer_id >", value, "subjAnswerId");
            return (Criteria) this;
        }

        public Criteria andSubjAnswerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subj_answer_id >=", value, "subjAnswerId");
            return (Criteria) this;
        }

        public Criteria andSubjAnswerIdLessThan(Integer value) {
            addCriterion("subj_answer_id <", value, "subjAnswerId");
            return (Criteria) this;
        }

        public Criteria andSubjAnswerIdLessThanOrEqualTo(Integer value) {
            addCriterion("subj_answer_id <=", value, "subjAnswerId");
            return (Criteria) this;
        }

        public Criteria andSubjAnswerIdIn(List<Integer> values) {
            addCriterion("subj_answer_id in", values, "subjAnswerId");
            return (Criteria) this;
        }

        public Criteria andSubjAnswerIdNotIn(List<Integer> values) {
            addCriterion("subj_answer_id not in", values, "subjAnswerId");
            return (Criteria) this;
        }

        public Criteria andSubjAnswerIdBetween(Integer value1, Integer value2) {
            addCriterion("subj_answer_id between", value1, value2, "subjAnswerId");
            return (Criteria) this;
        }

        public Criteria andSubjAnswerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subj_answer_id not between", value1, value2, "subjAnswerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIsNull() {
            addCriterion("answer_id is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIsNotNull() {
            addCriterion("answer_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerIdEqualTo(Integer value) {
            addCriterion("answer_id =", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotEqualTo(Integer value) {
            addCriterion("answer_id <>", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdGreaterThan(Integer value) {
            addCriterion("answer_id >", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_id >=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLessThan(Integer value) {
            addCriterion("answer_id <", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLessThanOrEqualTo(Integer value) {
            addCriterion("answer_id <=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIn(List<Integer> values) {
            addCriterion("answer_id in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotIn(List<Integer> values) {
            addCriterion("answer_id not in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdBetween(Integer value1, Integer value2) {
            addCriterion("answer_id between", value1, value2, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_id not between", value1, value2, "answerId");
            return (Criteria) this;
        }

        public Criteria andPointIdIsNull() {
            addCriterion("point_id is null");
            return (Criteria) this;
        }

        public Criteria andPointIdIsNotNull() {
            addCriterion("point_id is not null");
            return (Criteria) this;
        }

        public Criteria andPointIdEqualTo(Integer value) {
            addCriterion("point_id =", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotEqualTo(Integer value) {
            addCriterion("point_id <>", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdGreaterThan(Integer value) {
            addCriterion("point_id >", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_id >=", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdLessThan(Integer value) {
            addCriterion("point_id <", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdLessThanOrEqualTo(Integer value) {
            addCriterion("point_id <=", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdIn(List<Integer> values) {
            addCriterion("point_id in", values, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotIn(List<Integer> values) {
            addCriterion("point_id not in", values, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdBetween(Integer value1, Integer value2) {
            addCriterion("point_id between", value1, value2, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotBetween(Integer value1, Integer value2) {
            addCriterion("point_id not between", value1, value2, "pointId");
            return (Criteria) this;
        }

        public Criteria andGoalIdIsNull() {
            addCriterion("goal_id is null");
            return (Criteria) this;
        }

        public Criteria andGoalIdIsNotNull() {
            addCriterion("goal_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoalIdEqualTo(Integer value) {
            addCriterion("goal_id =", value, "goalId");
            return (Criteria) this;
        }

        public Criteria andGoalIdNotEqualTo(Integer value) {
            addCriterion("goal_id <>", value, "goalId");
            return (Criteria) this;
        }

        public Criteria andGoalIdGreaterThan(Integer value) {
            addCriterion("goal_id >", value, "goalId");
            return (Criteria) this;
        }

        public Criteria andGoalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goal_id >=", value, "goalId");
            return (Criteria) this;
        }

        public Criteria andGoalIdLessThan(Integer value) {
            addCriterion("goal_id <", value, "goalId");
            return (Criteria) this;
        }

        public Criteria andGoalIdLessThanOrEqualTo(Integer value) {
            addCriterion("goal_id <=", value, "goalId");
            return (Criteria) this;
        }

        public Criteria andGoalIdIn(List<Integer> values) {
            addCriterion("goal_id in", values, "goalId");
            return (Criteria) this;
        }

        public Criteria andGoalIdNotIn(List<Integer> values) {
            addCriterion("goal_id not in", values, "goalId");
            return (Criteria) this;
        }

        public Criteria andGoalIdBetween(Integer value1, Integer value2) {
            addCriterion("goal_id between", value1, value2, "goalId");
            return (Criteria) this;
        }

        public Criteria andGoalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goal_id not between", value1, value2, "goalId");
            return (Criteria) this;
        }

        public Criteria andQuestionNumIsNull() {
            addCriterion("question_num is null");
            return (Criteria) this;
        }

        public Criteria andQuestionNumIsNotNull() {
            addCriterion("question_num is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionNumEqualTo(Short value) {
            addCriterion("question_num =", value, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumNotEqualTo(Short value) {
            addCriterion("question_num <>", value, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumGreaterThan(Short value) {
            addCriterion("question_num >", value, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumGreaterThanOrEqualTo(Short value) {
            addCriterion("question_num >=", value, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumLessThan(Short value) {
            addCriterion("question_num <", value, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumLessThanOrEqualTo(Short value) {
            addCriterion("question_num <=", value, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumIn(List<Short> values) {
            addCriterion("question_num in", values, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumNotIn(List<Short> values) {
            addCriterion("question_num not in", values, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumBetween(Short value1, Short value2) {
            addCriterion("question_num between", value1, value2, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumNotBetween(Short value1, Short value2) {
            addCriterion("question_num not between", value1, value2, "questionNum");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Short value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Short value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Short value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Short value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Short value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Short value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Short> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Short> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Short value1, Short value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Short value1, Short value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andPointDescriptionIsNull() {
            addCriterion("point_description is null");
            return (Criteria) this;
        }

        public Criteria andPointDescriptionIsNotNull() {
            addCriterion("point_description is not null");
            return (Criteria) this;
        }

        public Criteria andPointDescriptionEqualTo(String value) {
            addCriterion("point_description =", value, "pointDescription");
            return (Criteria) this;
        }

        public Criteria andPointDescriptionNotEqualTo(String value) {
            addCriterion("point_description <>", value, "pointDescription");
            return (Criteria) this;
        }

        public Criteria andPointDescriptionGreaterThan(String value) {
            addCriterion("point_description >", value, "pointDescription");
            return (Criteria) this;
        }

        public Criteria andPointDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("point_description >=", value, "pointDescription");
            return (Criteria) this;
        }

        public Criteria andPointDescriptionLessThan(String value) {
            addCriterion("point_description <", value, "pointDescription");
            return (Criteria) this;
        }

        public Criteria andPointDescriptionLessThanOrEqualTo(String value) {
            addCriterion("point_description <=", value, "pointDescription");
            return (Criteria) this;
        }

        public Criteria andPointDescriptionLike(String value) {
            addCriterion("point_description like", value, "pointDescription");
            return (Criteria) this;
        }

        public Criteria andPointDescriptionNotLike(String value) {
            addCriterion("point_description not like", value, "pointDescription");
            return (Criteria) this;
        }

        public Criteria andPointDescriptionIn(List<String> values) {
            addCriterion("point_description in", values, "pointDescription");
            return (Criteria) this;
        }

        public Criteria andPointDescriptionNotIn(List<String> values) {
            addCriterion("point_description not in", values, "pointDescription");
            return (Criteria) this;
        }

        public Criteria andPointDescriptionBetween(String value1, String value2) {
            addCriterion("point_description between", value1, value2, "pointDescription");
            return (Criteria) this;
        }

        public Criteria andPointDescriptionNotBetween(String value1, String value2) {
            addCriterion("point_description not between", value1, value2, "pointDescription");
            return (Criteria) this;
        }

        public Criteria andPointPhotoIsNull() {
            addCriterion("point_photo is null");
            return (Criteria) this;
        }

        public Criteria andPointPhotoIsNotNull() {
            addCriterion("point_photo is not null");
            return (Criteria) this;
        }

        public Criteria andPointPhotoEqualTo(String value) {
            addCriterion("point_photo =", value, "pointPhoto");
            return (Criteria) this;
        }

        public Criteria andPointPhotoNotEqualTo(String value) {
            addCriterion("point_photo <>", value, "pointPhoto");
            return (Criteria) this;
        }

        public Criteria andPointPhotoGreaterThan(String value) {
            addCriterion("point_photo >", value, "pointPhoto");
            return (Criteria) this;
        }

        public Criteria andPointPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("point_photo >=", value, "pointPhoto");
            return (Criteria) this;
        }

        public Criteria andPointPhotoLessThan(String value) {
            addCriterion("point_photo <", value, "pointPhoto");
            return (Criteria) this;
        }

        public Criteria andPointPhotoLessThanOrEqualTo(String value) {
            addCriterion("point_photo <=", value, "pointPhoto");
            return (Criteria) this;
        }

        public Criteria andPointPhotoLike(String value) {
            addCriterion("point_photo like", value, "pointPhoto");
            return (Criteria) this;
        }

        public Criteria andPointPhotoNotLike(String value) {
            addCriterion("point_photo not like", value, "pointPhoto");
            return (Criteria) this;
        }

        public Criteria andPointPhotoIn(List<String> values) {
            addCriterion("point_photo in", values, "pointPhoto");
            return (Criteria) this;
        }

        public Criteria andPointPhotoNotIn(List<String> values) {
            addCriterion("point_photo not in", values, "pointPhoto");
            return (Criteria) this;
        }

        public Criteria andPointPhotoBetween(String value1, String value2) {
            addCriterion("point_photo between", value1, value2, "pointPhoto");
            return (Criteria) this;
        }

        public Criteria andPointPhotoNotBetween(String value1, String value2) {
            addCriterion("point_photo not between", value1, value2, "pointPhoto");
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