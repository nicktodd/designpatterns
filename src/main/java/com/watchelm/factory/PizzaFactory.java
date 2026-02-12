package com.watchelm.factory;

public class PizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type.toLowerCase()) {
            case "margherita":
                pizza = new MargheritaPizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            default:
                throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
        if (pizza != null) {
            pizza.prepare();
        }
        return pizza;
    }
}
