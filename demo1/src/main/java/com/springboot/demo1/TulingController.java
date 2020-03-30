package com.springboot.demo1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TulingController {

    @RequestMapping("/tuling")
    public String tulingHelloWorld() {
        return "tuling,hello";
    }

}
