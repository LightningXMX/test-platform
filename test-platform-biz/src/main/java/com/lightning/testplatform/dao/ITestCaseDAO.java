package com.lightning.testplatform.dao;

import com.lightning.testplatform.domain.TestCaseDO;
import com.lightning.testplatform.domain.TestGroupDO;
import com.lightning.testplatform.domain.query.TestCaseQuery;
import com.lightning.testplatform.domain.query.TestGroupQuery;

import java.util.List;

/**
 * Created by mingxin on 16/8/23.
 */
public interface ITestCaseDAO {

    public long insert(TestCaseDO testCaseDO);

    public long update(TestCaseDO testCaseDO);

    public List<TestCaseDO> select(TestCaseQuery testCaseQuery);

    public TestCaseDO selectById(Long id);

    public long count(TestCaseQuery testCaseQuery);
}
