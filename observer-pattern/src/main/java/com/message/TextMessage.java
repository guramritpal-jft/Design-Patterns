package com.message;

/**
 * Created by guramritpal on 1/13/16.
 */
public class TextMessage extends Message {

    private String from;

    public TextMessage(String from) {
        this.from = from;
    }
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
