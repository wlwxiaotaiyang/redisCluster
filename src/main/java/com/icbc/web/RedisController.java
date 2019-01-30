package com.icbc.web;

import com.icbc.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping("/getInfo.html")
    @ResponseBody
    public String getInfo(String key){
        return redisService.getInfo(key);
    }

}
