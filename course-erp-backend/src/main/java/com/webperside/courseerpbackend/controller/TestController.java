package com.webperside.courseerpbackend.controller;

import com.webperside.courseerpbackend.models.base.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/test")
public class TestController {

    @GetMapping("test")
    public BaseResponse<String> test(){
        return BaseResponse.success("Course ERP");
    }
}
