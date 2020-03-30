package com.example.demo2.test.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TulingController {
    //自动注入 tulingServiceImpl
    @Autowired
    private TulingServiceImpl tulingServiceImpl;

    @RequestMapping("testTuling")
    public String testTuling() {
        tulingServiceImpl.testService();
        return "tulingOk";
    }
}