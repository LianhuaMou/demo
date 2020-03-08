package com.example.demo.Controller;

import com.example.demo.Service.UserService;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired//自动注入
    private UserService userService;
    @RequestMapping("/getAllUser")//设置请求
    @ResponseBody//json返回
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
