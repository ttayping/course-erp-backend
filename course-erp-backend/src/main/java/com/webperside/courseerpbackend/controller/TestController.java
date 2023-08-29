package com.webperside.courseerpbackend.controller;

import com.webperside.courseerpbackend.model.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/test")
public class TestController {

    @GetMapping("test")
    public BaseResponse<String> test(){
        return BaseResponse.success("Course ERP");
    }
}
