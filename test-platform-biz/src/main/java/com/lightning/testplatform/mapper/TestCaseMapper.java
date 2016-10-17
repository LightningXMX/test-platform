package com.lightning.testplatform.mapper;

import com.lightning.testplatform.domain.TestCaseDO;
import com.lightning.testplatform.domain.TestGroupDO;
import com.lightning.testplatform.domain.query.TestCaseQuery;
import com.lightning.testplatform.domain.query.TestGroupQuery;

import java.util.List;

/**
 * Created by mingxin on 16/8/23.
 */
public interface TestCaseMapper {

    long insert(TestCaseDO testCaseDO);

    long update(TestCaseDO testCaseDO);

    List<TestCaseDO> select(TestCaseQuery testCaseQuery);

    TestCaseDO selectById(Long id);

    Long count(TestCaseQuery testCaseQuery);
}
