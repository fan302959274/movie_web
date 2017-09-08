package com.movie.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblUserExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdIsNull() {
            addCriterion("user_open_id is null");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdIsNotNull() {
            addCriterion("user_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdEqualTo(String value) {
            addCriterion("user_open_id =", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdNotEqualTo(String value) {
            addCriterion("user_open_id <>", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdGreaterThan(String value) {
            addCriterion("user_open_id >", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_open_id >=", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdLessThan(String value) {
            addCriterion("user_open_id <", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdLessThanOrEqualTo(String value) {
            addCriterion("user_open_id <=", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdLike(String value) {
            addCriterion("user_open_id like", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdNotLike(String value) {
            addCriterion("user_open_id not like", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdIn(List<String> values) {
            addCriterion("user_open_id in", values, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdNotIn(List<String> values) {
            addCriterion("user_open_id not in", values, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdBetween(String value1, String value2) {
            addCriterion("user_open_id between", value1, value2, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdNotBetween(String value1, String value2) {
            addCriterion("user_open_id not between", value1, value2, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserNickNameIsNull() {
            addCriterion("user_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNickNameIsNotNull() {
            addCriterion("user_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNickNameEqualTo(String value) {
            addCriterion("user_nick_name =", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotEqualTo(String value) {
            addCriterion("user_nick_name <>", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameGreaterThan(String value) {
            addCriterion("user_nick_name >", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_nick_name >=", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameLessThan(String value) {
            addCriterion("user_nick_name <", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameLessThanOrEqualTo(String value) {
            addCriterion("user_nick_name <=", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameLike(String value) {
            addCriterion("user_nick_name like", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotLike(String value) {
            addCriterion("user_nick_name not like", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameIn(List<String> values) {
            addCriterion("user_nick_name in", values, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotIn(List<String> values) {
            addCriterion("user_nick_name not in", values, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameBetween(String value1, String value2) {
            addCriterion("user_nick_name between", value1, value2, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotBetween(String value1, String value2) {
            addCriterion("user_nick_name not between", value1, value2, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNull() {
            addCriterion("user_gender is null");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNotNull() {
            addCriterion("user_gender is not null");
            return (Criteria) this;
        }

        public Criteria andUserGenderEqualTo(String value) {
            addCriterion("user_gender =", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotEqualTo(String value) {
            addCriterion("user_gender <>", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThan(String value) {
            addCriterion("user_gender >", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThanOrEqualTo(String value) {
            addCriterion("user_gender >=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThan(String value) {
            addCriterion("user_gender <", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThanOrEqualTo(String value) {
            addCriterion("user_gender <=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLike(String value) {
            addCriterion("user_gender like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotLike(String value) {
            addCriterion("user_gender not like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderIn(List<String> values) {
            addCriterion("user_gender in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotIn(List<String> values) {
            addCriterion("user_gender not in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderBetween(String value1, String value2) {
            addCriterion("user_gender between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotBetween(String value1, String value2) {
            addCriterion("user_gender not between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserCityIsNull() {
            addCriterion("user_city is null");
            return (Criteria) this;
        }

        public Criteria andUserCityIsNotNull() {
            addCriterion("user_city is not null");
            return (Criteria) this;
        }

        public Criteria andUserCityEqualTo(String value) {
            addCriterion("user_city =", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotEqualTo(String value) {
            addCriterion("user_city <>", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityGreaterThan(String value) {
            addCriterion("user_city >", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityGreaterThanOrEqualTo(String value) {
            addCriterion("user_city >=", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLessThan(String value) {
            addCriterion("user_city <", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLessThanOrEqualTo(String value) {
            addCriterion("user_city <=", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLike(String value) {
            addCriterion("user_city like", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotLike(String value) {
            addCriterion("user_city not like", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityIn(List<String> values) {
            addCriterion("user_city in", values, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotIn(List<String> values) {
            addCriterion("user_city not in", values, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityBetween(String value1, String value2) {
            addCriterion("user_city between", value1, value2, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotBetween(String value1, String value2) {
            addCriterion("user_city not between", value1, value2, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIsNull() {
            addCriterion("user_province is null");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIsNotNull() {
            addCriterion("user_province is not null");
            return (Criteria) this;
        }

        public Criteria andUserProvinceEqualTo(String value) {
            addCriterion("user_province =", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotEqualTo(String value) {
            addCriterion("user_province <>", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceGreaterThan(String value) {
            addCriterion("user_province >", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("user_province >=", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLessThan(String value) {
            addCriterion("user_province <", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLessThanOrEqualTo(String value) {
            addCriterion("user_province <=", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLike(String value) {
            addCriterion("user_province like", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotLike(String value) {
            addCriterion("user_province not like", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIn(List<String> values) {
            addCriterion("user_province in", values, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotIn(List<String> values) {
            addCriterion("user_province not in", values, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceBetween(String value1, String value2) {
            addCriterion("user_province between", value1, value2, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotBetween(String value1, String value2) {
            addCriterion("user_province not between", value1, value2, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserCountryIsNull() {
            addCriterion("user_country is null");
            return (Criteria) this;
        }

        public Criteria andUserCountryIsNotNull() {
            addCriterion("user_country is not null");
            return (Criteria) this;
        }

        public Criteria andUserCountryEqualTo(String value) {
            addCriterion("user_country =", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryNotEqualTo(String value) {
            addCriterion("user_country <>", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryGreaterThan(String value) {
            addCriterion("user_country >", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryGreaterThanOrEqualTo(String value) {
            addCriterion("user_country >=", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryLessThan(String value) {
            addCriterion("user_country <", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryLessThanOrEqualTo(String value) {
            addCriterion("user_country <=", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryLike(String value) {
            addCriterion("user_country like", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryNotLike(String value) {
            addCriterion("user_country not like", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryIn(List<String> values) {
            addCriterion("user_country in", values, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryNotIn(List<String> values) {
            addCriterion("user_country not in", values, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryBetween(String value1, String value2) {
            addCriterion("user_country between", value1, value2, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryNotBetween(String value1, String value2) {
            addCriterion("user_country not between", value1, value2, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlIsNull() {
            addCriterion("user_avatar_url is null");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlIsNotNull() {
            addCriterion("user_avatar_url is not null");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlEqualTo(String value) {
            addCriterion("user_avatar_url =", value, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlNotEqualTo(String value) {
            addCriterion("user_avatar_url <>", value, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlGreaterThan(String value) {
            addCriterion("user_avatar_url >", value, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlGreaterThanOrEqualTo(String value) {
            addCriterion("user_avatar_url >=", value, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlLessThan(String value) {
            addCriterion("user_avatar_url <", value, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlLessThanOrEqualTo(String value) {
            addCriterion("user_avatar_url <=", value, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlLike(String value) {
            addCriterion("user_avatar_url like", value, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlNotLike(String value) {
            addCriterion("user_avatar_url not like", value, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlIn(List<String> values) {
            addCriterion("user_avatar_url in", values, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlNotIn(List<String> values) {
            addCriterion("user_avatar_url not in", values, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlBetween(String value1, String value2) {
            addCriterion("user_avatar_url between", value1, value2, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserAvatarUrlNotBetween(String value1, String value2) {
            addCriterion("user_avatar_url not between", value1, value2, "userAvatarUrl");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdIsNull() {
            addCriterion("user_union_id is null");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdIsNotNull() {
            addCriterion("user_union_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdEqualTo(String value) {
            addCriterion("user_union_id =", value, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdNotEqualTo(String value) {
            addCriterion("user_union_id <>", value, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdGreaterThan(String value) {
            addCriterion("user_union_id >", value, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_union_id >=", value, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdLessThan(String value) {
            addCriterion("user_union_id <", value, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdLessThanOrEqualTo(String value) {
            addCriterion("user_union_id <=", value, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdLike(String value) {
            addCriterion("user_union_id like", value, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdNotLike(String value) {
            addCriterion("user_union_id not like", value, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdIn(List<String> values) {
            addCriterion("user_union_id in", values, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdNotIn(List<String> values) {
            addCriterion("user_union_id not in", values, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdBetween(String value1, String value2) {
            addCriterion("user_union_id between", value1, value2, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserUnionIdNotBetween(String value1, String value2) {
            addCriterion("user_union_id not between", value1, value2, "userUnionId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserWechatIsNull() {
            addCriterion("user_wechat is null");
            return (Criteria) this;
        }

        public Criteria andUserWechatIsNotNull() {
            addCriterion("user_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andUserWechatEqualTo(String value) {
            addCriterion("user_wechat =", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotEqualTo(String value) {
            addCriterion("user_wechat <>", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatGreaterThan(String value) {
            addCriterion("user_wechat >", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatGreaterThanOrEqualTo(String value) {
            addCriterion("user_wechat >=", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLessThan(String value) {
            addCriterion("user_wechat <", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLessThanOrEqualTo(String value) {
            addCriterion("user_wechat <=", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLike(String value) {
            addCriterion("user_wechat like", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotLike(String value) {
            addCriterion("user_wechat not like", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatIn(List<String> values) {
            addCriterion("user_wechat in", values, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotIn(List<String> values) {
            addCriterion("user_wechat not in", values, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatBetween(String value1, String value2) {
            addCriterion("user_wechat between", value1, value2, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotBetween(String value1, String value2) {
            addCriterion("user_wechat not between", value1, value2, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNull() {
            addCriterion("user_mobile is null");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNotNull() {
            addCriterion("user_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andUserMobileEqualTo(String value) {
            addCriterion("user_mobile =", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotEqualTo(String value) {
            addCriterion("user_mobile <>", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThan(String value) {
            addCriterion("user_mobile >", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("user_mobile >=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThan(String value) {
            addCriterion("user_mobile <", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThanOrEqualTo(String value) {
            addCriterion("user_mobile <=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLike(String value) {
            addCriterion("user_mobile like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotLike(String value) {
            addCriterion("user_mobile not like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileIn(List<String> values) {
            addCriterion("user_mobile in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotIn(List<String> values) {
            addCriterion("user_mobile not in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileBetween(String value1, String value2) {
            addCriterion("user_mobile between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotBetween(String value1, String value2) {
            addCriterion("user_mobile not between", value1, value2, "userMobile");
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