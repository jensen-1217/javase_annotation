package com.jensen.demo5.dao;

import com.jensen.demo5.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public List<User> findAllUser(){
        List<User> users=new ArrayList<>();
        users.add(new User(1,"熊大",23));
        users.add(new User(2,"熊二",23));

        return users;
    }
}
