package com.whutjxl.docker.demo.dockerdemo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Console;

@RestController
public class IndexController {

    private Logger logger= LogManager.getLogger(IndexController.class);

    @RequestMapping("/")
    String root(){
        return index();
    }

    @RequestMapping("/index")
    String index(){
        logger.info("index info");
        logger.warn("index warn");
        logger.error("index error");
        return "===index===";
    }

    @RequestMapping("/hello")
    String hello(){
        logger.info("hello world info");
        logger.warn("hello world warn");
        logger.error("hello world error");
        return "===hello world===";
    }
}
