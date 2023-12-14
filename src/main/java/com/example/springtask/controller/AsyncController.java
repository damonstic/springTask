package com.example.springtask.controller;

import com.example.springtask.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    AsyncService asyncService;

    @RequestMapping("/async")
    public String async(){
        asyncService.hello();
        return "ok";
    }
}
