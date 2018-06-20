package com.whutjxl.docker.demo.dockerdemo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Console;

@RestController
public class IndexController {

    private Logger logger = LogManager.getLogger(IndexController.class);
    private static int count = 0;

    @RequestMapping("/")
    String root() {
        return index();
    }

    @RequestMapping("/index")
    String index() {
        logger.info("index info");
        logger.warn("index warn");
        logger.error("index error");
        return "===index===";
    }

    @RequestMapping("/hello")
    String hello() throws Exception {
        if (count > 1000) {
            count = 0;
        }
        count++;
        logger.info("count = " + count);
        logger.warn("count = " + count);
        logger.error("count = " + count);
        if (count > 20 && (count / 10) % 2 == 0) {
            logger.error("create exception,count = "+count);
            throw new Exception("create exception");
        }
        return "=== count = " + count + " ===";
    }
}
