package com.lightning.testplatform.dao.impl;

import com.lightning.testplatform.dao.ITestCaseDAO;
import com.lightning.testplatform.dao.ITestGroupDAO;
import com.lightning.testplatform.domain.TestCaseDO;
import com.lightning.testplatform.domain.TestGroupDO;
import com.lightning.testplatform.domain.query.TestCaseQuery;
import com.lightning.testplatform.domain.query.TestGroupQuery;
import com.lightning.testplatform.mapper.TestCaseMapper;
import com.lightning.testplatform.mapper.TestGroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by mingxin on 16/8/23.
 */
@Component
public class TestCaseDAO implements ITestCaseDAO {

    @Autowired
    TestCaseMapper testCaseMapper;

    @Override
    public long insert(TestCaseDO testCaseDO) {
        long i = testCaseMapper.insert(testCaseDO);
        return i;
    }

    @Override
    public long update(TestCaseDO testCaseDO) {
        long i = testCaseMapper.update(testCaseDO);
        return i;
    }

    @Override
    public List<TestCaseDO> select(TestCaseQuery testCaseQuery) {

        List<TestCaseDO> testCaseDOList = testCaseMapper.select(testCaseQuery);

        return testCaseDOList;
    }

    public TestCaseDO selectById(Long id) {
        TestCaseDO testCaseDO = testCaseMapper.selectById(id);
        return testCaseDO;
    }

    public long count(TestCaseQuery testCaseQuery) {
        Long i = testCaseMapper.count(testCaseQuery);
        i = (i == null) ? 0 : i;
        return i;
    }


}
