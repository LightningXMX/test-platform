package com.lightning.testplatform.service.impl;

import com.lightning.testplatform.dao.ITestGroupDAO;
import com.lightning.testplatform.domain.ResultDO;
import com.lightning.testplatform.domain.TestGroupDO;
import com.lightning.testplatform.domain.query.TestGroupQuery;
import com.lightning.testplatform.service.ITestGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mingxin on 16/8/23.
 */
@Component
public class TestGroupServiceImpl implements ITestGroupService{

    @Autowired
    ITestGroupDAO testGroupDAO;

    public ResultDO addTestGroup(TestGroupDO testGroupDO) {
        ResultDO resultDO = new ResultDO();
        resultDO.setSuccess(true);
        try {
            long i = testGroupDAO.insert(testGroupDO);
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


    public ResultDO getTestGroupList( TestGroupQuery testGroupQuery) {
        ResultDO resultDO = new ResultDO();
        resultDO.setSuccess(true);
        try {
            List<TestGroupDO> testGroupDOList = testGroupDAO.select(testGroupQuery);
            if (testGroupDOList == null) {
                testGroupDOList = new ArrayList<TestGroupDO>();
            }
            long total = testGroupDAO.count(testGroupQuery);
            testGroupQuery.getPaginator().setTotalNum(total);
            resultDO.setModule(testGroupDOList);
        } catch (Exception e) {
            resultDO.setSuccess(false);
            resultDO.setErrorMsg("查询数据错误");
            e.printStackTrace();
        }
        return resultDO;
    }

}
