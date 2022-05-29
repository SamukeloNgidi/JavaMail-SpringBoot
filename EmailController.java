package com.demo.demo.Controller;

import com.demo.demo.Service.EmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailController {

    @Autowired
    private EmailSender emailSender;

    public String sendMailMessage(){
        emailSender.sendMail("testspring800@gmail.com",
                "You are successfully registered.",
                "Welcome to Spring boot!");
        return "Email sent Successfully...";
    }
}