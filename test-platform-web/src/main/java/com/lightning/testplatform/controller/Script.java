package com.lightning.testplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by mingxin on 16/9/13.
 */
@Controller
@RequestMapping(value = "/script")
public class Script {

    @RequestMapping(value = "/createScript", method = RequestMethod.GET)
    public ModelAndView createScript(HttpServletRequest request) {



        ModelAndView mv = new ModelAndView();
        return mv;

    }
}
