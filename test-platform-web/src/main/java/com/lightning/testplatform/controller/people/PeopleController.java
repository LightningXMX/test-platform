package com.lightning.testplatform.controller.people;

import com.lightning.testplatform.domain.People;
import com.lightning.testplatform.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by mingxin on 16/8/20.
 */
@Controller
public class PeopleController {

    @Autowired
    private PeopleMapper peopleMapper;

    @RequestMapping("people/helloPeople")
    public ModelAndView helloPeople(){
        People people = this.peopleMapper.selectById(1L);
        String hello = "hello,my name is " + people.getName() + ",I am " +people.getAge() +".";
        ModelAndView mv = new ModelAndView();
        mv.addObject("message",hello);

        return mv;
    }

    @RequestMapping("people/helloPeople2")
    public void helloPeople2(Map<String, Object> model){
        People people = this.peopleMapper.selectById(6L);
        String hello = "hello,my name is " + people.getName() + ",I am " +people.getAge() +".";


        model.put("message", hello);
    }

    @RequestMapping("people/helloPeople3")
    public void helloPeople2(Map<String, Object> model,@RequestParam("id") Long id){
        People people = this.peopleMapper.selectById(id);
        String hello = "hello,my name is " + people.getName() + ",I am " +people.getAge() +".";


        model.put("message", hello);
    }
}
