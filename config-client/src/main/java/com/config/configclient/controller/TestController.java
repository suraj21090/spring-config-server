package com.config.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${server.url:Unable to connect to config server}")
    private String url;

    @RequestMapping("/server/url")
    String getMsg() {
        return this.url;
    }
}
