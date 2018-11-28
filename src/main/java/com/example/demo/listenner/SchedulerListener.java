package com.example.demo.listenner;

import com.example.demo.quartz.MyScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
@Configuration
public class SchedulerListener implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private MyScheduler myScheduler;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

    }
}