package com.example.designpatternlld.solid.openClosedPrinciple.problem;

import com.example.designpatternlld.solid.singleResponsiblityPrinciple.solution.Invoice;

public class InvoiceDao {
    private Invoice invoice;
    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }
    public void saveToDatabase() {
        //save to db
    }
    public void saveToFile() {
        //save to file
    }
}
