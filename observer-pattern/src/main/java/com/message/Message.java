package com.message;

/**
 * Created by guramritpal on 1/13/16.
 */
public class Message {

    public Message() {
    }

    public Message(String body) {
        this.body = body;
    }

    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
