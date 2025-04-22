package com.example.designpatternlld.observer;

import com.example.designpatternlld.observer.observable.IphoneObservableImplementation;
import com.example.designpatternlld.observer.observable.StockObservable;
import com.example.designpatternlld.observer.observer.EmailAlertObserverImpl;
import com.example.designpatternlld.observer.observer.MobileAlertObserverImpl;
import com.example.designpatternlld.observer.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneObservableImplementation = new IphoneObservableImplementation();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@xyz.com",iphoneObservableImplementation);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc@xyz.com",iphoneObservableImplementation);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("abcdefg",iphoneObservableImplementation);


        iphoneObservableImplementation.add(observer1);
        iphoneObservableImplementation.add(observer2);
        iphoneObservableImplementation.add(observer3);

        iphoneObservableImplementation.setStockCount(10);
        iphoneObservableImplementation.setStockCount(10);
    }
}
