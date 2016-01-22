package com.observer;

import com.message.Message;
import com.message.TextMessage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guramritpal on 1/13/16.
 */
public class SMSObserver implements Observer {
    private List<String> mobileNumbers;
    private TextMessage textMessage;

    public SMSObserver() {
        mobileNumbers= new ArrayList<>();
    }

    @Override
    public void update(String message) {

            textMessage =new TextMessage("Jellyfish Technologies");
            textMessage.setBody(message);

        for (String number : mobileNumbers) {
                System.out.println("To" + number);
                System.out.println("Text....." + textMessage.getBody());
            }

    }

    public void subscribe(String mobileNumber) {
        this.mobileNumbers.add(mobileNumber);
    }

    public void unsubscribe(String mobileNumber) {
        this.mobileNumbers.remove(mobileNumber);
    }
}
