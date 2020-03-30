package com.example.demorabbitmq.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private AmqpTemplate amqpTemplate;


    /**
     * 单条消息发送给单个队列，该队列只有一个消费者
     *
     * @return
     */
    @GetMapping(value = "send")
    public String send() {
        String content = "Date:" + System.currentTimeMillis();
        //发送默认交换机对应的的队列kinson
        amqpTemplate.convertAndSend("kinson", content);
        return content;
    }

    /**
     * 发送多条消息到一个队列，该队列有多个消费者
     *
     * @return
     */
    @GetMapping(value = "sendMore")
    public String sendMore() {
        List<String> result = new ArrayList<String>();
        //发送10条数据
        for (int i = 0; i < 10; i++) {
            String content = "第" + (i + 1) + "次发送 Date:" + System.currentTimeMillis();
            //发送默认交换机对应的的队列kinson,此时有两个消费者MyReceiver1和MyReceiver2,每条消息只会被消费一次
            amqpTemplate.convertAndSend("kinson", content);
            result.add(content);
        }
        return String.join("<br/>", result);
    }

}
