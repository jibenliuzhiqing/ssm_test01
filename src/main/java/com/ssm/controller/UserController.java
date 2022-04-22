package com.ssm.controller;

import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description TODO
 * @Author zhiqing-liu
 * @Date 2022/4/22 12:43
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getAll")
    public String getAll(Model model){
        List<User> all = userService.getAll();
        System.out.println(all.toString());
        model.addAttribute("list",all);
        return "list";
    }

}