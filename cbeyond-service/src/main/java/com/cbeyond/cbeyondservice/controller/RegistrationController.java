package com.cbeyond.cbeyondservice.controller;


import com.cbeyond.cbeyondservice.common.ApiResponseModel;
import com.cbeyond.cbeyondservice.entity.User;
import com.cbeyond.cbeyondservice.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegistrationController {


    @Autowired
    private UserRegisterService userRegisterService;

    @PostMapping("/user-registration")
    public ApiResponseModel addUser(@RequestBody User user){
        return userRegisterService.registerUser(user);
    }


}
