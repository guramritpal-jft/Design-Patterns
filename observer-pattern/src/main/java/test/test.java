package test;

import com.observer.EmailObserver;
import com.observer.SMSObserver;
import com.subject.NewsLetter;

/**
 * Created by guramritpal on 1/13/16.
 */
public class test {
    public static void main(String[] args) {
        NewsLetter newsLetter = new NewsLetter();

        EmailObserver emailObserver = new EmailObserver();
        newsLetter.addListeners(emailObserver);

                      emailObserver.subscribe("test1@user.com");
                      emailObserver.subscribe("test2@user.com");

          /*  SMSObserver smsObserver = new SMSObserver();
        smsObserver.subscribe("123456");
        smsObserver.subscribe("987654");



        newsLetter.addListeners(smsObserver);*/


        newsLetter.addMessage("This is system generated text Message");
    }
}
