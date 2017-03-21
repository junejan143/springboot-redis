package com.zychen.controller;

import com.zychen.domain.CheckSignature;
import com.zychen.domain.User;
import com.zychen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeChatController {

    @Autowired
    private UserService userService;

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/article" , method = RequestMethod.POST)
    public void saveArticle(@RequestBody CheckSignature checkSignature){
        //if (checkSignature.getSignature() != null){
        //    return checkSignature.getEchostr();
        //}else {
        //    return
        //}
    }


}
