package com.chat.controller;

import com.chat.service.ChatService;
import com.chat.service.UserService;
import com.chat.vo.ChatVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin("*")
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/register")
    public int registerUser(@RequestBody ChatVO chatVO){
        int a = userService.registerUser(chatVO);

        return a;
    }


}
