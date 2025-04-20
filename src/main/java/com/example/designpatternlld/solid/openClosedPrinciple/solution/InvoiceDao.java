package com.example.designpatternlld.solid.openClosedPrinciple.solution;

import com.example.designpatternlld.solid.singleResponsiblityPrinciple.solution.Invoice;

public interface InvoiceDao {
    public void save(Invoice invoice);
}
