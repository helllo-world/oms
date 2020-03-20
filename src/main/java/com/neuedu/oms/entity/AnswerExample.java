package com.neuedu.oms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnswerExample() {
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

        public Criteria andAnswersheetIdIsNull() {
            addCriterion("answersheet_id is null");
            return (Criteria) this;
        }

        public Criteria andAnswersheetIdIsNotNull() {
            addCriterion("answersheet_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnswersheetIdEqualTo(Integer value) {
            addCriterion("answersheet_id =", value, "answersheetId");
            return (Criteria) this;
        }

        public Criteria andAnswersheetIdNotEqualTo(Integer value) {
            addCriterion("answersheet_id <>", value, "answersheetId");
            return (Criteria) this;
        }

        public Criteria andAnswersheetIdGreaterThan(Integer value) {
            addCriterion("answersheet_id >", value, "answersheetId");
            return (Criteria) this;
        }

        public Criteria andAnswersheetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("answersheet_id >=", value, "answersheetId");
            return (Criteria) this;
        }

        public Criteria andAnswersheetIdLessThan(Integer value) {
            addCriterion("answersheet_id <", value, "answersheetId");
            return (Criteria) this;
        }

        public Criteria andAnswersheetIdLessThanOrEqualTo(Integer value) {
            addCriterion("answersheet_id <=", value, "answersheetId");
            return (Criteria) this;
        }

        public Criteria andAnswersheetIdIn(List<Integer> values) {
            addCriterion("answersheet_id in", values, "answersheetId");
            return (Criteria) this;
        }

        public Criteria andAnswersheetIdNotIn(List<Integer> values) {
            addCriterion("answersheet_id not in", values, "answersheetId");
            return (Criteria) this;
        }

        public Criteria andAnswersheetIdBetween(Integer value1, Integer value2) {
            addCriterion("answersheet_id between", value1, value2, "answersheetId");
            return (Criteria) this;
        }

        public Criteria andAnswersheetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("answersheet_id not between", value1, value2, "answersheetId");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdIsNull() {
            addCriterion("administrator_id is null");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdIsNotNull() {
            addCriterion("administrator_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdEqualTo(Integer value) {
            addCriterion("administrator_id =", value, "administratorId");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdNotEqualTo(Integer value) {
            addCriterion("administrator_id <>", value, "administratorId");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdGreaterThan(Integer value) {
            addCriterion("administrator_id >", value, "administratorId");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("administrator_id >=", value, "administratorId");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdLessThan(Integer value) {
            addCriterion("administrator_id <", value, "administratorId");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdLessThanOrEqualTo(Integer value) {
            addCriterion("administrator_id <=", value, "administratorId");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdIn(List<Integer> values) {
            addCriterion("administrator_id in", values, "administratorId");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdNotIn(List<Integer> values) {
            addCriterion("administrator_id not in", values, "administratorId");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdBetween(Integer value1, Integer value2) {
            addCriterion("administrator_id between", value1, value2, "administratorId");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("administrator_id not between", value1, value2, "administratorId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Integer value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Integer value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Integer value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Integer value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Integer> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Integer> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andAnswerNameIsNull() {
            addCriterion("answer_name is null");
            return (Criteria) this;
        }

        public Criteria andAnswerNameIsNotNull() {
            addCriterion("answer_name is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerNameEqualTo(String value) {
            addCriterion("answer_name =", value, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameNotEqualTo(String value) {
            addCriterion("answer_name <>", value, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameGreaterThan(String value) {
            addCriterion("answer_name >", value, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameGreaterThanOrEqualTo(String value) {
            addCriterion("answer_name >=", value, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameLessThan(String value) {
            addCriterion("answer_name <", value, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameLessThanOrEqualTo(String value) {
            addCriterion("answer_name <=", value, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameLike(String value) {
            addCriterion("answer_name like", value, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameNotLike(String value) {
            addCriterion("answer_name not like", value, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameIn(List<String> values) {
            addCriterion("answer_name in", values, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameNotIn(List<String> values) {
            addCriterion("answer_name not in", values, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameBetween(String value1, String value2) {
            addCriterion("answer_name between", value1, value2, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameNotBetween(String value1, String value2) {
            addCriterion("answer_name not between", value1, value2, "answerName");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeIsNull() {
            addCriterion("establish_time is null");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeIsNotNull() {
            addCriterion("establish_time is not null");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeEqualTo(Date value) {
            addCriterion("establish_time =", value, "establishTime");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeNotEqualTo(Date value) {
            addCriterion("establish_time <>", value, "establishTime");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeGreaterThan(Date value) {
            addCriterion("establish_time >", value, "establishTime");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("establish_time >=", value, "establishTime");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeLessThan(Date value) {
            addCriterion("establish_time <", value, "establishTime");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeLessThanOrEqualTo(Date value) {
            addCriterion("establish_time <=", value, "establishTime");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeIn(List<Date> values) {
            addCriterion("establish_time in", values, "establishTime");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeNotIn(List<Date> values) {
            addCriterion("establish_time not in", values, "establishTime");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeBetween(Date value1, Date value2) {
            addCriterion("establish_time between", value1, value2, "establishTime");
            return (Criteria) this;
        }

        public Criteria andEstablishTimeNotBetween(Date value1, Date value2) {
            addCriterion("establish_time not between", value1, value2, "establishTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeIsNull() {
            addCriterion("exam_time is null");
            return (Criteria) this;
        }

        public Criteria andExamTimeIsNotNull() {
            addCriterion("exam_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamTimeEqualTo(Short value) {
            addCriterion("exam_time =", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotEqualTo(Short value) {
            addCriterion("exam_time <>", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeGreaterThan(Short value) {
            addCriterion("exam_time >", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeGreaterThanOrEqualTo(Short value) {
            addCriterion("exam_time >=", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeLessThan(Short value) {
            addCriterion("exam_time <", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeLessThanOrEqualTo(Short value) {
            addCriterion("exam_time <=", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeIn(List<Short> values) {
            addCriterion("exam_time in", values, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotIn(List<Short> values) {
            addCriterion("exam_time not in", values, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeBetween(Short value1, Short value2) {
            addCriterion("exam_time between", value1, value2, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotBetween(Short value1, Short value2) {
            addCriterion("exam_time not between", value1, value2, "examTime");
            return (Criteria) this;
        }

        public Criteria andObjNumIsNull() {
            addCriterion("obj_num is null");
            return (Criteria) this;
        }

        public Criteria andObjNumIsNotNull() {
            addCriterion("obj_num is not null");
            return (Criteria) this;
        }

        public Criteria andObjNumEqualTo(Short value) {
            addCriterion("obj_num =", value, "objNum");
            return (Criteria) this;
        }

        public Criteria andObjNumNotEqualTo(Short value) {
            addCriterion("obj_num <>", value, "objNum");
            return (Criteria) this;
        }

        public Criteria andObjNumGreaterThan(Short value) {
            addCriterion("obj_num >", value, "objNum");
            return (Criteria) this;
        }

        public Criteria andObjNumGreaterThanOrEqualTo(Short value) {
            addCriterion("obj_num >=", value, "objNum");
            return (Criteria) this;
        }

        public Criteria andObjNumLessThan(Short value) {
            addCriterion("obj_num <", value, "objNum");
            return (Criteria) this;
        }

        public Criteria andObjNumLessThanOrEqualTo(Short value) {
            addCriterion("obj_num <=", value, "objNum");
            return (Criteria) this;
        }

        public Criteria andObjNumIn(List<Short> values) {
            addCriterion("obj_num in", values, "objNum");
            return (Criteria) this;
        }

        public Criteria andObjNumNotIn(List<Short> values) {
            addCriterion("obj_num not in", values, "objNum");
            return (Criteria) this;
        }

        public Criteria andObjNumBetween(Short value1, Short value2) {
            addCriterion("obj_num between", value1, value2, "objNum");
            return (Criteria) this;
        }

        public Criteria andObjNumNotBetween(Short value1, Short value2) {
            addCriterion("obj_num not between", value1, value2, "objNum");
            return (Criteria) this;
        }

        public Criteria andSubjNumIsNull() {
            addCriterion("subj_num is null");
            return (Criteria) this;
        }

        public Criteria andSubjNumIsNotNull() {
            addCriterion("subj_num is not null");
            return (Criteria) this;
        }

        public Criteria andSubjNumEqualTo(Short value) {
            addCriterion("subj_num =", value, "subjNum");
            return (Criteria) this;
        }

        public Criteria andSubjNumNotEqualTo(Short value) {
            addCriterion("subj_num <>", value, "subjNum");
            return (Criteria) this;
        }

        public Criteria andSubjNumGreaterThan(Short value) {
            addCriterion("subj_num >", value, "subjNum");
            return (Criteria) this;
        }

        public Criteria andSubjNumGreaterThanOrEqualTo(Short value) {
            addCriterion("subj_num >=", value, "subjNum");
            return (Criteria) this;
        }

        public Criteria andSubjNumLessThan(Short value) {
            addCriterion("subj_num <", value, "subjNum");
            return (Criteria) this;
        }

        public Criteria andSubjNumLessThanOrEqualTo(Short value) {
            addCriterion("subj_num <=", value, "subjNum");
            return (Criteria) this;
        }

        public Criteria andSubjNumIn(List<Short> values) {
            addCriterion("subj_num in", values, "subjNum");
            return (Criteria) this;
        }

        public Criteria andSubjNumNotIn(List<Short> values) {
            addCriterion("subj_num not in", values, "subjNum");
            return (Criteria) this;
        }

        public Criteria andSubjNumBetween(Short value1, Short value2) {
            addCriterion("subj_num between", value1, value2, "subjNum");
            return (Criteria) this;
        }

        public Criteria andSubjNumNotBetween(Short value1, Short value2) {
            addCriterion("subj_num not between", value1, value2, "subjNum");
            return (Criteria) this;
        }

        public Criteria andIsAssignIsNull() {
            addCriterion("is_assign is null");
            return (Criteria) this;
        }

        public Criteria andIsAssignIsNotNull() {
            addCriterion("is_assign is not null");
            return (Criteria) this;
        }

        public Criteria andIsAssignEqualTo(Byte value) {
            addCriterion("is_assign =", value, "isAssign");
            return (Criteria) this;
        }

        public Criteria andIsAssignNotEqualTo(Byte value) {
            addCriterion("is_assign <>", value, "isAssign");
            return (Criteria) this;
        }

        public Criteria andIsAssignGreaterThan(Byte value) {
            addCriterion("is_assign >", value, "isAssign");
            return (Criteria) this;
        }

        public Criteria andIsAssignGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_assign >=", value, "isAssign");
            return (Criteria) this;
        }

        public Criteria andIsAssignLessThan(Byte value) {
            addCriterion("is_assign <", value, "isAssign");
            return (Criteria) this;
        }

        public Criteria andIsAssignLessThanOrEqualTo(Byte value) {
            addCriterion("is_assign <=", value, "isAssign");
            return (Criteria) this;
        }

        public Criteria andIsAssignIn(List<Byte> values) {
            addCriterion("is_assign in", values, "isAssign");
            return (Criteria) this;
        }

        public Criteria andIsAssignNotIn(List<Byte> values) {
            addCriterion("is_assign not in", values, "isAssign");
            return (Criteria) this;
        }

        public Criteria andIsAssignBetween(Byte value1, Byte value2) {
            addCriterion("is_assign between", value1, value2, "isAssign");
            return (Criteria) this;
        }

        public Criteria andIsAssignNotBetween(Byte value1, Byte value2) {
            addCriterion("is_assign not between", value1, value2, "isAssign");
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