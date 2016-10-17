package com.lightning.testplatform.dao;

import com.lightning.testplatform.domain.TestGroupDO;
import com.lightning.testplatform.domain.query.TestGroupQuery;
import org.apache.catalina.LifecycleState;

import java.util.List;

/**
 * Created by mingxin on 16/8/23.
 */
public interface ITestGroupDAO {

    public long insert(TestGroupDO testGroupDO);

    public List<TestGroupDO> select(TestGroupQuery testGroupQuery);

    public long count(TestGroupQuery testGroupQuery);
}
