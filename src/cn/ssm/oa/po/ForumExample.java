package cn.ssm.oa.po;

import java.util.ArrayList;
import java.util.List;

public class ForumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ForumExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(Integer value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(Integer value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(Integer value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(Integer value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(Integer value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<Integer> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<Integer> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(Integer value1, Integer value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andTopiccountIsNull() {
            addCriterion("topicCount is null");
            return (Criteria) this;
        }

        public Criteria andTopiccountIsNotNull() {
            addCriterion("topicCount is not null");
            return (Criteria) this;
        }

        public Criteria andTopiccountEqualTo(Integer value) {
            addCriterion("topicCount =", value, "topiccount");
            return (Criteria) this;
        }

        public Criteria andTopiccountNotEqualTo(Integer value) {
            addCriterion("topicCount <>", value, "topiccount");
            return (Criteria) this;
        }

        public Criteria andTopiccountGreaterThan(Integer value) {
            addCriterion("topicCount >", value, "topiccount");
            return (Criteria) this;
        }

        public Criteria andTopiccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("topicCount >=", value, "topiccount");
            return (Criteria) this;
        }

        public Criteria andTopiccountLessThan(Integer value) {
            addCriterion("topicCount <", value, "topiccount");
            return (Criteria) this;
        }

        public Criteria andTopiccountLessThanOrEqualTo(Integer value) {
            addCriterion("topicCount <=", value, "topiccount");
            return (Criteria) this;
        }

        public Criteria andTopiccountIn(List<Integer> values) {
            addCriterion("topicCount in", values, "topiccount");
            return (Criteria) this;
        }

        public Criteria andTopiccountNotIn(List<Integer> values) {
            addCriterion("topicCount not in", values, "topiccount");
            return (Criteria) this;
        }

        public Criteria andTopiccountBetween(Integer value1, Integer value2) {
            addCriterion("topicCount between", value1, value2, "topiccount");
            return (Criteria) this;
        }

        public Criteria andTopiccountNotBetween(Integer value1, Integer value2) {
            addCriterion("topicCount not between", value1, value2, "topiccount");
            return (Criteria) this;
        }

        public Criteria andArticlecountIsNull() {
            addCriterion("articleCount is null");
            return (Criteria) this;
        }

        public Criteria andArticlecountIsNotNull() {
            addCriterion("articleCount is not null");
            return (Criteria) this;
        }

        public Criteria andArticlecountEqualTo(Integer value) {
            addCriterion("articleCount =", value, "articlecount");
            return (Criteria) this;
        }

        public Criteria andArticlecountNotEqualTo(Integer value) {
            addCriterion("articleCount <>", value, "articlecount");
            return (Criteria) this;
        }

        public Criteria andArticlecountGreaterThan(Integer value) {
            addCriterion("articleCount >", value, "articlecount");
            return (Criteria) this;
        }

        public Criteria andArticlecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("articleCount >=", value, "articlecount");
            return (Criteria) this;
        }

        public Criteria andArticlecountLessThan(Integer value) {
            addCriterion("articleCount <", value, "articlecount");
            return (Criteria) this;
        }

        public Criteria andArticlecountLessThanOrEqualTo(Integer value) {
            addCriterion("articleCount <=", value, "articlecount");
            return (Criteria) this;
        }

        public Criteria andArticlecountIn(List<Integer> values) {
            addCriterion("articleCount in", values, "articlecount");
            return (Criteria) this;
        }

        public Criteria andArticlecountNotIn(List<Integer> values) {
            addCriterion("articleCount not in", values, "articlecount");
            return (Criteria) this;
        }

        public Criteria andArticlecountBetween(Integer value1, Integer value2) {
            addCriterion("articleCount between", value1, value2, "articlecount");
            return (Criteria) this;
        }

        public Criteria andArticlecountNotBetween(Integer value1, Integer value2) {
            addCriterion("articleCount not between", value1, value2, "articlecount");
            return (Criteria) this;
        }

        public Criteria andLasttopicidIsNull() {
            addCriterion("lastTopicId is null");
            return (Criteria) this;
        }

        public Criteria andLasttopicidIsNotNull() {
            addCriterion("lastTopicId is not null");
            return (Criteria) this;
        }

        public Criteria andLasttopicidEqualTo(Long value) {
            addCriterion("lastTopicId =", value, "lasttopicid");
            return (Criteria) this;
        }

        public Criteria andLasttopicidNotEqualTo(Long value) {
            addCriterion("lastTopicId <>", value, "lasttopicid");
            return (Criteria) this;
        }

        public Criteria andLasttopicidGreaterThan(Long value) {
            addCriterion("lastTopicId >", value, "lasttopicid");
            return (Criteria) this;
        }

        public Criteria andLasttopicidGreaterThanOrEqualTo(Long value) {
            addCriterion("lastTopicId >=", value, "lasttopicid");
            return (Criteria) this;
        }

        public Criteria andLasttopicidLessThan(Long value) {
            addCriterion("lastTopicId <", value, "lasttopicid");
            return (Criteria) this;
        }

        public Criteria andLasttopicidLessThanOrEqualTo(Long value) {
            addCriterion("lastTopicId <=", value, "lasttopicid");
            return (Criteria) this;
        }

        public Criteria andLasttopicidIn(List<Long> values) {
            addCriterion("lastTopicId in", values, "lasttopicid");
            return (Criteria) this;
        }

        public Criteria andLasttopicidNotIn(List<Long> values) {
            addCriterion("lastTopicId not in", values, "lasttopicid");
            return (Criteria) this;
        }

        public Criteria andLasttopicidBetween(Long value1, Long value2) {
            addCriterion("lastTopicId between", value1, value2, "lasttopicid");
            return (Criteria) this;
        }

        public Criteria andLasttopicidNotBetween(Long value1, Long value2) {
            addCriterion("lastTopicId not between", value1, value2, "lasttopicid");
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