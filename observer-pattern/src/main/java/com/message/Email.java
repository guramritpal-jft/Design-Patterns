package com.message;

/**
 * Created by guramritpal on 1/13/16.
 */
public class Email extends Message {

    private String from;
    private String subject;

    public Email(String from, String subject) {
        this.from = from;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

}
