package com.example.designpatternlld.observer.observer;

import com.example.designpatternlld.observer.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;
    public EmailAlertObserverImpl(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMail(emailId);
    }

    private void sendMail(String emailId){
        System.out.println("Sending an email to " + emailId);
    }
}
