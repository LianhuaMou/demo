package com.example.demo.Service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    /*public User getLoginUser(String uName,String pwd, String msg);*/
    public List<User> getAllUser();
}
