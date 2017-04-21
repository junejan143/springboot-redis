package com.zychen.controller;

import com.zychen.domain.User;
import com.zychen.job.UserJob;
import com.zychen.service.UserService;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private Scheduler scheduler;

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/user/create" , method = RequestMethod.POST)
    public void addUser(@RequestBody User user) throws Exception{
        JobDetail job = JobBuilder.newJob(UserJob.class).build();
        Trigger trigger = TriggerBuilder.newTrigger().build();
        scheduler.scheduleJob(job, trigger);
        //return userService.addUser(user);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/user" , method = RequestMethod.GET)
    public void getUser() throws Exception{
        JobDetail job = JobBuilder.newJob(UserJob.class).build();
        Trigger trigger = TriggerBuilder.newTrigger().build();
        scheduler.scheduleJob(job, trigger);
        //return userService.getUser(name);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/user/{name}" , method = RequestMethod.DELETE)
    public String  deleteUser(@PathVariable String name){
        return userService.deleteUser(name);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/user/{name}" , method = RequestMethod.PUT)
    public String  updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
}
