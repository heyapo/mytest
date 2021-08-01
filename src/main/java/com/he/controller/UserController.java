package com.he.controller;

import com.he.pojo.User;
import com.he.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UsersService usersService;
     /* 添加用户 */
     @RequestMapping("/add.do")
     //@PostMapping
     public String addUser(@RequestBody User user){
         usersService.addUser(user);
         return "ok";
     }
     @RequestMapping("/selectAll.do")
    public List<User> selectAll(){
         return usersService.selectAll();
     }
}
