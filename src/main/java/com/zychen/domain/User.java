package com.zychen.domain;

import java.io.Serializable;

/**
 * Created by wb-zyc241205 on 2017/3/14.
 *
 * @author wb-zyc241205
 * @date 2017/03/14
 */
public class User implements Serializable {

    private static final long serialVersionUID = -1L;
    private String name;
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    // 省略getter和setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}