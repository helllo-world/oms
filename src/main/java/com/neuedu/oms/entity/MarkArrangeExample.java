package com.neuedu.oms.entity;

import java.util.ArrayList;
import java.util.List;

public class MarkArrangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarkArrangeExample() {
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

        public Criteria andMarkArrangeIdIsNull() {
            addCriterion("mark_arrange_id is null");
            return (Criteria) this;
        }

        public Criteria andMarkArrangeIdIsNotNull() {
            addCriterion("mark_arrange_id is not null");
            return (Criteria) this;
        }

        public Criteria andMarkArrangeIdEqualTo(Integer value) {
            addCriterion("mark_arrange_id =", value, "markArrangeId");
            return (Criteria) this;
        }

        public Criteria andMarkArrangeIdNotEqualTo(Integer value) {
            addCriterion("mark_arrange_id <>", value, "markArrangeId");
            return (Criteria) this;
        }

        public Criteria andMarkArrangeIdGreaterThan(Integer value) {
            addCriterion("mark_arrange_id >", value, "markArrangeId");
            return (Criteria) this;
        }

        public Criteria andMarkArrangeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mark_arrange_id >=", value, "markArrangeId");
            return (Criteria) this;
        }

        public Criteria andMarkArrangeIdLessThan(Integer value) {
            addCriterion("mark_arrange_id <", value, "markArrangeId");
            return (Criteria) this;
        }

        public Criteria andMarkArrangeIdLessThanOrEqualTo(Integer value) {
            addCriterion("mark_arrange_id <=", value, "markArrangeId");
            return (Criteria) this;
        }

        public Criteria andMarkArrangeIdIn(List<Integer> values) {
            addCriterion("mark_arrange_id in", values, "markArrangeId");
            return (Criteria) this;
        }

        public Criteria andMarkArrangeIdNotIn(List<Integer> values) {
            addCriterion("mark_arrange_id not in", values, "markArrangeId");
            return (Criteria) this;
        }

        public Criteria andMarkArrangeIdBetween(Integer value1, Integer value2) {
            addCriterion("mark_arrange_id between", value1, value2, "markArrangeId");
            return (Criteria) this;
        }

        public Criteria andMarkArrangeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mark_arrange_id not between", value1, value2, "markArrangeId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andPaperScanIdIsNull() {
            addCriterion("paper_scan_id is null");
            return (Criteria) this;
        }

        public Criteria andPaperScanIdIsNotNull() {
            addCriterion("paper_scan_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaperScanIdEqualTo(Integer value) {
            addCriterion("paper_scan_id =", value, "paperScanId");
            return (Criteria) this;
        }

        public Criteria andPaperScanIdNotEqualTo(Integer value) {
            addCriterion("paper_scan_id <>", value, "paperScanId");
            return (Criteria) this;
        }

        public Criteria andPaperScanIdGreaterThan(Integer value) {
            addCriterion("paper_scan_id >", value, "paperScanId");
            return (Criteria) this;
        }

        public Criteria andPaperScanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_scan_id >=", value, "paperScanId");
            return (Criteria) this;
        }

        public Criteria andPaperScanIdLessThan(Integer value) {
            addCriterion("paper_scan_id <", value, "paperScanId");
            return (Criteria) this;
        }

        public Criteria andPaperScanIdLessThanOrEqualTo(Integer value) {
            addCriterion("paper_scan_id <=", value, "paperScanId");
            return (Criteria) this;
        }

        public Criteria andPaperScanIdIn(List<Integer> values) {
            addCriterion("paper_scan_id in", values, "paperScanId");
            return (Criteria) this;
        }

        public Criteria andPaperScanIdNotIn(List<Integer> values) {
            addCriterion("paper_scan_id not in", values, "paperScanId");
            return (Criteria) this;
        }

        public Criteria andPaperScanIdBetween(Integer value1, Integer value2) {
            addCriterion("paper_scan_id between", value1, value2, "paperScanId");
            return (Criteria) this;
        }

        public Criteria andPaperScanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_scan_id not between", value1, value2, "paperScanId");
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

        public Criteria andPhotoAddressIsNull() {
            addCriterion("photo_address is null");
            return (Criteria) this;
        }

        public Criteria andPhotoAddressIsNotNull() {
            addCriterion("photo_address is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoAddressEqualTo(String value) {
            addCriterion("photo_address =", value, "photoAddress");
            return (Criteria) this;
        }

        public Criteria andPhotoAddressNotEqualTo(String value) {
            addCriterion("photo_address <>", value, "photoAddress");
            return (Criteria) this;
        }

        public Criteria andPhotoAddressGreaterThan(String value) {
            addCriterion("photo_address >", value, "photoAddress");
            return (Criteria) this;
        }

        public Criteria andPhotoAddressGreaterThanOrEqualTo(String value) {
            addCriterion("photo_address >=", value, "photoAddress");
            return (Criteria) this;
        }

        public Criteria andPhotoAddressLessThan(String value) {
            addCriterion("photo_address <", value, "photoAddress");
            return (Criteria) this;
        }

        public Criteria andPhotoAddressLessThanOrEqualTo(String value) {
            addCriterion("photo_address <=", value, "photoAddress");
            return (Criteria) this;
        }

        public Criteria andPhotoAddressLike(String value) {
            addCriterion("photo_address like", value, "photoAddress");
            return (Criteria) this;
        }

        public Criteria andPhotoAddressNotLike(String value) {
            addCriterion("photo_address not like", value, "photoAddress");
            return (Criteria) this;
        }

        public Criteria andPhotoAddressIn(List<String> values) {
            addCriterion("photo_address in", values, "photoAddress");
            return (Criteria) this;
        }

        public Criteria andPhotoAddressNotIn(List<String> values) {
            addCriterion("photo_address not in", values, "photoAddress");
            return (Criteria) this;
        }

        public Criteria andPhotoAddressBetween(String value1, String value2) {
            addCriterion("photo_address between", value1, value2, "photoAddress");
            return (Criteria) this;
        }

        public Criteria andPhotoAddressNotBetween(String value1, String value2) {
            addCriterion("photo_address not between", value1, value2, "photoAddress");
            return (Criteria) this;
        }

        public Criteria andPhotoPrefixIsNull() {
            addCriterion("photo_prefix is null");
            return (Criteria) this;
        }

        public Criteria andPhotoPrefixIsNotNull() {
            addCriterion("photo_prefix is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoPrefixEqualTo(String value) {
            addCriterion("photo_prefix =", value, "photoPrefix");
            return (Criteria) this;
        }

        public Criteria andPhotoPrefixNotEqualTo(String value) {
            addCriterion("photo_prefix <>", value, "photoPrefix");
            return (Criteria) this;
        }

        public Criteria andPhotoPrefixGreaterThan(String value) {
            addCriterion("photo_prefix >", value, "photoPrefix");
            return (Criteria) this;
        }

        public Criteria andPhotoPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("photo_prefix >=", value, "photoPrefix");
            return (Criteria) this;
        }

        public Criteria andPhotoPrefixLessThan(String value) {
            addCriterion("photo_prefix <", value, "photoPrefix");
            return (Criteria) this;
        }

        public Criteria andPhotoPrefixLessThanOrEqualTo(String value) {
            addCriterion("photo_prefix <=", value, "photoPrefix");
            return (Criteria) this;
        }

        public Criteria andPhotoPrefixLike(String value) {
            addCriterion("photo_prefix like", value, "photoPrefix");
            return (Criteria) this;
        }

        public Criteria andPhotoPrefixNotLike(String value) {
            addCriterion("photo_prefix not like", value, "photoPrefix");
            return (Criteria) this;
        }

        public Criteria andPhotoPrefixIn(List<String> values) {
            addCriterion("photo_prefix in", values, "photoPrefix");
            return (Criteria) this;
        }

        public Criteria andPhotoPrefixNotIn(List<String> values) {
            addCriterion("photo_prefix not in", values, "photoPrefix");
            return (Criteria) this;
        }

        public Criteria andPhotoPrefixBetween(String value1, String value2) {
            addCriterion("photo_prefix between", value1, value2, "photoPrefix");
            return (Criteria) this;
        }

        public Criteria andPhotoPrefixNotBetween(String value1, String value2) {
            addCriterion("photo_prefix not between", value1, value2, "photoPrefix");
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

        public Criteria andScoreGetIsNull() {
            addCriterion("score_get is null");
            return (Criteria) this;
        }

        public Criteria andScoreGetIsNotNull() {
            addCriterion("score_get is not null");
            return (Criteria) this;
        }

        public Criteria andScoreGetEqualTo(Short value) {
            addCriterion("score_get =", value, "scoreGet");
            return (Criteria) this;
        }

        public Criteria andScoreGetNotEqualTo(Short value) {
            addCriterion("score_get <>", value, "scoreGet");
            return (Criteria) this;
        }

        public Criteria andScoreGetGreaterThan(Short value) {
            addCriterion("score_get >", value, "scoreGet");
            return (Criteria) this;
        }

        public Criteria andScoreGetGreaterThanOrEqualTo(Short value) {
            addCriterion("score_get >=", value, "scoreGet");
            return (Criteria) this;
        }

        public Criteria andScoreGetLessThan(Short value) {
            addCriterion("score_get <", value, "scoreGet");
            return (Criteria) this;
        }

        public Criteria andScoreGetLessThanOrEqualTo(Short value) {
            addCriterion("score_get <=", value, "scoreGet");
            return (Criteria) this;
        }

        public Criteria andScoreGetIn(List<Short> values) {
            addCriterion("score_get in", values, "scoreGet");
            return (Criteria) this;
        }

        public Criteria andScoreGetNotIn(List<Short> values) {
            addCriterion("score_get not in", values, "scoreGet");
            return (Criteria) this;
        }

        public Criteria andScoreGetBetween(Short value1, Short value2) {
            addCriterion("score_get between", value1, value2, "scoreGet");
            return (Criteria) this;
        }

        public Criteria andScoreGetNotBetween(Short value1, Short value2) {
            addCriterion("score_get not between", value1, value2, "scoreGet");
            return (Criteria) this;
        }

        public Criteria andIsMarkIsNull() {
            addCriterion("is_mark is null");
            return (Criteria) this;
        }

        public Criteria andIsMarkIsNotNull() {
            addCriterion("is_mark is not null");
            return (Criteria) this;
        }

        public Criteria andIsMarkEqualTo(Byte value) {
            addCriterion("is_mark =", value, "isMark");
            return (Criteria) this;
        }

        public Criteria andIsMarkNotEqualTo(Byte value) {
            addCriterion("is_mark <>", value, "isMark");
            return (Criteria) this;
        }

        public Criteria andIsMarkGreaterThan(Byte value) {
            addCriterion("is_mark >", value, "isMark");
            return (Criteria) this;
        }

        public Criteria andIsMarkGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_mark >=", value, "isMark");
            return (Criteria) this;
        }

        public Criteria andIsMarkLessThan(Byte value) {
            addCriterion("is_mark <", value, "isMark");
            return (Criteria) this;
        }

        public Criteria andIsMarkLessThanOrEqualTo(Byte value) {
            addCriterion("is_mark <=", value, "isMark");
            return (Criteria) this;
        }

        public Criteria andIsMarkIn(List<Byte> values) {
            addCriterion("is_mark in", values, "isMark");
            return (Criteria) this;
        }

        public Criteria andIsMarkNotIn(List<Byte> values) {
            addCriterion("is_mark not in", values, "isMark");
            return (Criteria) this;
        }

        public Criteria andIsMarkBetween(Byte value1, Byte value2) {
            addCriterion("is_mark between", value1, value2, "isMark");
            return (Criteria) this;
        }

        public Criteria andIsMarkNotBetween(Byte value1, Byte value2) {
            addCriterion("is_mark not between", value1, value2, "isMark");
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