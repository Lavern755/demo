package com.example.demo.quartz;

import jdk.nashorn.internal.scripts.JO;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyScheduler {
    private SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();

    static Scheduler scheduler;
    public void schedulerJobs() throws SchedulerException {
        scheduler = schedulerFactoryBean.getScheduler();
        startJob1(); // 每5分钟执行一次
        startJob2();// 每2分钟执行一次
    }

    private static void startJob2() throws SchedulerException {
        JobDetail jobDetail = JobBuilder.newJob(ScheduledJob2.class).withIdentity("job2","group2").build();
        CronScheduleBuilder schedulerBuilder = CronScheduleBuilder.cronSchedule("0/2 * * * * ？");
        CronTrigger conTrigger = TriggerBuilder.newTrigger().withIdentity("trigger2","group1").withSchedule(schedulerBuilder).build();
        scheduler.scheduleJob(jobDetail,conTrigger);
    }

    public static  void modifyJob1(String cron) throws SchedulerException {
        TriggerKey triggerKey =  TriggerKey.triggerKey("trigger1","group1");
        CronScheduleBuilder schedulerBuilder = CronScheduleBuilder.cronSchedule(cron);
        CronTrigger conTrigger = TriggerBuilder.newTrigger().withIdentity("trigger1","group1").withSchedule(schedulerBuilder).build();
        scheduler.rescheduleJob(triggerKey,conTrigger);
    }

    public static void modifyJob2(String cron) throws SchedulerException {
        TriggerKey triggerKey = TriggerKey.triggerKey("trigger2","group1");
        CronScheduleBuilder cronScheduler = CronScheduleBuilder.cronSchedule(cron);
        CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity("trigger2","group1").withSchedule(cronScheduler).build();
        scheduler.rescheduleJob(triggerKey,cronTrigger);
    }

    public static String getJob2Status() throws SchedulerException {
        TriggerKey triggerKey = TriggerKey.triggerKey("trigger2","group1");
        return scheduler.getTriggerState(triggerKey).name();
    }

    public static void pauseJob2() throws SchedulerException {
        scheduler.pauseJob(JobKey.jobKey("job2","group1"));
    }

    public static void resumeJob2() throws SchedulerException {
        scheduler.resumeJob(JobKey.jobKey("job2","group1"));
    }

    private static void startJob1() throws SchedulerException {
        JobDetail jobDetail = JobBuilder.newJob(ScheduledJob.class).withIdentity("job1","group1").build();
        CronScheduleBuilder schedulerBuilder = CronScheduleBuilder.cronSchedule("0/5 * * * *  ?");
        CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity("trigger1","group1").withSchedule(schedulerBuilder).build();
        scheduler.scheduleJob(jobDetail,cronTrigger);
    }


}