package com.example.designpatternlld.solid.singleResponsiblityPrinciple.solution;

public class InvoiceDao {
    private Invoice invoice;
    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }
    public void saveToDatabase() {
        //save to db
    }
}
