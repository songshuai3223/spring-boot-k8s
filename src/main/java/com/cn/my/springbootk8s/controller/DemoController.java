package com.cn.my.springbootk8s.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Date 2021/9/22 15:11
 * @Created by songshuai
 */
@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Value("${env}")
    private String env;
    @Value("${msg}")
    private String msg;
    @Value("${mysql.hostname}")
    private String mysl_url;
    @Value("${mysql.port}")
    private String mysql_port;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Map<String, Object> getDemoKey() {
        Map<String, Object> map = new HashMap<>();
        try {
            map.put("env", env);
            map.put("msg", msg);
            map.put("mysql_url", mysl_url);
            map.put("mysql_port", mysql_port);
            log.info("从配置文件中读取的信息为以下内容");
            log.info("env={}", env);
            log.info("msg={}", msg);
            log.info("mysql_url={}", mysl_url);
            log.info("mysql_port={}", mysql_port);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
