package com.lightning.testplatform.dao.impl;

import com.lightning.testplatform.dao.ITestGroupDAO;
import com.lightning.testplatform.domain.TestGroupDO;
import com.lightning.testplatform.domain.query.TestGroupQuery;
import com.lightning.testplatform.mapper.TestGroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by mingxin on 16/8/23.
 */
@Component
public class TestGroupDAO implements ITestGroupDAO {

    @Autowired
    TestGroupMapper testGroupMapper;

    @Override
    public long insert(TestGroupDO testGroupDO) {
        long i = testGroupMapper.insert(testGroupDO);
        return i;
    }

    @Override
    public List<TestGroupDO> select(TestGroupQuery testGroupQuery) {

        List<TestGroupDO> testGroupDOList = testGroupMapper.select(testGroupQuery);

        return testGroupDOList;
    }

    public long count(TestGroupQuery testGroupQuery) {
        Long i = testGroupMapper.count(testGroupQuery);
        i = (i == null) ? 0 : i;
        return i;
    }


}
