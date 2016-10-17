package com.lightning.testplatform.mapper;

import com.lightning.testplatform.domain.TestGroupDO;
import com.lightning.testplatform.domain.query.TestGroupQuery;

import java.util.List;

/**
 * Created by mingxin on 16/8/23.
 */
public interface TestGroupMapper {

    long insert(TestGroupDO testGroupDO);

    List<TestGroupDO> select(TestGroupQuery testGroupQuery);

    Long count(TestGroupQuery testGroupQuery);
}
