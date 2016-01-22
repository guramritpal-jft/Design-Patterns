package com.observer;

import com.message.Email;
import com.message.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guramritpal on 1/13/16.
 */
public class EmailObserver implements Observer {
    private List<String> emails;
    private Email email;
    public EmailObserver() {
        emails = new ArrayList<String>();
    }

    @Override
    public void update(String message) {
        email = new Email("Admin@jellyfishTec.com","Hi this is subject");
        email.setBody(message);

        for(String emailAddress:emails) {
            System.out.println("To" + emailAddress);
            System.out.println("from....." + email.getFrom());
            System.out.println("Subject....." + email.getSubject());
            System.out.println("Body....." + email.getBody());
         }
        }
    public void subscribe(String email) {
        this.emails.add(email);
    }

    public void unsubscribe(String email) {
        this.emails.remove(email);
    }
}
