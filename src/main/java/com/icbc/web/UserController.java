package com.icbc.web;


import com.icbc.pojo.User;
import com.icbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserList.html")
    @ResponseBody
    public List<User> getUserList(){
        return userService.getUserList();
    }

}
