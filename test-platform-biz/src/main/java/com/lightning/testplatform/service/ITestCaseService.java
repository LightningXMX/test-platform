package com.lightning.testplatform.service;

import com.lightning.testplatform.domain.ResultDO;
import com.lightning.testplatform.domain.TestCaseDO;
import com.lightning.testplatform.domain.TestGroupDO;
import com.lightning.testplatform.domain.query.TestCaseQuery;
import com.lightning.testplatform.domain.query.TestGroupQuery;

/**
 * Created by mingxin on 16/8/23.
 */
public interface ITestCaseService {

    public ResultDO addTestCase(TestCaseDO testCaseDO);

    public ResultDO updateTestCase(TestCaseDO testCaseDO);

    public ResultDO getTestCaseList(TestCaseQuery testCaseQuery);

    public ResultDO getTestCaseById(Long id);
}
