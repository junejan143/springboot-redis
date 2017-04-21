package com.zychen.job;

import com.zychen.service.UserService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author : wb-zyc241205
 * @time :  2017/4/20 20:19
 */
@Component
public class Jobs {
    @Autowired
    private UserService userService;

    @Scheduled(cron = "*/5 * * * * ?")
    public void fixedRateJob(){
        userService.getUser("zhangsan");
        System.out.println(" >>fixedRate执行....");
    }
}
