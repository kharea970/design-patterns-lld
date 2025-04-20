package com.example.designpatternlld.solid.InterfaceSegmented.problem;

public class Waiter implements RestaurantEmployee{
    @Override
    public void washDishes() {
        //not my job
    }

    @Override
    public void serveCustomers() {
        //yes i will do
    }

    @Override
    public void cookFood() {
        //not my job
    }
}
