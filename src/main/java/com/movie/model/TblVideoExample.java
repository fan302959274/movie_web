package com.movie.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblVideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblVideoExample() {
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

        public Criteria andVideoNameIsNull() {
            addCriterion("video_name is null");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNotNull() {
            addCriterion("video_name is not null");
            return (Criteria) this;
        }

        public Criteria andVideoNameEqualTo(String value) {
            addCriterion("video_name =", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotEqualTo(String value) {
            addCriterion("video_name <>", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThan(String value) {
            addCriterion("video_name >", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThanOrEqualTo(String value) {
            addCriterion("video_name >=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThan(String value) {
            addCriterion("video_name <", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThanOrEqualTo(String value) {
            addCriterion("video_name <=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLike(String value) {
            addCriterion("video_name like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotLike(String value) {
            addCriterion("video_name not like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameIn(List<String> values) {
            addCriterion("video_name in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotIn(List<String> values) {
            addCriterion("video_name not in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameBetween(String value1, String value2) {
            addCriterion("video_name between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotBetween(String value1, String value2) {
            addCriterion("video_name not between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionIsNull() {
            addCriterion("video_introduction is null");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionIsNotNull() {
            addCriterion("video_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionEqualTo(String value) {
            addCriterion("video_introduction =", value, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionNotEqualTo(String value) {
            addCriterion("video_introduction <>", value, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionGreaterThan(String value) {
            addCriterion("video_introduction >", value, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("video_introduction >=", value, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionLessThan(String value) {
            addCriterion("video_introduction <", value, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionLessThanOrEqualTo(String value) {
            addCriterion("video_introduction <=", value, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionLike(String value) {
            addCriterion("video_introduction like", value, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionNotLike(String value) {
            addCriterion("video_introduction not like", value, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionIn(List<String> values) {
            addCriterion("video_introduction in", values, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionNotIn(List<String> values) {
            addCriterion("video_introduction not in", values, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionBetween(String value1, String value2) {
            addCriterion("video_introduction between", value1, value2, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoIntroductionNotBetween(String value1, String value2) {
            addCriterion("video_introduction not between", value1, value2, "videoIntroduction");
            return (Criteria) this;
        }

        public Criteria andVideoPosterIsNull() {
            addCriterion("video_poster is null");
            return (Criteria) this;
        }

        public Criteria andVideoPosterIsNotNull() {
            addCriterion("video_poster is not null");
            return (Criteria) this;
        }

        public Criteria andVideoPosterEqualTo(String value) {
            addCriterion("video_poster =", value, "videoPoster");
            return (Criteria) this;
        }

        public Criteria andVideoPosterNotEqualTo(String value) {
            addCriterion("video_poster <>", value, "videoPoster");
            return (Criteria) this;
        }

        public Criteria andVideoPosterGreaterThan(String value) {
            addCriterion("video_poster >", value, "videoPoster");
            return (Criteria) this;
        }

        public Criteria andVideoPosterGreaterThanOrEqualTo(String value) {
            addCriterion("video_poster >=", value, "videoPoster");
            return (Criteria) this;
        }

        public Criteria andVideoPosterLessThan(String value) {
            addCriterion("video_poster <", value, "videoPoster");
            return (Criteria) this;
        }

        public Criteria andVideoPosterLessThanOrEqualTo(String value) {
            addCriterion("video_poster <=", value, "videoPoster");
            return (Criteria) this;
        }

        public Criteria andVideoPosterLike(String value) {
            addCriterion("video_poster like", value, "videoPoster");
            return (Criteria) this;
        }

        public Criteria andVideoPosterNotLike(String value) {
            addCriterion("video_poster not like", value, "videoPoster");
            return (Criteria) this;
        }

        public Criteria andVideoPosterIn(List<String> values) {
            addCriterion("video_poster in", values, "videoPoster");
            return (Criteria) this;
        }

        public Criteria andVideoPosterNotIn(List<String> values) {
            addCriterion("video_poster not in", values, "videoPoster");
            return (Criteria) this;
        }

        public Criteria andVideoPosterBetween(String value1, String value2) {
            addCriterion("video_poster between", value1, value2, "videoPoster");
            return (Criteria) this;
        }

        public Criteria andVideoPosterNotBetween(String value1, String value2) {
            addCriterion("video_poster not between", value1, value2, "videoPoster");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIsNull() {
            addCriterion("video_type is null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIsNotNull() {
            addCriterion("video_type is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeEqualTo(String value) {
            addCriterion("video_type =", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotEqualTo(String value) {
            addCriterion("video_type <>", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeGreaterThan(String value) {
            addCriterion("video_type >", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("video_type >=", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLessThan(String value) {
            addCriterion("video_type <", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLessThanOrEqualTo(String value) {
            addCriterion("video_type <=", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLike(String value) {
            addCriterion("video_type like", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotLike(String value) {
            addCriterion("video_type not like", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIn(List<String> values) {
            addCriterion("video_type in", values, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotIn(List<String> values) {
            addCriterion("video_type not in", values, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeBetween(String value1, String value2) {
            addCriterion("video_type between", value1, value2, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotBetween(String value1, String value2) {
            addCriterion("video_type not between", value1, value2, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTagIsNull() {
            addCriterion("video_tag is null");
            return (Criteria) this;
        }

        public Criteria andVideoTagIsNotNull() {
            addCriterion("video_tag is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTagEqualTo(String value) {
            addCriterion("video_tag =", value, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagNotEqualTo(String value) {
            addCriterion("video_tag <>", value, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagGreaterThan(String value) {
            addCriterion("video_tag >", value, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagGreaterThanOrEqualTo(String value) {
            addCriterion("video_tag >=", value, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagLessThan(String value) {
            addCriterion("video_tag <", value, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagLessThanOrEqualTo(String value) {
            addCriterion("video_tag <=", value, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagLike(String value) {
            addCriterion("video_tag like", value, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagNotLike(String value) {
            addCriterion("video_tag not like", value, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagIn(List<String> values) {
            addCriterion("video_tag in", values, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagNotIn(List<String> values) {
            addCriterion("video_tag not in", values, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagBetween(String value1, String value2) {
            addCriterion("video_tag between", value1, value2, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoTagNotBetween(String value1, String value2) {
            addCriterion("video_tag not between", value1, value2, "videoTag");
            return (Criteria) this;
        }

        public Criteria andVideoViewPathIsNull() {
            addCriterion("video_view_path is null");
            return (Criteria) this;
        }

        public Criteria andVideoViewPathIsNotNull() {
            addCriterion("video_view_path is not null");
            return (Criteria) this;
        }

        public Criteria andVideoViewPathEqualTo(String value) {
            addCriterion("video_view_path =", value, "videoViewPath");
            return (Criteria) this;
        }

        public Criteria andVideoViewPathNotEqualTo(String value) {
            addCriterion("video_view_path <>", value, "videoViewPath");
            return (Criteria) this;
        }

        public Criteria andVideoViewPathGreaterThan(String value) {
            addCriterion("video_view_path >", value, "videoViewPath");
            return (Criteria) this;
        }

        public Criteria andVideoViewPathGreaterThanOrEqualTo(String value) {
            addCriterion("video_view_path >=", value, "videoViewPath");
            return (Criteria) this;
        }

        public Criteria andVideoViewPathLessThan(String value) {
            addCriterion("video_view_path <", value, "videoViewPath");
            return (Criteria) this;
        }

        public Criteria andVideoViewPathLessThanOrEqualTo(String value) {
            addCriterion("video_view_path <=", value, "videoViewPath");
            return (Criteria) this;
        }

        public Criteria andVideoViewPathLike(String value) {
            addCriterion("video_view_path like", value, "videoViewPath");
            return (Criteria) this;
        }

        public Criteria andVideoViewPathNotLike(String value) {
            addCriterion("video_view_path not like", value, "videoViewPath");
            return (Criteria) this;
        }

        public Criteria andVideoViewPathIn(List<String> values) {
            addCriterion("video_view_path in", values, "videoViewPath");
            return (Criteria) this;
        }

        public Criteria andVideoViewPathNotIn(List<String> values) {
            addCriterion("video_view_path not in", values, "videoViewPath");
            return (Criteria) this;
        }

        public Criteria andVideoViewPathBetween(String value1, String value2) {
            addCriterion("video_view_path between", value1, value2, "videoViewPath");
            return (Criteria) this;
        }

        public Criteria andVideoViewPathNotBetween(String value1, String value2) {
            addCriterion("video_view_path not between", value1, value2, "videoViewPath");
            return (Criteria) this;
        }

        public Criteria andVideoDownPathIsNull() {
            addCriterion("video_down_path is null");
            return (Criteria) this;
        }

        public Criteria andVideoDownPathIsNotNull() {
            addCriterion("video_down_path is not null");
            return (Criteria) this;
        }

        public Criteria andVideoDownPathEqualTo(String value) {
            addCriterion("video_down_path =", value, "videoDownPath");
            return (Criteria) this;
        }

        public Criteria andVideoDownPathNotEqualTo(String value) {
            addCriterion("video_down_path <>", value, "videoDownPath");
            return (Criteria) this;
        }

        public Criteria andVideoDownPathGreaterThan(String value) {
            addCriterion("video_down_path >", value, "videoDownPath");
            return (Criteria) this;
        }

        public Criteria andVideoDownPathGreaterThanOrEqualTo(String value) {
            addCriterion("video_down_path >=", value, "videoDownPath");
            return (Criteria) this;
        }

        public Criteria andVideoDownPathLessThan(String value) {
            addCriterion("video_down_path <", value, "videoDownPath");
            return (Criteria) this;
        }

        public Criteria andVideoDownPathLessThanOrEqualTo(String value) {
            addCriterion("video_down_path <=", value, "videoDownPath");
            return (Criteria) this;
        }

        public Criteria andVideoDownPathLike(String value) {
            addCriterion("video_down_path like", value, "videoDownPath");
            return (Criteria) this;
        }

        public Criteria andVideoDownPathNotLike(String value) {
            addCriterion("video_down_path not like", value, "videoDownPath");
            return (Criteria) this;
        }

        public Criteria andVideoDownPathIn(List<String> values) {
            addCriterion("video_down_path in", values, "videoDownPath");
            return (Criteria) this;
        }

        public Criteria andVideoDownPathNotIn(List<String> values) {
            addCriterion("video_down_path not in", values, "videoDownPath");
            return (Criteria) this;
        }

        public Criteria andVideoDownPathBetween(String value1, String value2) {
            addCriterion("video_down_path between", value1, value2, "videoDownPath");
            return (Criteria) this;
        }

        public Criteria andVideoDownPathNotBetween(String value1, String value2) {
            addCriterion("video_down_path not between", value1, value2, "videoDownPath");
            return (Criteria) this;
        }

        public Criteria andVideoDurationIsNull() {
            addCriterion("video_duration is null");
            return (Criteria) this;
        }

        public Criteria andVideoDurationIsNotNull() {
            addCriterion("video_duration is not null");
            return (Criteria) this;
        }

        public Criteria andVideoDurationEqualTo(BigDecimal value) {
            addCriterion("video_duration =", value, "videoDuration");
            return (Criteria) this;
        }

        public Criteria andVideoDurationNotEqualTo(BigDecimal value) {
            addCriterion("video_duration <>", value, "videoDuration");
            return (Criteria) this;
        }

        public Criteria andVideoDurationGreaterThan(BigDecimal value) {
            addCriterion("video_duration >", value, "videoDuration");
            return (Criteria) this;
        }

        public Criteria andVideoDurationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("video_duration >=", value, "videoDuration");
            return (Criteria) this;
        }

        public Criteria andVideoDurationLessThan(BigDecimal value) {
            addCriterion("video_duration <", value, "videoDuration");
            return (Criteria) this;
        }

        public Criteria andVideoDurationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("video_duration <=", value, "videoDuration");
            return (Criteria) this;
        }

        public Criteria andVideoDurationIn(List<BigDecimal> values) {
            addCriterion("video_duration in", values, "videoDuration");
            return (Criteria) this;
        }

        public Criteria andVideoDurationNotIn(List<BigDecimal> values) {
            addCriterion("video_duration not in", values, "videoDuration");
            return (Criteria) this;
        }

        public Criteria andVideoDurationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("video_duration between", value1, value2, "videoDuration");
            return (Criteria) this;
        }

        public Criteria andVideoDurationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("video_duration not between", value1, value2, "videoDuration");
            return (Criteria) this;
        }

        public Criteria andVideoSizeIsNull() {
            addCriterion("video_size is null");
            return (Criteria) this;
        }

        public Criteria andVideoSizeIsNotNull() {
            addCriterion("video_size is not null");
            return (Criteria) this;
        }

        public Criteria andVideoSizeEqualTo(BigDecimal value) {
            addCriterion("video_size =", value, "videoSize");
            return (Criteria) this;
        }

        public Criteria andVideoSizeNotEqualTo(BigDecimal value) {
            addCriterion("video_size <>", value, "videoSize");
            return (Criteria) this;
        }

        public Criteria andVideoSizeGreaterThan(BigDecimal value) {
            addCriterion("video_size >", value, "videoSize");
            return (Criteria) this;
        }

        public Criteria andVideoSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("video_size >=", value, "videoSize");
            return (Criteria) this;
        }

        public Criteria andVideoSizeLessThan(BigDecimal value) {
            addCriterion("video_size <", value, "videoSize");
            return (Criteria) this;
        }

        public Criteria andVideoSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("video_size <=", value, "videoSize");
            return (Criteria) this;
        }

        public Criteria andVideoSizeIn(List<BigDecimal> values) {
            addCriterion("video_size in", values, "videoSize");
            return (Criteria) this;
        }

        public Criteria andVideoSizeNotIn(List<BigDecimal> values) {
            addCriterion("video_size not in", values, "videoSize");
            return (Criteria) this;
        }

        public Criteria andVideoSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("video_size between", value1, value2, "videoSize");
            return (Criteria) this;
        }

        public Criteria andVideoSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("video_size not between", value1, value2, "videoSize");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andUpdatorIsNull() {
            addCriterion("updator is null");
            return (Criteria) this;
        }

        public Criteria andUpdatorIsNotNull() {
            addCriterion("updator is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatorEqualTo(String value) {
            addCriterion("updator =", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotEqualTo(String value) {
            addCriterion("updator <>", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorGreaterThan(String value) {
            addCriterion("updator >", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorGreaterThanOrEqualTo(String value) {
            addCriterion("updator >=", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLessThan(String value) {
            addCriterion("updator <", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLessThanOrEqualTo(String value) {
            addCriterion("updator <=", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLike(String value) {
            addCriterion("updator like", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotLike(String value) {
            addCriterion("updator not like", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorIn(List<String> values) {
            addCriterion("updator in", values, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotIn(List<String> values) {
            addCriterion("updator not in", values, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorBetween(String value1, String value2) {
            addCriterion("updator between", value1, value2, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotBetween(String value1, String value2) {
            addCriterion("updator not between", value1, value2, "updator");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("is_deleted like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("is_deleted not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
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