package com.neuedu.oms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubjScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubjScoreExample() {
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

        public Criteria andSubjScoreIdIsNull() {
            addCriterion("subj_score_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjScoreIdIsNotNull() {
            addCriterion("subj_score_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjScoreIdEqualTo(Integer value) {
            addCriterion("subj_score_id =", value, "subjScoreId");
            return (Criteria) this;
        }

        public Criteria andSubjScoreIdNotEqualTo(Integer value) {
            addCriterion("subj_score_id <>", value, "subjScoreId");
            return (Criteria) this;
        }

        public Criteria andSubjScoreIdGreaterThan(Integer value) {
            addCriterion("subj_score_id >", value, "subjScoreId");
            return (Criteria) this;
        }

        public Criteria andSubjScoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subj_score_id >=", value, "subjScoreId");
            return (Criteria) this;
        }

        public Criteria andSubjScoreIdLessThan(Integer value) {
            addCriterion("subj_score_id <", value, "subjScoreId");
            return (Criteria) this;
        }

        public Criteria andSubjScoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("subj_score_id <=", value, "subjScoreId");
            return (Criteria) this;
        }

        public Criteria andSubjScoreIdIn(List<Integer> values) {
            addCriterion("subj_score_id in", values, "subjScoreId");
            return (Criteria) this;
        }

        public Criteria andSubjScoreIdNotIn(List<Integer> values) {
            addCriterion("subj_score_id not in", values, "subjScoreId");
            return (Criteria) this;
        }

        public Criteria andSubjScoreIdBetween(Integer value1, Integer value2) {
            addCriterion("subj_score_id between", value1, value2, "subjScoreId");
            return (Criteria) this;
        }

        public Criteria andSubjScoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subj_score_id not between", value1, value2, "subjScoreId");
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

        public Criteria andInsertTimeIsNull() {
            addCriterion("insert_time is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterion("insert_time =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterion("insert_time <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterion("insert_time >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_time >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterion("insert_time <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("insert_time <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterion("insert_time in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterion("insert_time not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterion("insert_time between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("insert_time not between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andMarkTimesIsNull() {
            addCriterion("mark_times is null");
            return (Criteria) this;
        }

        public Criteria andMarkTimesIsNotNull() {
            addCriterion("mark_times is not null");
            return (Criteria) this;
        }

        public Criteria andMarkTimesEqualTo(Byte value) {
            addCriterion("mark_times =", value, "markTimes");
            return (Criteria) this;
        }

        public Criteria andMarkTimesNotEqualTo(Byte value) {
            addCriterion("mark_times <>", value, "markTimes");
            return (Criteria) this;
        }

        public Criteria andMarkTimesGreaterThan(Byte value) {
            addCriterion("mark_times >", value, "markTimes");
            return (Criteria) this;
        }

        public Criteria andMarkTimesGreaterThanOrEqualTo(Byte value) {
            addCriterion("mark_times >=", value, "markTimes");
            return (Criteria) this;
        }

        public Criteria andMarkTimesLessThan(Byte value) {
            addCriterion("mark_times <", value, "markTimes");
            return (Criteria) this;
        }

        public Criteria andMarkTimesLessThanOrEqualTo(Byte value) {
            addCriterion("mark_times <=", value, "markTimes");
            return (Criteria) this;
        }

        public Criteria andMarkTimesIn(List<Byte> values) {
            addCriterion("mark_times in", values, "markTimes");
            return (Criteria) this;
        }

        public Criteria andMarkTimesNotIn(List<Byte> values) {
            addCriterion("mark_times not in", values, "markTimes");
            return (Criteria) this;
        }

        public Criteria andMarkTimesBetween(Byte value1, Byte value2) {
            addCriterion("mark_times between", value1, value2, "markTimes");
            return (Criteria) this;
        }

        public Criteria andMarkTimesNotBetween(Byte value1, Byte value2) {
            addCriterion("mark_times not between", value1, value2, "markTimes");
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