package com.example.designpatternlld.solid.openClosedPrinciple.solution;

import com.example.designpatternlld.solid.singleResponsiblityPrinciple.solution.Invoice;

public class FileInvoiceDao implements InvoiceDao {
    @Override
    public void save(Invoice invoice) {
        //save to file
    }
}
