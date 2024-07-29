package com.jensen.demo5.service;

import com.jensen.demo5.dao.UserDao;
import com.jensen.demo5.pojo.User;

import java.util.List;

public class UserService {
    UserDao userDao = new UserDao();
    public List<User> queryAllUser() {

        List<User> userList = userDao.findAllUser();
        return userList;
    }

    public boolean addUser(User user) {
        return false;
    }

    public boolean deleteUser(int id) {

        return false;
    }
}
