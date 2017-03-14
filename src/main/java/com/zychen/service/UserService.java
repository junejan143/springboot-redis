package com.zychen.service;

//import com.zychen.dao.mapper.user.IUserDao;
import com.zychen.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by wb-zyc241205 on 2017/3/14.
 *
 * @author wb-zyc241205
 * @date 2017/03/14
 */
@Service
public class UserService {

    //@Autowired
    //private IUserDao userDao;
    @Autowired
    private RedisTemplate<String, User> redisTemplate;


    public String addUser(User user) {
        //userDao.addUser(user);
        redisTemplate.opsForValue().set(user.getName(),user);
        return "新增成功";
    }

    public Integer getUser(String name) {

        if (exists(name)){
            return redisTemplate.opsForValue().get(name).getAge();
        }else {
            return -9999;
        }
    }

    public String deleteUser(String name) {
        if (exists(name)){
            redisTemplate.delete(name);
            return "删除成功";
        }else {
            return "无此用户";
        }
    }

    public String updateUser(User user) {
        if (exists(user.getName())){
            redisTemplate.opsForValue().set(user.getName(),user);
            return "修改成功";
        }else {
            return "无此用户";
        }
    }


    private boolean exists(final String key) {
        return redisTemplate.hasKey(key);
    }

}
