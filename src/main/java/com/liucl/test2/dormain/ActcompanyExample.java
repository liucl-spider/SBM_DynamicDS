package com.liucl.test2.dormain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActcompanyExample {
    protected String orderByClause;
    
    protected boolean distinct;
    
    protected List<Criteria> oredCriteria;
    
    protected String limitClause;
    
    public ActcompanyExample() {
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
    
    public void setLimitClause(String limitClause) {
        this.limitClause = limitClause;
    }
    
    public String getLimitClause() {
        return limitClause;
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
        
        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria)this;
        }
        
        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria)this;
        }
        
        public Criteria andIDEqualTo(Integer value) {
            addCriterion("ID =", value, "ID");
            return (Criteria)this;
        }
        
        public Criteria andIDNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria)this;
        }
        
        public Criteria andIDGreaterThan(Integer value) {
            addCriterion("ID >", value, "ID");
            return (Criteria)this;
        }
        
        public Criteria andIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria)this;
        }
        
        public Criteria andIDLessThan(Integer value) {
            addCriterion("ID <", value, "ID");
            return (Criteria)this;
        }
        
        public Criteria andIDLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria)this;
        }
        
        public Criteria andIDIn(List<Integer> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria)this;
        }
        
        public Criteria andIDNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria)this;
        }
        
        public Criteria andIDBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria)this;
        }
        
        public Criteria andIDNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria)this;
        }
        
        public Criteria andCompanyIDIsNull() {
            addCriterion("companyID is null");
            return (Criteria)this;
        }
        
        public Criteria andCompanyIDIsNotNull() {
            addCriterion("companyID is not null");
            return (Criteria)this;
        }
        
        public Criteria andCompanyIDEqualTo(Integer value) {
            addCriterion("companyID =", value, "companyID");
            return (Criteria)this;
        }
        
        public Criteria andCompanyIDNotEqualTo(Integer value) {
            addCriterion("companyID <>", value, "companyID");
            return (Criteria)this;
        }
        
        public Criteria andCompanyIDGreaterThan(Integer value) {
            addCriterion("companyID >", value, "companyID");
            return (Criteria)this;
        }
        
        public Criteria andCompanyIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("companyID >=", value, "companyID");
            return (Criteria)this;
        }
        
        public Criteria andCompanyIDLessThan(Integer value) {
            addCriterion("companyID <", value, "companyID");
            return (Criteria)this;
        }
        
        public Criteria andCompanyIDLessThanOrEqualTo(Integer value) {
            addCriterion("companyID <=", value, "companyID");
            return (Criteria)this;
        }
        
        public Criteria andCompanyIDIn(List<Integer> values) {
            addCriterion("companyID in", values, "companyID");
            return (Criteria)this;
        }
        
        public Criteria andCompanyIDNotIn(List<Integer> values) {
            addCriterion("companyID not in", values, "companyID");
            return (Criteria)this;
        }
        
        public Criteria andCompanyIDBetween(Integer value1, Integer value2) {
            addCriterion("companyID between", value1, value2, "companyID");
            return (Criteria)this;
        }
        
        public Criteria andCompanyIDNotBetween(Integer value1, Integer value2) {
            addCriterion("companyID not between", value1, value2, "companyID");
            return (Criteria)this;
        }
        
        public Criteria andModuleIDIsNull() {
            addCriterion("moduleID is null");
            return (Criteria)this;
        }
        
        public Criteria andModuleIDIsNotNull() {
            addCriterion("moduleID is not null");
            return (Criteria)this;
        }
        
        public Criteria andModuleIDEqualTo(Integer value) {
            addCriterion("moduleID =", value, "moduleID");
            return (Criteria)this;
        }
        
        public Criteria andModuleIDNotEqualTo(Integer value) {
            addCriterion("moduleID <>", value, "moduleID");
            return (Criteria)this;
        }
        
        public Criteria andModuleIDGreaterThan(Integer value) {
            addCriterion("moduleID >", value, "moduleID");
            return (Criteria)this;
        }
        
        public Criteria andModuleIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("moduleID >=", value, "moduleID");
            return (Criteria)this;
        }
        
        public Criteria andModuleIDLessThan(Integer value) {
            addCriterion("moduleID <", value, "moduleID");
            return (Criteria)this;
        }
        
        public Criteria andModuleIDLessThanOrEqualTo(Integer value) {
            addCriterion("moduleID <=", value, "moduleID");
            return (Criteria)this;
        }
        
        public Criteria andModuleIDIn(List<Integer> values) {
            addCriterion("moduleID in", values, "moduleID");
            return (Criteria)this;
        }
        
        public Criteria andModuleIDNotIn(List<Integer> values) {
            addCriterion("moduleID not in", values, "moduleID");
            return (Criteria)this;
        }
        
        public Criteria andModuleIDBetween(Integer value1, Integer value2) {
            addCriterion("moduleID between", value1, value2, "moduleID");
            return (Criteria)this;
        }
        
        public Criteria andModuleIDNotBetween(Integer value1, Integer value2) {
            addCriterion("moduleID not between", value1, value2, "moduleID");
            return (Criteria)this;
        }
        
        public Criteria andBillNameIsNull() {
            addCriterion("billName is null");
            return (Criteria)this;
        }
        
        public Criteria andBillNameIsNotNull() {
            addCriterion("billName is not null");
            return (Criteria)this;
        }
        
        public Criteria andBillNameEqualTo(String value) {
            addCriterion("billName =", value, "billName");
            return (Criteria)this;
        }
        
        public Criteria andBillNameNotEqualTo(String value) {
            addCriterion("billName <>", value, "billName");
            return (Criteria)this;
        }
        
        public Criteria andBillNameGreaterThan(String value) {
            addCriterion("billName >", value, "billName");
            return (Criteria)this;
        }
        
        public Criteria andBillNameGreaterThanOrEqualTo(String value) {
            addCriterion("billName >=", value, "billName");
            return (Criteria)this;
        }
        
        public Criteria andBillNameLessThan(String value) {
            addCriterion("billName <", value, "billName");
            return (Criteria)this;
        }
        
        public Criteria andBillNameLessThanOrEqualTo(String value) {
            addCriterion("billName <=", value, "billName");
            return (Criteria)this;
        }
        
        public Criteria andBillNameLike(String value) {
            addCriterion("billName like", value, "billName");
            return (Criteria)this;
        }
        
        public Criteria andBillNameNotLike(String value) {
            addCriterion("billName not like", value, "billName");
            return (Criteria)this;
        }
        
        public Criteria andBillNameIn(List<String> values) {
            addCriterion("billName in", values, "billName");
            return (Criteria)this;
        }
        
        public Criteria andBillNameNotIn(List<String> values) {
            addCriterion("billName not in", values, "billName");
            return (Criteria)this;
        }
        
        public Criteria andBillNameBetween(String value1, String value2) {
            addCriterion("billName between", value1, value2, "billName");
            return (Criteria)this;
        }
        
        public Criteria andBillNameNotBetween(String value1, String value2) {
            addCriterion("billName not between", value1, value2, "billName");
            return (Criteria)this;
        }
        
        public Criteria andBillTableIsNull() {
            addCriterion("billTable is null");
            return (Criteria)this;
        }
        
        public Criteria andBillTableIsNotNull() {
            addCriterion("billTable is not null");
            return (Criteria)this;
        }
        
        public Criteria andBillTableEqualTo(String value) {
            addCriterion("billTable =", value, "billTable");
            return (Criteria)this;
        }
        
        public Criteria andBillTableNotEqualTo(String value) {
            addCriterion("billTable <>", value, "billTable");
            return (Criteria)this;
        }
        
        public Criteria andBillTableGreaterThan(String value) {
            addCriterion("billTable >", value, "billTable");
            return (Criteria)this;
        }
        
        public Criteria andBillTableGreaterThanOrEqualTo(String value) {
            addCriterion("billTable >=", value, "billTable");
            return (Criteria)this;
        }
        
        public Criteria andBillTableLessThan(String value) {
            addCriterion("billTable <", value, "billTable");
            return (Criteria)this;
        }
        
        public Criteria andBillTableLessThanOrEqualTo(String value) {
            addCriterion("billTable <=", value, "billTable");
            return (Criteria)this;
        }
        
        public Criteria andBillTableLike(String value) {
            addCriterion("billTable like", value, "billTable");
            return (Criteria)this;
        }
        
        public Criteria andBillTableNotLike(String value) {
            addCriterion("billTable not like", value, "billTable");
            return (Criteria)this;
        }
        
        public Criteria andBillTableIn(List<String> values) {
            addCriterion("billTable in", values, "billTable");
            return (Criteria)this;
        }
        
        public Criteria andBillTableNotIn(List<String> values) {
            addCriterion("billTable not in", values, "billTable");
            return (Criteria)this;
        }
        
        public Criteria andBillTableBetween(String value1, String value2) {
            addCriterion("billTable between", value1, value2, "billTable");
            return (Criteria)this;
        }
        
        public Criteria andBillTableNotBetween(String value1, String value2) {
            addCriterion("billTable not between", value1, value2, "billTable");
            return (Criteria)this;
        }
        
        public Criteria andActivitiIDIsNull() {
            addCriterion("activitiID is null");
            return (Criteria)this;
        }
        
        public Criteria andActivitiIDIsNotNull() {
            addCriterion("activitiID is not null");
            return (Criteria)this;
        }
        
        public Criteria andActivitiIDEqualTo(String value) {
            addCriterion("activitiID =", value, "activitiID");
            return (Criteria)this;
        }
        
        public Criteria andActivitiIDNotEqualTo(String value) {
            addCriterion("activitiID <>", value, "activitiID");
            return (Criteria)this;
        }
        
        public Criteria andActivitiIDGreaterThan(String value) {
            addCriterion("activitiID >", value, "activitiID");
            return (Criteria)this;
        }
        
        public Criteria andActivitiIDGreaterThanOrEqualTo(String value) {
            addCriterion("activitiID >=", value, "activitiID");
            return (Criteria)this;
        }
        
        public Criteria andActivitiIDLessThan(String value) {
            addCriterion("activitiID <", value, "activitiID");
            return (Criteria)this;
        }
        
        public Criteria andActivitiIDLessThanOrEqualTo(String value) {
            addCriterion("activitiID <=", value, "activitiID");
            return (Criteria)this;
        }
        
        public Criteria andActivitiIDLike(String value) {
            addCriterion("activitiID like", value, "activitiID");
            return (Criteria)this;
        }
        
        public Criteria andActivitiIDNotLike(String value) {
            addCriterion("activitiID not like", value, "activitiID");
            return (Criteria)this;
        }
        
        public Criteria andActivitiIDIn(List<String> values) {
            addCriterion("activitiID in", values, "activitiID");
            return (Criteria)this;
        }
        
        public Criteria andActivitiIDNotIn(List<String> values) {
            addCriterion("activitiID not in", values, "activitiID");
            return (Criteria)this;
        }
        
        public Criteria andActivitiIDBetween(String value1, String value2) {
            addCriterion("activitiID between", value1, value2, "activitiID");
            return (Criteria)this;
        }
        
        public Criteria andActivitiIDNotBetween(String value1, String value2) {
            addCriterion("activitiID not between", value1, value2, "activitiID");
            return (Criteria)this;
        }
        
        public Criteria andActivitiZJIsNull() {
            addCriterion("activitiZJ is null");
            return (Criteria)this;
        }
        
        public Criteria andActivitiZJIsNotNull() {
            addCriterion("activitiZJ is not null");
            return (Criteria)this;
        }
        
        public Criteria andActivitiZJEqualTo(String value) {
            addCriterion("activitiZJ =", value, "activitiZJ");
            return (Criteria)this;
        }
        
        public Criteria andActivitiZJNotEqualTo(String value) {
            addCriterion("activitiZJ <>", value, "activitiZJ");
            return (Criteria)this;
        }
        
        public Criteria andActivitiZJGreaterThan(String value) {
            addCriterion("activitiZJ >", value, "activitiZJ");
            return (Criteria)this;
        }
        
        public Criteria andActivitiZJGreaterThanOrEqualTo(String value) {
            addCriterion("activitiZJ >=", value, "activitiZJ");
            return (Criteria)this;
        }
        
        public Criteria andActivitiZJLessThan(String value) {
            addCriterion("activitiZJ <", value, "activitiZJ");
            return (Criteria)this;
        }
        
        public Criteria andActivitiZJLessThanOrEqualTo(String value) {
            addCriterion("activitiZJ <=", value, "activitiZJ");
            return (Criteria)this;
        }
        
        public Criteria andActivitiZJLike(String value) {
            addCriterion("activitiZJ like", value, "activitiZJ");
            return (Criteria)this;
        }
        
        public Criteria andActivitiZJNotLike(String value) {
            addCriterion("activitiZJ not like", value, "activitiZJ");
            return (Criteria)this;
        }
        
        public Criteria andActivitiZJIn(List<String> values) {
            addCriterion("activitiZJ in", values, "activitiZJ");
            return (Criteria)this;
        }
        
        public Criteria andActivitiZJNotIn(List<String> values) {
            addCriterion("activitiZJ not in", values, "activitiZJ");
            return (Criteria)this;
        }
        
        public Criteria andActivitiZJBetween(String value1, String value2) {
            addCriterion("activitiZJ between", value1, value2, "activitiZJ");
            return (Criteria)this;
        }
        
        public Criteria andActivitiZJNotBetween(String value1, String value2) {
            addCriterion("activitiZJ not between", value1, value2, "activitiZJ");
            return (Criteria)this;
        }
        
        public Criteria andKondeIsNull() {
            addCriterion("konde is null");
            return (Criteria)this;
        }
        
        public Criteria andKondeIsNotNull() {
            addCriterion("konde is not null");
            return (Criteria)this;
        }
        
        public Criteria andKondeEqualTo(Integer value) {
            addCriterion("konde =", value, "konde");
            return (Criteria)this;
        }
        
        public Criteria andKondeNotEqualTo(Integer value) {
            addCriterion("konde <>", value, "konde");
            return (Criteria)this;
        }
        
        public Criteria andKondeGreaterThan(Integer value) {
            addCriterion("konde >", value, "konde");
            return (Criteria)this;
        }
        
        public Criteria andKondeGreaterThanOrEqualTo(Integer value) {
            addCriterion("konde >=", value, "konde");
            return (Criteria)this;
        }
        
        public Criteria andKondeLessThan(Integer value) {
            addCriterion("konde <", value, "konde");
            return (Criteria)this;
        }
        
        public Criteria andKondeLessThanOrEqualTo(Integer value) {
            addCriterion("konde <=", value, "konde");
            return (Criteria)this;
        }
        
        public Criteria andKondeIn(List<Integer> values) {
            addCriterion("konde in", values, "konde");
            return (Criteria)this;
        }
        
        public Criteria andKondeNotIn(List<Integer> values) {
            addCriterion("konde not in", values, "konde");
            return (Criteria)this;
        }
        
        public Criteria andKondeBetween(Integer value1, Integer value2) {
            addCriterion("konde between", value1, value2, "konde");
            return (Criteria)this;
        }
        
        public Criteria andKondeNotBetween(Integer value1, Integer value2) {
            addCriterion("konde not between", value1, value2, "konde");
            return (Criteria)this;
        }
        
        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria)this;
        }
        
        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria)this;
        }
        
        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria)this;
        }
        
        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria)this;
        }
        
        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria)this;
        }
        
        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria)this;
        }
        
        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria)this;
        }
        
        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria)this;
        }
        
        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria)this;
        }
        
        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria)this;
        }
        
        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria)this;
        }
        
        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria)this;
        }
        
        public Criteria andDesIsNull() {
            addCriterion("des is null");
            return (Criteria)this;
        }
        
        public Criteria andDesIsNotNull() {
            addCriterion("des is not null");
            return (Criteria)this;
        }
        
        public Criteria andDesEqualTo(String value) {
            addCriterion("des =", value, "des");
            return (Criteria)this;
        }
        
        public Criteria andDesNotEqualTo(String value) {
            addCriterion("des <>", value, "des");
            return (Criteria)this;
        }
        
        public Criteria andDesGreaterThan(String value) {
            addCriterion("des >", value, "des");
            return (Criteria)this;
        }
        
        public Criteria andDesGreaterThanOrEqualTo(String value) {
            addCriterion("des >=", value, "des");
            return (Criteria)this;
        }
        
        public Criteria andDesLessThan(String value) {
            addCriterion("des <", value, "des");
            return (Criteria)this;
        }
        
        public Criteria andDesLessThanOrEqualTo(String value) {
            addCriterion("des <=", value, "des");
            return (Criteria)this;
        }
        
        public Criteria andDesLike(String value) {
            addCriterion("des like", value, "des");
            return (Criteria)this;
        }
        
        public Criteria andDesNotLike(String value) {
            addCriterion("des not like", value, "des");
            return (Criteria)this;
        }
        
        public Criteria andDesIn(List<String> values) {
            addCriterion("des in", values, "des");
            return (Criteria)this;
        }
        
        public Criteria andDesNotIn(List<String> values) {
            addCriterion("des not in", values, "des");
            return (Criteria)this;
        }
        
        public Criteria andDesBetween(String value1, String value2) {
            addCriterion("des between", value1, value2, "des");
            return (Criteria)this;
        }
        
        public Criteria andDesNotBetween(String value1, String value2) {
            addCriterion("des not between", value1, value2, "des");
            return (Criteria)this;
        }
        
        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria)this;
        }
        
        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria)this;
        }
        
        public Criteria andValidEqualTo(Byte value) {
            addCriterion("valid =", value, "valid");
            return (Criteria)this;
        }
        
        public Criteria andValidNotEqualTo(Byte value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria)this;
        }
        
        public Criteria andValidGreaterThan(Byte value) {
            addCriterion("valid >", value, "valid");
            return (Criteria)this;
        }
        
        public Criteria andValidGreaterThanOrEqualTo(Byte value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria)this;
        }
        
        public Criteria andValidLessThan(Byte value) {
            addCriterion("valid <", value, "valid");
            return (Criteria)this;
        }
        
        public Criteria andValidLessThanOrEqualTo(Byte value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria)this;
        }
        
        public Criteria andValidIn(List<Byte> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria)this;
        }
        
        public Criteria andValidNotIn(List<Byte> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria)this;
        }
        
        public Criteria andValidBetween(Byte value1, Byte value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria)this;
        }
        
        public Criteria andValidNotBetween(Byte value1, Byte value2) {
            addCriterion("valid not between", value1, value2, "valid");
            return (Criteria)this;
        }
        
        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria)this;
        }
        
        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria)this;
        }
        
        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria)this;
        }
        
        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria)this;
        }
        
        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria)this;
        }
        
        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria)this;
        }
        
        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria)this;
        }
        
        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria)this;
        }
        
        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria)this;
        }
        
        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria)this;
        }
        
        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria)this;
        }
        
        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria)this;
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