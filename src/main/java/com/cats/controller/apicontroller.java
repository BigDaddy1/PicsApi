package com.cats.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class apicontroller {
    @RequestMapping(value ="/get", method = RequestMethod.GET)
    @ResponseBody
    public String getCol(ModelMap model)
    {
        return "itWorks";
    }

}
