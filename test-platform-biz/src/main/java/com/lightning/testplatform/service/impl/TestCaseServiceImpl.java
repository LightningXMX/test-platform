package com.lightning.testplatform.service.impl;

import com.google.common.collect.Lists;
import com.lightning.testplatform.dao.ITestCaseDAO;
import com.lightning.testplatform.dao.ITestGroupDAO;
import com.lightning.testplatform.domain.ResultDO;
import com.lightning.testplatform.domain.TestCaseDO;
import com.lightning.testplatform.domain.TestGroupDO;
import com.lightning.testplatform.domain.query.TestCaseQuery;
import com.lightning.testplatform.domain.query.TestGroupQuery;
import com.lightning.testplatform.service.ITestCaseService;
import com.lightning.testplatform.service.ITestGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mingxin on 16/8/23.
 */
@Component
public class TestCaseServiceImpl implements ITestCaseService {

    @Autowired
    ITestCaseDAO testCaseDAO;

    public ResultDO addTestCase(TestCaseDO testCaseDO) {
        ResultDO resultDO = new ResultDO();
        resultDO.setSuccess(true);
        try {
            long i = testCaseDAO.insert(testCaseDO);
            if(i==0){
                resultDO.setSuccess(false);
                resultDO.setErrorMsg("插入数据数量为0");
            }
        } catch (Exception e) {
            resultDO.setSuccess(false);
            resultDO.setErrorMsg("插入数据错误");
            e.printStackTrace();
        }


        return resultDO;
    }

    public ResultDO updateTestCase(TestCaseDO testCaseDO) {
        ResultDO resultDO = new ResultDO();
        resultDO.setSuccess(true);
        try {
            long i = testCaseDAO.update(testCaseDO);
            if(i==0){
                resultDO.setSuccess(false);
                resultDO.setErrorMsg("更新数据数量为0");
            }
        } catch (Exception e) {
            resultDO.setSuccess(false);
            resultDO.setErrorMsg("更新数据错误");
            e.printStackTrace();
        }


        return resultDO;
    }



    public ResultDO getTestCaseList( TestCaseQuery testCaseQuery) {
        ResultDO resultDO = new ResultDO();
        resultDO.setSuccess(true);
        try {
            List<TestCaseDO> testCaseDOList = testCaseDAO.select(testCaseQuery);
            if (testCaseDOList == null) {
                testCaseDOList = new ArrayList<TestCaseDO>();
            }
            long total = testCaseDAO.count(testCaseQuery);
            testCaseQuery.getPaginator().setTotalNum(total);
            resultDO.setModule(testCaseDOList);
        } catch (Exception e) {
            resultDO.setSuccess(false);
            resultDO.setErrorMsg("查询数据错误");
            e.printStackTrace();
        }
        return resultDO;
    }

    public ResultDO getTestCaseById(Long id){
        ResultDO resultDO = new ResultDO();
        resultDO.setSuccess(true);
        try {
            TestCaseDO testCaseDO = testCaseDAO.selectById(id);
            resultDO.setModule(testCaseDO);
        } catch (Exception e) {
            resultDO.setSuccess(false);
            resultDO.setErrorMsg("查询数据错误");
            e.printStackTrace();
        }
        return resultDO;
    }

}
