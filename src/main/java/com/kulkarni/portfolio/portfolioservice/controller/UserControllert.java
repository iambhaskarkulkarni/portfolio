package com.kulkarni.portfolio.portfolioservice.controller;

import java.io.IOException;

import javax.mail.MessagingException;

import com.kulkarni.portfolio.portfolioservice.model.MailModel;
import com.kulkarni.portfolio.portfolioservice.model.ResponseDTO;
import com.kulkarni.portfolio.portfolioservice.model.User;
import com.kulkarni.portfolio.portfolioservice.service.SendingEmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import freemarker.template.TemplateException;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserControllert {

    @Autowired
    private SendingEmailService sendingEmailService;

    @PostMapping("/sendmail")
    public ResponseDTO acknowldgeUser(@RequestBody User user) throws MessagingException, IOException, TemplateException {
        MailModel mailModel = new MailModel();
        mailModel.setFrom("KulkarniSoftech@gmail.com");
        mailModel.setTo(user.getEmail());
        mailModel.setSubject("Kulkarni Softech Pvt Ltd.");
        mailModel.setName(user.getName());
        mailModel.setContent("We look forward to chatting soon!");
        sendingEmailService.sendEmail(mailModel);
        System.out.println(user);
     //   emailService.sendMail(user.getEmail(),"Portal Enquire","HI please reach to portal again");
        return new ResponseDTO("Request Received Succesfully");
    }
}
