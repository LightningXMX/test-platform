package com.lightning.testplatform.domain;

import java.util.Date;

/**
 * Created by mingxin on 16/8/23.
 */
public class TestGroupDO {

    private Long id;
    private String testGroupName;
    private String bizName;
    private String descInfo;
    private Date gmtCreate;
    private Date gmtModified;


    public TestGroupDO(){}

//    public TestGroupDO(Long id, String testGroupName, String bizName, String desInfo, Date gmtCreate, Date gmtModified) {
//        this.id = id;
//        this.testGroupName = testGroupName;
//        this.bizName = bizName;
//        this.desInfo = desInfo;
//        this.gmtCreate = gmtCreate;
//        this.gmtModified = gmtModified;
//    }

    public TestGroupDO(String testGroupName, String bizName, String desInfo) {
        this.testGroupName = testGroupName;
        this.bizName = bizName;
        this.descInfo = desInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTestGroupName() {
        return testGroupName;
    }

    public void setTestGroupName(String testGroupName) {
        this.testGroupName = testGroupName;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public String getDescInfo() {
        return descInfo;
    }

    public void setDescInfo(String desInfo) {
        this.descInfo = desInfo;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}
