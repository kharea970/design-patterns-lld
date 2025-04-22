package com.example.designpatternlld.decorator;

import com.example.designpatternlld.decorator.decorators.ExtraCheese;
import com.example.designpatternlld.decorator.decorators.Mushroom;

public class PizzaHouse {
    public static void main(String[] args) {
        BasePizza basePizza = new FarmHouse();
        ExtraCheese extraCheese = new ExtraCheese(basePizza);
        Mushroom mushroom = new Mushroom(extraCheese);
        System.out.println("Total Cost : "+mushroom.cost());
    }
}
