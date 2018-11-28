package com.example.demo.rest;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @ApiOperation(value = "name",notes="问候")
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable(value = "name") String name){
        System.out.println("hello, " + name);
        return "hello," + name;
    }
    @ApiOperation(value = "boot",notes = "")
    @GetMapping("/test")
    public String helloBoot(){
        return "hello, boot";
    }
}