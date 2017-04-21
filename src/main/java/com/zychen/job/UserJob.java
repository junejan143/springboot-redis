package com.zychen.job;

import com.zychen.domain.User;
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
public class UserJob implements Job {
    @Autowired
    private UserService userService;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        //User user = new User();
        //user.setAge(10);
        //user.setName("wo");
        userService.getUser("zhangsan");
    }
}
