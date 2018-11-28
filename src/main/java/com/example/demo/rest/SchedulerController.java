package com.example.demo.rest;

import com.example.demo.quartz.MyScheduler;
import io.swagger.annotations.ApiOperation;
import org.quartz.SchedulerException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchedulerController {
    @ApiOperation(value = "modify")
    @GetMapping("/modify")
    public @ResponseBody String modify() throws SchedulerException {
        MyScheduler.modifyJob1("0/1 * * * * ?");
        return "1";
    }

    @RequestMapping("/status")
    public @ResponseBody String status() throws SchedulerException {
        return MyScheduler.getJob2Status();
    }

    @RequestMapping("/pause")
    public @ResponseBody String pause() throws SchedulerException {
        MyScheduler.pauseJob2();
        return "1";
    }

    @RequestMapping("/resume")
    public @ResponseBody String resume() throws SchedulerException {
        MyScheduler.resumeJob2();
        return "1";
    }
}