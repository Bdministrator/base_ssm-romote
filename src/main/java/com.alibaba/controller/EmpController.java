package com.alibaba.controller;

import com.alibaba.model.Emp;
import com.alibaba.service.IEmpService;
import com.alibaba.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class EmpController {
    @Autowired
    private IEmpService empService;
    @Autowired
    private RedisUtil redisUtil;
    @RequestMapping("/select")
    public ModelAndView selectUser() throws Exception {
        ModelAndView mv = new ModelAndView();
        Emp emp = empService.selectEmp(7369);
        redisUtil.set(emp.getEmpno().toString(),emp);
        mv.addObject("emp", emp);
        mv.setViewName("emp");
        return mv;
        /*test test*/
    }
}
