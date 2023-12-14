package com.example.springtask;

import jakarta.annotation.Resource;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;

import java.io.File;

@SpringBootTest
class SpringTaskApplicationTests {
    @Resource
    private JavaMailSender jsm;

    @Test //简单邮件
    void contextLoads() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("2509575042@qq.com");
        simpleMailMessage.setTo("tangding315@126.com");
        simpleMailMessage.setSubject("测试邮件标题");
        simpleMailMessage.setText("测试邮件内容");

        jsm.send(simpleMailMessage);
    }
    @Test //复杂邮件
    void contextLoads1() throws MessagingException {
        MimeMessage message = jsm.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setFrom("2509575042@qq.com");
        helper.setTo("tangding315@126.com");
        helper.setSubject("测试邮件标题");
        helper.setText("<b style='color:red'>今天 7:30来开会</b>",true);
        //发送附件
        helper.addAttachment("test.xls",new File("C://Users//damon//Desktop//test.xls"));

        jsm.send(message);
    }


}
