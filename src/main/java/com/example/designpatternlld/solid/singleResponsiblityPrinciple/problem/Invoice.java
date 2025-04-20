package com.example.designpatternlld.solid.singleResponsiblityPrinciple.problem;

public class Invoice {
    private final Marker marker;
    private final int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }
    public int calculateTotal() {
        return marker.price * this.quantity;
    }
    public void printInvoice(){
        // print invoice
    }
    public void saveToDb(){
        //save the data into db
    }
    // there are total 3 reason to change
}
