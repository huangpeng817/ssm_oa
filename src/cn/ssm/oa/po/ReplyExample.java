package cn.ssm.oa.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andFaceiconIsNull() {
            addCriterion("faceIcon is null");
            return (Criteria) this;
        }

        public Criteria andFaceiconIsNotNull() {
            addCriterion("faceIcon is not null");
            return (Criteria) this;
        }

        public Criteria andFaceiconEqualTo(String value) {
            addCriterion("faceIcon =", value, "faceicon");
            return (Criteria) this;
        }

        public Criteria andFaceiconNotEqualTo(String value) {
            addCriterion("faceIcon <>", value, "faceicon");
            return (Criteria) this;
        }

        public Criteria andFaceiconGreaterThan(String value) {
            addCriterion("faceIcon >", value, "faceicon");
            return (Criteria) this;
        }

        public Criteria andFaceiconGreaterThanOrEqualTo(String value) {
            addCriterion("faceIcon >=", value, "faceicon");
            return (Criteria) this;
        }

        public Criteria andFaceiconLessThan(String value) {
            addCriterion("faceIcon <", value, "faceicon");
            return (Criteria) this;
        }

        public Criteria andFaceiconLessThanOrEqualTo(String value) {
            addCriterion("faceIcon <=", value, "faceicon");
            return (Criteria) this;
        }

        public Criteria andFaceiconLike(String value) {
            addCriterion("faceIcon like", value, "faceicon");
            return (Criteria) this;
        }

        public Criteria andFaceiconNotLike(String value) {
            addCriterion("faceIcon not like", value, "faceicon");
            return (Criteria) this;
        }

        public Criteria andFaceiconIn(List<String> values) {
            addCriterion("faceIcon in", values, "faceicon");
            return (Criteria) this;
        }

        public Criteria andFaceiconNotIn(List<String> values) {
            addCriterion("faceIcon not in", values, "faceicon");
            return (Criteria) this;
        }

        public Criteria andFaceiconBetween(String value1, String value2) {
            addCriterion("faceIcon between", value1, value2, "faceicon");
            return (Criteria) this;
        }

        public Criteria andFaceiconNotBetween(String value1, String value2) {
            addCriterion("faceIcon not between", value1, value2, "faceicon");
            return (Criteria) this;
        }

        public Criteria andPosttimeIsNull() {
            addCriterion("postTime is null");
            return (Criteria) this;
        }

        public Criteria andPosttimeIsNotNull() {
            addCriterion("postTime is not null");
            return (Criteria) this;
        }

        public Criteria andPosttimeEqualTo(Date value) {
            addCriterion("postTime =", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeNotEqualTo(Date value) {
            addCriterion("postTime <>", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeGreaterThan(Date value) {
            addCriterion("postTime >", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("postTime >=", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeLessThan(Date value) {
            addCriterion("postTime <", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeLessThanOrEqualTo(Date value) {
            addCriterion("postTime <=", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeIn(List<Date> values) {
            addCriterion("postTime in", values, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeNotIn(List<Date> values) {
            addCriterion("postTime not in", values, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeBetween(Date value1, Date value2) {
            addCriterion("postTime between", value1, value2, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeNotBetween(Date value1, Date value2) {
            addCriterion("postTime not between", value1, value2, "posttime");
            return (Criteria) this;
        }

        public Criteria andIpaddrIsNull() {
            addCriterion("ipAddr is null");
            return (Criteria) this;
        }

        public Criteria andIpaddrIsNotNull() {
            addCriterion("ipAddr is not null");
            return (Criteria) this;
        }

        public Criteria andIpaddrEqualTo(String value) {
            addCriterion("ipAddr =", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotEqualTo(String value) {
            addCriterion("ipAddr <>", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrGreaterThan(String value) {
            addCriterion("ipAddr >", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrGreaterThanOrEqualTo(String value) {
            addCriterion("ipAddr >=", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrLessThan(String value) {
            addCriterion("ipAddr <", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrLessThanOrEqualTo(String value) {
            addCriterion("ipAddr <=", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrLike(String value) {
            addCriterion("ipAddr like", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotLike(String value) {
            addCriterion("ipAddr not like", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrIn(List<String> values) {
            addCriterion("ipAddr in", values, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotIn(List<String> values) {
            addCriterion("ipAddr not in", values, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrBetween(String value1, String value2) {
            addCriterion("ipAddr between", value1, value2, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotBetween(String value1, String value2) {
            addCriterion("ipAddr not between", value1, value2, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andAuthoridIsNull() {
            addCriterion("authorId is null");
            return (Criteria) this;
        }

        public Criteria andAuthoridIsNotNull() {
            addCriterion("authorId is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoridEqualTo(Long value) {
            addCriterion("authorId =", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridNotEqualTo(Long value) {
            addCriterion("authorId <>", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridGreaterThan(Long value) {
            addCriterion("authorId >", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridGreaterThanOrEqualTo(Long value) {
            addCriterion("authorId >=", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridLessThan(Long value) {
            addCriterion("authorId <", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridLessThanOrEqualTo(Long value) {
            addCriterion("authorId <=", value, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridIn(List<Long> values) {
            addCriterion("authorId in", values, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridNotIn(List<Long> values) {
            addCriterion("authorId not in", values, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridBetween(Long value1, Long value2) {
            addCriterion("authorId between", value1, value2, "authorid");
            return (Criteria) this;
        }

        public Criteria andAuthoridNotBetween(Long value1, Long value2) {
            addCriterion("authorId not between", value1, value2, "authorid");
            return (Criteria) this;
        }

        public Criteria andTopicidIsNull() {
            addCriterion("topicId is null");
            return (Criteria) this;
        }

        public Criteria andTopicidIsNotNull() {
            addCriterion("topicId is not null");
            return (Criteria) this;
        }

        public Criteria andTopicidEqualTo(Long value) {
            addCriterion("topicId =", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidNotEqualTo(Long value) {
            addCriterion("topicId <>", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidGreaterThan(Long value) {
            addCriterion("topicId >", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidGreaterThanOrEqualTo(Long value) {
            addCriterion("topicId >=", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidLessThan(Long value) {
            addCriterion("topicId <", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidLessThanOrEqualTo(Long value) {
            addCriterion("topicId <=", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidIn(List<Long> values) {
            addCriterion("topicId in", values, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidNotIn(List<Long> values) {
            addCriterion("topicId not in", values, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidBetween(Long value1, Long value2) {
            addCriterion("topicId between", value1, value2, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidNotBetween(Long value1, Long value2) {
            addCriterion("topicId not between", value1, value2, "topicid");
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