package com.example.designpatternlld.observer.observable;

import com.example.designpatternlld.observer.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImplementation implements StockObservable {
    public List<NotificationAlertObserver> observers = new ArrayList<NotificationAlertObserver>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount == 0) {
            notifyObservers();
        }
        stockCount += newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
