package com.example.designpatternlld.solid.singleResponsiblityPrinciple.solution;

public class InvoicePrinter {
    private Invoice invoice;
    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }
    public void print() {
        // print here
    }
}
