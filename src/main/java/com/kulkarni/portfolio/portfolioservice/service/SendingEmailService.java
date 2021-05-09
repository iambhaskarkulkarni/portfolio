package com.kulkarni.portfolio.portfolioservice.service;

import java.io.IOException;

import javax.mail.MessagingException;

import com.kulkarni.portfolio.portfolioservice.model.MailModel;

import freemarker.template.TemplateException;

public interface SendingEmailService {
    
    void sendEmail(MailModel mailModel) throws MessagingException, IOException, TemplateException;
}
