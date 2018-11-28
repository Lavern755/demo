package com.example.demo.rest;

import com.example.demo.model.TUser;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.IUserService;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @ApiOperation(value = "query",notes="查询用户信息")
    @GetMapping("/{id}")
    public TUser getUserById(@PathVariable Integer id){
        TUser user = userService.getUserById(id);
        return user;
    }
}