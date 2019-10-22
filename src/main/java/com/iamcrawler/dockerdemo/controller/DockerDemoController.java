package com.iamcrawler.dockerdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by liuliang
 * on 2019-10-10  10:34
 * 部署demo :
 * http://www.ityouknow.com/springboot/2018/03/19/spring-boot-docker.html
 */
@RestController
@RequestMapping("/docker")
public class DockerDemoController {

    @GetMapping("/hello")
    public ResponseEntity demo(){
        return ResponseEntity.ok("hello docker");
    }

    public ResponseEntity mysqlDemo(){
        
        return null;
    }

}
