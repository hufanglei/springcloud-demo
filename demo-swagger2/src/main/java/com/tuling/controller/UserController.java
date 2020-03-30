package com.tuling.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
@Api(value = "用户服务")
public class UserController {

    @ApiOperation(value = "用户列表服务",notes = "查詢所有用戶的列表信息")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<User> list() {
        List<User> userList = new ArrayList<>();
//        for(String key: DataNode.users.keySet()) {
//            userList.add(DataNode.users.get(key));
//        }
        return userList;
    }
}
