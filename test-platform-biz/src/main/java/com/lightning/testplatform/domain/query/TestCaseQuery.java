package com.lightning.testplatform.domain.query;

import com.lightning.testplatform.common.util.BaseQuery;

/**
 * Created by mingxin on 16/8/25.
 */
public class TestCaseQuery extends BaseQuery {
    private Long testGroupId;
    private Long id;
    private String testCaseName;
    private String host;
    private String port;
    private String path;

    public Long getTestGroupId() {
        return testGroupId;
    }

    public void setTestGroupId(Long testGroupId) {
        this.testGroupId = testGroupId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTestCaseName() {
        return testCaseName;
    }

    public void setTestCaseName(String testCaseName) {
        this.testCaseName = testCaseName;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
