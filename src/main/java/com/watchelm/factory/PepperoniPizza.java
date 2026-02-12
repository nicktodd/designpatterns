package com.watchelm.factory;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        dough = "Thick Crust";
        sauce = "Tomato";
        cheese = "Mozzarella";
        topping = "Pepperoni";
    }
}
