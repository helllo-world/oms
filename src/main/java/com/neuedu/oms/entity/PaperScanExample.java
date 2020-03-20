package com.neuedu.oms.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaperScanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperScanExample() {
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

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
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

        public Criteria andPaperNameIsNull() {
            addCriterion("paper_name is null");
            return (Criteria) this;
        }

        public Criteria andPaperNameIsNotNull() {
            addCriterion("paper_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaperNameEqualTo(String value) {
            addCriterion("paper_name =", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotEqualTo(String value) {
            addCriterion("paper_name <>", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameGreaterThan(String value) {
            addCriterion("paper_name >", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameGreaterThanOrEqualTo(String value) {
            addCriterion("paper_name >=", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLessThan(String value) {
            addCriterion("paper_name <", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLessThanOrEqualTo(String value) {
            addCriterion("paper_name <=", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLike(String value) {
            addCriterion("paper_name like", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotLike(String value) {
            addCriterion("paper_name not like", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameIn(List<String> values) {
            addCriterion("paper_name in", values, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotIn(List<String> values) {
            addCriterion("paper_name not in", values, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameBetween(String value1, String value2) {
            addCriterion("paper_name between", value1, value2, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotBetween(String value1, String value2) {
            addCriterion("paper_name not between", value1, value2, "paperName");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumIsNull() {
            addCriterion("student_exam_num is null");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumIsNotNull() {
            addCriterion("student_exam_num is not null");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumEqualTo(Integer value) {
            addCriterion("student_exam_num =", value, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumNotEqualTo(Integer value) {
            addCriterion("student_exam_num <>", value, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumGreaterThan(Integer value) {
            addCriterion("student_exam_num >", value, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_exam_num >=", value, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumLessThan(Integer value) {
            addCriterion("student_exam_num <", value, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumLessThanOrEqualTo(Integer value) {
            addCriterion("student_exam_num <=", value, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumIn(List<Integer> values) {
            addCriterion("student_exam_num in", values, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumNotIn(List<Integer> values) {
            addCriterion("student_exam_num not in", values, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumBetween(Integer value1, Integer value2) {
            addCriterion("student_exam_num between", value1, value2, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumNotBetween(Integer value1, Integer value2) {
            addCriterion("student_exam_num not between", value1, value2, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNull() {
            addCriterion("bar_code is null");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNotNull() {
            addCriterion("bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualTo(String value) {
            addCriterion("bar_code =", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualTo(String value) {
            addCriterion("bar_code <>", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThan(String value) {
            addCriterion("bar_code >", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bar_code >=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThan(String value) {
            addCriterion("bar_code <", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualTo(String value) {
            addCriterion("bar_code <=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLike(String value) {
            addCriterion("bar_code like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotLike(String value) {
            addCriterion("bar_code not like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeIn(List<String> values) {
            addCriterion("bar_code in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotIn(List<String> values) {
            addCriterion("bar_code not in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeBetween(String value1, String value2) {
            addCriterion("bar_code between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotBetween(String value1, String value2) {
            addCriterion("bar_code not between", value1, value2, "barCode");
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

        public Criteria andSubmitTimeIsNull() {
            addCriterion("submit_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNotNull() {
            addCriterion("submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeEqualTo(Date value) {
            addCriterion("submit_time =", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotEqualTo(Date value) {
            addCriterion("submit_time <>", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThan(Date value) {
            addCriterion("submit_time >", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("submit_time >=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThan(Date value) {
            addCriterion("submit_time <", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("submit_time <=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIn(List<Date> values) {
            addCriterion("submit_time in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotIn(List<Date> values) {
            addCriterion("submit_time not in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("submit_time between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("submit_time not between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andAddressPrefixIsNull() {
            addCriterion("address_prefix is null");
            return (Criteria) this;
        }

        public Criteria andAddressPrefixIsNotNull() {
            addCriterion("address_prefix is not null");
            return (Criteria) this;
        }

        public Criteria andAddressPrefixEqualTo(String value) {
            addCriterion("address_prefix =", value, "addressPrefix");
            return (Criteria) this;
        }

        public Criteria andAddressPrefixNotEqualTo(String value) {
            addCriterion("address_prefix <>", value, "addressPrefix");
            return (Criteria) this;
        }

        public Criteria andAddressPrefixGreaterThan(String value) {
            addCriterion("address_prefix >", value, "addressPrefix");
            return (Criteria) this;
        }

        public Criteria andAddressPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("address_prefix >=", value, "addressPrefix");
            return (Criteria) this;
        }

        public Criteria andAddressPrefixLessThan(String value) {
            addCriterion("address_prefix <", value, "addressPrefix");
            return (Criteria) this;
        }

        public Criteria andAddressPrefixLessThanOrEqualTo(String value) {
            addCriterion("address_prefix <=", value, "addressPrefix");
            return (Criteria) this;
        }

        public Criteria andAddressPrefixLike(String value) {
            addCriterion("address_prefix like", value, "addressPrefix");
            return (Criteria) this;
        }

        public Criteria andAddressPrefixNotLike(String value) {
            addCriterion("address_prefix not like", value, "addressPrefix");
            return (Criteria) this;
        }

        public Criteria andAddressPrefixIn(List<String> values) {
            addCriterion("address_prefix in", values, "addressPrefix");
            return (Criteria) this;
        }

        public Criteria andAddressPrefixNotIn(List<String> values) {
            addCriterion("address_prefix not in", values, "addressPrefix");
            return (Criteria) this;
        }

        public Criteria andAddressPrefixBetween(String value1, String value2) {
            addCriterion("address_prefix between", value1, value2, "addressPrefix");
            return (Criteria) this;
        }

        public Criteria andAddressPrefixNotBetween(String value1, String value2) {
            addCriterion("address_prefix not between", value1, value2, "addressPrefix");
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

        public Criteria andObjGetIsNull() {
            addCriterion("obj_get is null");
            return (Criteria) this;
        }

        public Criteria andObjGetIsNotNull() {
            addCriterion("obj_get is not null");
            return (Criteria) this;
        }

        public Criteria andObjGetEqualTo(Integer value) {
            addCriterion("obj_get =", value, "objGet");
            return (Criteria) this;
        }

        public Criteria andObjGetNotEqualTo(Integer value) {
            addCriterion("obj_get <>", value, "objGet");
            return (Criteria) this;
        }

        public Criteria andObjGetGreaterThan(Integer value) {
            addCriterion("obj_get >", value, "objGet");
            return (Criteria) this;
        }

        public Criteria andObjGetGreaterThanOrEqualTo(Integer value) {
            addCriterion("obj_get >=", value, "objGet");
            return (Criteria) this;
        }

        public Criteria andObjGetLessThan(Integer value) {
            addCriterion("obj_get <", value, "objGet");
            return (Criteria) this;
        }

        public Criteria andObjGetLessThanOrEqualTo(Integer value) {
            addCriterion("obj_get <=", value, "objGet");
            return (Criteria) this;
        }

        public Criteria andObjGetIn(List<Integer> values) {
            addCriterion("obj_get in", values, "objGet");
            return (Criteria) this;
        }

        public Criteria andObjGetNotIn(List<Integer> values) {
            addCriterion("obj_get not in", values, "objGet");
            return (Criteria) this;
        }

        public Criteria andObjGetBetween(Integer value1, Integer value2) {
            addCriterion("obj_get between", value1, value2, "objGet");
            return (Criteria) this;
        }

        public Criteria andObjGetNotBetween(Integer value1, Integer value2) {
            addCriterion("obj_get not between", value1, value2, "objGet");
            return (Criteria) this;
        }

        public Criteria andObjAllIsNull() {
            addCriterion("obj_all is null");
            return (Criteria) this;
        }

        public Criteria andObjAllIsNotNull() {
            addCriterion("obj_all is not null");
            return (Criteria) this;
        }

        public Criteria andObjAllEqualTo(Integer value) {
            addCriterion("obj_all =", value, "objAll");
            return (Criteria) this;
        }

        public Criteria andObjAllNotEqualTo(Integer value) {
            addCriterion("obj_all <>", value, "objAll");
            return (Criteria) this;
        }

        public Criteria andObjAllGreaterThan(Integer value) {
            addCriterion("obj_all >", value, "objAll");
            return (Criteria) this;
        }

        public Criteria andObjAllGreaterThanOrEqualTo(Integer value) {
            addCriterion("obj_all >=", value, "objAll");
            return (Criteria) this;
        }

        public Criteria andObjAllLessThan(Integer value) {
            addCriterion("obj_all <", value, "objAll");
            return (Criteria) this;
        }

        public Criteria andObjAllLessThanOrEqualTo(Integer value) {
            addCriterion("obj_all <=", value, "objAll");
            return (Criteria) this;
        }

        public Criteria andObjAllIn(List<Integer> values) {
            addCriterion("obj_all in", values, "objAll");
            return (Criteria) this;
        }

        public Criteria andObjAllNotIn(List<Integer> values) {
            addCriterion("obj_all not in", values, "objAll");
            return (Criteria) this;
        }

        public Criteria andObjAllBetween(Integer value1, Integer value2) {
            addCriterion("obj_all between", value1, value2, "objAll");
            return (Criteria) this;
        }

        public Criteria andObjAllNotBetween(Integer value1, Integer value2) {
            addCriterion("obj_all not between", value1, value2, "objAll");
            return (Criteria) this;
        }

        public Criteria andSubjGetIsNull() {
            addCriterion("subj_get is null");
            return (Criteria) this;
        }

        public Criteria andSubjGetIsNotNull() {
            addCriterion("subj_get is not null");
            return (Criteria) this;
        }

        public Criteria andSubjGetEqualTo(Integer value) {
            addCriterion("subj_get =", value, "subjGet");
            return (Criteria) this;
        }

        public Criteria andSubjGetNotEqualTo(Integer value) {
            addCriterion("subj_get <>", value, "subjGet");
            return (Criteria) this;
        }

        public Criteria andSubjGetGreaterThan(Integer value) {
            addCriterion("subj_get >", value, "subjGet");
            return (Criteria) this;
        }

        public Criteria andSubjGetGreaterThanOrEqualTo(Integer value) {
            addCriterion("subj_get >=", value, "subjGet");
            return (Criteria) this;
        }

        public Criteria andSubjGetLessThan(Integer value) {
            addCriterion("subj_get <", value, "subjGet");
            return (Criteria) this;
        }

        public Criteria andSubjGetLessThanOrEqualTo(Integer value) {
            addCriterion("subj_get <=", value, "subjGet");
            return (Criteria) this;
        }

        public Criteria andSubjGetIn(List<Integer> values) {
            addCriterion("subj_get in", values, "subjGet");
            return (Criteria) this;
        }

        public Criteria andSubjGetNotIn(List<Integer> values) {
            addCriterion("subj_get not in", values, "subjGet");
            return (Criteria) this;
        }

        public Criteria andSubjGetBetween(Integer value1, Integer value2) {
            addCriterion("subj_get between", value1, value2, "subjGet");
            return (Criteria) this;
        }

        public Criteria andSubjGetNotBetween(Integer value1, Integer value2) {
            addCriterion("subj_get not between", value1, value2, "subjGet");
            return (Criteria) this;
        }

        public Criteria andSubjAllIsNull() {
            addCriterion("subj_all is null");
            return (Criteria) this;
        }

        public Criteria andSubjAllIsNotNull() {
            addCriterion("subj_all is not null");
            return (Criteria) this;
        }

        public Criteria andSubjAllEqualTo(Integer value) {
            addCriterion("subj_all =", value, "subjAll");
            return (Criteria) this;
        }

        public Criteria andSubjAllNotEqualTo(Integer value) {
            addCriterion("subj_all <>", value, "subjAll");
            return (Criteria) this;
        }

        public Criteria andSubjAllGreaterThan(Integer value) {
            addCriterion("subj_all >", value, "subjAll");
            return (Criteria) this;
        }

        public Criteria andSubjAllGreaterThanOrEqualTo(Integer value) {
            addCriterion("subj_all >=", value, "subjAll");
            return (Criteria) this;
        }

        public Criteria andSubjAllLessThan(Integer value) {
            addCriterion("subj_all <", value, "subjAll");
            return (Criteria) this;
        }

        public Criteria andSubjAllLessThanOrEqualTo(Integer value) {
            addCriterion("subj_all <=", value, "subjAll");
            return (Criteria) this;
        }

        public Criteria andSubjAllIn(List<Integer> values) {
            addCriterion("subj_all in", values, "subjAll");
            return (Criteria) this;
        }

        public Criteria andSubjAllNotIn(List<Integer> values) {
            addCriterion("subj_all not in", values, "subjAll");
            return (Criteria) this;
        }

        public Criteria andSubjAllBetween(Integer value1, Integer value2) {
            addCriterion("subj_all between", value1, value2, "subjAll");
            return (Criteria) this;
        }

        public Criteria andSubjAllNotBetween(Integer value1, Integer value2) {
            addCriterion("subj_all not between", value1, value2, "subjAll");
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

        public Criteria andScoreGetEqualTo(Integer value) {
            addCriterion("score_get =", value, "scoreGet");
            return (Criteria) this;
        }

        public Criteria andScoreGetNotEqualTo(Integer value) {
            addCriterion("score_get <>", value, "scoreGet");
            return (Criteria) this;
        }

        public Criteria andScoreGetGreaterThan(Integer value) {
            addCriterion("score_get >", value, "scoreGet");
            return (Criteria) this;
        }

        public Criteria andScoreGetGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_get >=", value, "scoreGet");
            return (Criteria) this;
        }

        public Criteria andScoreGetLessThan(Integer value) {
            addCriterion("score_get <", value, "scoreGet");
            return (Criteria) this;
        }

        public Criteria andScoreGetLessThanOrEqualTo(Integer value) {
            addCriterion("score_get <=", value, "scoreGet");
            return (Criteria) this;
        }

        public Criteria andScoreGetIn(List<Integer> values) {
            addCriterion("score_get in", values, "scoreGet");
            return (Criteria) this;
        }

        public Criteria andScoreGetNotIn(List<Integer> values) {
            addCriterion("score_get not in", values, "scoreGet");
            return (Criteria) this;
        }

        public Criteria andScoreGetBetween(Integer value1, Integer value2) {
            addCriterion("score_get between", value1, value2, "scoreGet");
            return (Criteria) this;
        }

        public Criteria andScoreGetNotBetween(Integer value1, Integer value2) {
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

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
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