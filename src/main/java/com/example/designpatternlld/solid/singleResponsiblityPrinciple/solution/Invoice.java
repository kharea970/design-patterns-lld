package com.example.designpatternlld.solid.singleResponsiblityPrinciple.solution;

import com.example.designpatternlld.solid.singleResponsiblityPrinciple.solution.Marker;

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

}

