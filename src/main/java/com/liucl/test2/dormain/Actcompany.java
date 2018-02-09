package com.liucl.test2.dormain;

import java.io.Serializable;
import java.util.Date;

public class Actcompany implements Serializable {
    /**
    *
    */
    private static final long serialVersionUID = 1L;
    
    /**/
    private Integer ID;
    
    /* 所属公司 */
    private Integer companyID;
    
    /* 所属模块 */
    private Integer moduleID;
    
    /* 表单名（入职、请假等） */
    private String billName;
    
    /* 表单表名 */
    private String billTable;
    
    /* 工作流ID */
    private String activitiID;
    
    /* 工作流主键 */
    private String activitiZJ;
    
    /* 节点总数 */
    private Integer konde;
    
    /**/
    private Date createTime;
    
    /**/
    private String des;
    
    /**/
    private Byte valid;
    
    /**/
    private Integer version;
    
    /* json */
    private String activitiJSON;
    
    public Integer getID() {
        return ID;
    }
    
    public void setID(Integer ID) {
        this.ID = ID;
    }
    
    public Integer getCompanyID() {
        return companyID;
    }
    
    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }
    
    public Integer getModuleID() {
        return moduleID;
    }
    
    public void setModuleID(Integer moduleID) {
        this.moduleID = moduleID;
    }
    
    public String getBillName() {
        return billName;
    }
    
    public void setBillName(String billName) {
        this.billName = billName == null ? null : billName.trim();
    }
    
    public String getBillTable() {
        return billTable;
    }
    
    public void setBillTable(String billTable) {
        this.billTable = billTable == null ? null : billTable.trim();
    }
    
    public String getActivitiID() {
        return activitiID;
    }
    
    public void setActivitiID(String activitiID) {
        this.activitiID = activitiID == null ? null : activitiID.trim();
    }
    
    public String getActivitiZJ() {
        return activitiZJ;
    }
    
    public void setActivitiZJ(String activitiZJ) {
        this.activitiZJ = activitiZJ == null ? null : activitiZJ.trim();
    }
    
    public Integer getKonde() {
        return konde;
    }
    
    public void setKonde(Integer konde) {
        this.konde = konde;
    }
    
    public Date getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public String getDes() {
        return des;
    }
    
    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }
    
    public Byte getValid() {
        return valid;
    }
    
    public void setValid(Byte valid) {
        this.valid = valid;
    }
    
    public Integer getVersion() {
        return version;
    }
    
    public void setVersion(Integer version) {
        this.version = version;
    }
    
    public String getActivitiJSON() {
        return activitiJSON;
    }
    
    public void setActivitiJSON(String activitiJSON) {
        this.activitiJSON = activitiJSON == null ? null : activitiJSON.trim();
    }
}