package com.lightning.testplatform.controller;

import com.lightning.testplatform.common.util.Paginator;
import com.lightning.testplatform.domain.ResultDO;
import com.lightning.testplatform.domain.TestGroupDO;
import com.lightning.testplatform.domain.query.TestGroupQuery;
import com.lightning.testplatform.service.ITestGroupService;
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
@RequestMapping(value = "/testGroup")
public class TestGroup {

    @Autowired
    ITestGroupService testGroupService;

    @RequestMapping(value = "/addTestGroup", method = RequestMethod.POST)
    public ModelAndView addTestGroup(@RequestParam("testGroupName") String testGroupName,
                                     @RequestParam("bizName") String bizName,
                                     @RequestParam("desInfo") String desInfo) {

        System.out.println(testGroupName + bizName + desInfo);

        // TODO: 16/8/22 保存测试分组
        TestGroupDO testGroupDO = new TestGroupDO(testGroupName, bizName, desInfo);
        ResultDO resultDO = testGroupService.addTestGroup(testGroupDO);

        ModelAndView mv = new ModelAndView();
        mv.setView(new RedirectView("/testGroup/testGroupList?pageNum=1", true));
        mv.addObject("resultDO", resultDO);
        return mv;

    }

    @RequestMapping(value = "/testGroupList", method = RequestMethod.GET)
    public ModelAndView getTestGroupList(HttpServletRequest request) {
        try {
            String pageNumString = request.getParameter("pageNum");

            int pageNum = (pageNumString == null) ? 1 : Integer.parseInt(pageNumString);
            Paginator paginator = new Paginator(pageNum);
            TestGroupQuery testGroupQuery = new TestGroupQuery();
            testGroupQuery.setPaginator(paginator);
            ResultDO resultDO = testGroupService.getTestGroupList(testGroupQuery);

            ModelAndView mv = new ModelAndView();
            mv.addObject("resultDO", resultDO);
            mv.addObject("paginator", paginator);
            return mv;
        } catch (Exception e) {
            ModelAndView mv = new ModelAndView();
            ResultDO resultDO = new ResultDO();
            resultDO.setSuccess(false);
            resultDO.setErrorMsg(e.getMessage());
            mv.addObject("resultDO", resultDO);
//            mv.addObject("paginator",paginator);
            return mv;
        }
    }
}
