package com.watchelm.factory;

public class MargheritaPizza extends Pizza {
    @Override
    public void prepare() {
        dough = "Thin Crust";
        sauce = "Tomato";
        cheese = "Mozzarella";
        topping = "Basil";
    }
}
