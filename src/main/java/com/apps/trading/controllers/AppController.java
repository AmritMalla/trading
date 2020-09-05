package com.apps.trading.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    private static final Logger logger = LogManager.getLogger(AppController.class);

    @RequestMapping("/")
    @ResponseBody
    @Transactional(readOnly = true)
    public String helloWorld() {
        logger.info("loading index page");
        return "Hello Index Page";
    }
}
