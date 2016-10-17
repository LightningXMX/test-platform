package com.lightning.testplatform.controller;

import com.lightning.testplatform.common.util.Paginator;
import com.lightning.testplatform.domain.ResultDO;
import com.lightning.testplatform.domain.TestCaseDO;
import com.lightning.testplatform.domain.TestGroupDO;
import com.lightning.testplatform.domain.query.TestCaseQuery;
import com.lightning.testplatform.domain.query.TestGroupQuery;
import com.lightning.testplatform.service.ITestCaseService;
import com.lightning.testplatform.service.ITestGroupService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by mingxin on 16/8/22.
 */
@Controller
@RequestMapping(value = "/testCase")
public class TestCase {


    @Autowired
    ITestCaseService testCaseService;

    @RequestMapping(value = "/addTestCase", method = RequestMethod.GET)
    public ModelAndView addTestCase(ModelAndView mv,HttpServletRequest request) {

        String testCaseId = request.getParameter("testCaseId");
        ResultDO resultDO = new ResultDO();
        try {
            if(StringUtils.isNotBlank(testCaseId)){
                resultDO = testCaseService.getTestCaseById(Long.parseLong(testCaseId));
                mv.addObject("resultDO", resultDO);
            }
        } catch (Exception e) {
            resultDO.setSuccess(false);
            resultDO.setErrorMsg("查询数据错误");
            mv.addObject(resultDO);
            e.printStackTrace();
        }
//        TestGroupDO testGroupDO = new TestGroupDO(testGroupName, bizName, desInfo);
//        ResultDO resultDO = testCaseService.addTestCase(testGroupDO);

//        ModelAndView mv = new ModelAndView();
//        mv.setView(new RedirectView("/testGroup/testGroupList?pageNum=1", true));
        String testGroupId = request.getParameter("testGroupId");
        mv.addObject("testGroupId", testGroupId);

        return mv;

    }

    @RequestMapping(value = "/testCaseList", method = RequestMethod.GET)
    public ModelAndView getTestCaseList(ModelAndView mv,HttpServletRequest request) {
        try {
            String testGroupIdString = request.getParameter("testGroupId");

            String pageNumString = request.getParameter("pageNum");

            int pageNum = (pageNumString == null) ? 1 : Integer.parseInt(pageNumString);
            Paginator paginator = new Paginator(pageNum);
            TestCaseQuery testCaseQuery = new TestCaseQuery();
            testCaseQuery.setTestGroupId(Long.parseLong(testGroupIdString));
            testCaseQuery.setPaginator(paginator);
            ResultDO resultDO = testCaseService.getTestCaseList(testCaseQuery);

//            ModelAndView mv = new ModelAndView();
            mv.addObject("resultDO", resultDO);
            mv.addObject("paginator", paginator);
            mv.addObject("testGroupId",testGroupIdString);
            return mv;
        } catch (Exception e) {
//            ModelAndView mv = new ModelAndView();
            ResultDO resultDO = new ResultDO();
            resultDO.setSuccess(false);
            resultDO.setErrorMsg(e.toString());
            mv.addObject("resultDO", resultDO);
//            mv.addObject("paginator",paginator);
            return mv;
        }
    }



    @RequestMapping(value = "/saveTestCase", method = RequestMethod.POST)
    public ModelAndView saveTestCase(ModelAndView mv,HttpServletRequest request) {
        String testCaseId = request.getParameter("testCaseId");
        String testGroupId = request.getParameter("testGroupId");
        try {

            String testCaseName = request.getParameter("testCaseName");
            String testCaseDesc = request.getParameter("testCaseDesc");
            String host = request.getParameter("host");
            String port = request.getParameter("port");
            String path = request.getParameter("path");
            String parameters = request.getParameter("parameters");

            TestCaseDO testCaseDO = new TestCaseDO();
            testCaseDO.setTestGroupId(Long.parseLong(testGroupId));
            testCaseDO.setTestCaseName(testCaseName);
            testCaseDO.setDescInfo(testCaseDesc);
            testCaseDO.setHost(host);
            testCaseDO.setPort(port);
            testCaseDO.setPath(path);
            testCaseDO.setParameters(parameters);

            ResultDO resultDO = null;
            if (StringUtils.isNotBlank(testCaseId)){
                testCaseDO.setId(Long.parseLong(testCaseId));
                resultDO = testCaseService.updateTestCase(testCaseDO);
            }else {
                resultDO = testCaseService.addTestCase(testCaseDO);

            }
            if (!resultDO.isSuccess()){
                ModelAndView failmv = new ModelAndView("/testCase/addTestCase");
                failmv.addObject("testGroupId",testGroupId);
                failmv.addObject("resultDO", resultDO);
                return failmv;
            }


//            ModelAndView mv = new ModelAndView();
            mv.setView(new RedirectView("/testCase/testCaseList?testGroupId="+testGroupId+"&pageNum=1", true));

//            mv.addObject("resultDO", resultDO);
//            mv.addObject("paginator", paginator);
            return mv;
        } catch (Exception e) {
//            ModelAndView mv = new ModelAndView();
            ModelAndView failmv = new ModelAndView("/testCase/addTestCase");
            failmv.addObject("testGroupId",testGroupId);

            ResultDO resultDO = new ResultDO();
            resultDO.setSuccess(false);
            resultDO.setErrorMsg(e.getMessage());
            failmv.addObject("resultDO", resultDO);
//            mv.addObject("paginator",paginator);
            return mv;
        }
    }
}
