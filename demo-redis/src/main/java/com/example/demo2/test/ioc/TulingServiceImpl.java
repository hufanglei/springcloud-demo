package com.example.demo2.test.ioc;

import org.springframework.beans.factory.annotation.Autowired;

//这里是没有标注其他注解提供给spring包扫描的
public class TulingServiceImpl {

    @Autowired
    private TulingDao tulingDao;
//    public void testService() {
//        System.out.println("我是通过importSelector导入进来的service");
//    }

    public void testService() {
        tulingDao.testTulingDao();
        System.out.println("我是通过importSelector导入进来的service");
    }
}
