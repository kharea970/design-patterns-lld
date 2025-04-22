package com.example.designpatternlld.observer.observable;

import com.example.designpatternlld.observer.observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifyObservers();
    void setStockCount(int count);
    int getStockCount();
}
