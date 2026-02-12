package com.watchelm.builder.abstract_builder;

public class PepperoniPizzaBuilder extends PizzaBuilder {
    @Override
    public Pizza build() {
        return new Pizza(dough, sauce, cheese, topping);
    }
}
