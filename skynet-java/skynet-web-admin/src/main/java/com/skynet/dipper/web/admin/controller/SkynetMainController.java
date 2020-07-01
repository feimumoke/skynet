package com.skynet.dipper.web.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SkynetMainController {

    @RequestMapping(value = {"", "main"}, method = RequestMethod.GET)
    public String main() {
        return "main";
    }

    @RequestMapping(value = {"index","login"}, method = RequestMethod.GET)
    public String index() {
        return "login";
    }


}
