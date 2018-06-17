package com.whutjxl.docker.demo.dockerdemo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    private Logger logger= LogManager.getLogger(IndexController.class);

    @RequestMapping("/index")
    String index(){
        logger.info("log info");
        logger.warn("log warn");
        logger.error("log error");
        return "===index===";
    }

    @RequestMapping("/hello")
    String hello(){
        System.out.print("hello console");
        return "===hello world===";
    }
}
