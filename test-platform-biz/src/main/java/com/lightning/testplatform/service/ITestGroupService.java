package com.lightning.testplatform.service;

import com.lightning.testplatform.domain.ResultDO;
import com.lightning.testplatform.domain.TestGroupDO;
import com.lightning.testplatform.domain.query.TestGroupQuery;

/**
 * Created by mingxin on 16/8/23.
 */
public interface ITestGroupService {

    public ResultDO addTestGroup(TestGroupDO testGroupDO);

    public ResultDO getTestGroupList( TestGroupQuery testGroupQuery);
}
