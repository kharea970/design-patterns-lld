package com.example.designpatternlld.decorator.decorators;

import com.example.designpatternlld.decorator.BasePizza;

public class ExtraCheese extends ToppingDecorator{
    BasePizza pizza;
    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        return this.pizza.cost() + 10;
    }
}
