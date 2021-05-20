package com.nopr.springbootdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
public class DemoController {

    @RequestMapping("/demo")
    @ResponseBody
    public String index(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        return "hello demo";
    }

}
