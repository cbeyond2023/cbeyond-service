package com.cbeyond.cbeyondservice.service;

import com.cbeyond.cbeyondservice.common.ApiResponseModel;
import com.cbeyond.cbeyondservice.entity.User;
import com.cbeyond.cbeyondservice.repository.UserRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

import static com.cbeyond.cbeyondservice.common.ApiResponseBuilder.buildApiResponse;

@Service
public class UserRegisterService {

    @Autowired
    private UserRegisterRepository userRegisterRepository;

    public ApiResponseModel registerUser(User user){
        encryptUserPassword(user);
        userRegisterRepository.save(user);
        return buildApiResponse(HttpStatus.CREATED.value(), "User Registered successfully.");

    }

    private static void encryptUserPassword(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
    }
}
