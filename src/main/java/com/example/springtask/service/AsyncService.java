package com.example.springtask.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service //异步任务
public class AsyncService {
    @Async
    public void hello(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("数据正在传输...");
    }

}
