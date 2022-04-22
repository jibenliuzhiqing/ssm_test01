package com.ssm.dao;

import com.ssm.pojo.User;

import java.util.List;

/**
 * @Description TODO
 * @Author zhiqing-liu
 * @Date 2022/4/22 12:39
 */
public interface UserDao {
    List<User> getAll();

}