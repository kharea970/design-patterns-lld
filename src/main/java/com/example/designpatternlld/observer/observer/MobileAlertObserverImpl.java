package com.example.designpatternlld.observer.observer;

import com.example.designpatternlld.observer.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String mobileNo;
    StockObservable observable;
    public MobileAlertObserverImpl(String mobileNo, StockObservable observable) {
        this.mobileNo = mobileNo;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMessage(mobileNo);
    }
    private void sendMessage(String mobileNo) {
        System.out.println("send alert to MobileNo: " + mobileNo);
    }
}
