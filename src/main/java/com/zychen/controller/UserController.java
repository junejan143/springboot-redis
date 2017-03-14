package com.zychen.controller;

import com.zychen.domain.User;
import com.zychen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/user/create" , method = RequestMethod.POST)
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/user/{name}" , method = RequestMethod.GET)
    public Integer getUser(@PathVariable String name){
        return userService.getUser(name);
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
