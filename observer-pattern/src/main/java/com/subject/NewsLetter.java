package com.subject;

import com.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guramritpal on 1/13/16.
 */
public class NewsLetter {
    private String  message;
    private List<Observer> observers;

    public NewsLetter() {
        message = new String();
        observers = new ArrayList<>();
    }

    public void addMessage(String message){
        this.message = message;
        notifyListeners(message);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void removeListeners(Observer observer) {
        this.observers.remove(observer);
    }

    public void addListeners(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyListeners(String message){
        // updating observers
        for(Observer observer : observers){
            observer.update(message);
        }
    }

}
