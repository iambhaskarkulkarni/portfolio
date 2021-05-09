package com.kulkarni.portfolio.portfolioservice.model;

import java.util.Map;

public class MailModel {
    
    private String from;
    private String to;
    private String name;
    private String subject;
    private String content;
    private Map<String, String> model;

    public MailModel() {
    }

    public MailModel(String from, String to, String name, String subject, String content, Map<String, String> model) {
        this.from = from;
        this.to = to;
        this.name = name;
        this.subject = subject;
        this.content = content;
        this.model = model;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Map<String, String> getModel() {
        return model;
    }

    public void setModel(Map<String, String> model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "MailModel{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                ", model=" + model +
                '}';
    }
}
