package com.example.springtask.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {
    @Scheduled(cron = "0 25 15 * * 0-7")
    public void hello(){
        System.out.println("hello.....");
    }
}
