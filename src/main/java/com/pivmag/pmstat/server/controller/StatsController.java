package com.pivmag.pmstat.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/stats")
public class StatsController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getStats(){
        return "stats";
    }
}
