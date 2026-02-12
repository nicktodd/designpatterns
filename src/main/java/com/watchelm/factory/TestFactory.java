package com.watchelm.factory;

public class TestFactory {
    public static void main(String[] args) {
        Pizza margherita = PizzaFactory.createPizza("margherita");
        System.out.println("Factory Pizza - Margherita: " + margherita);

        Pizza pepperoni = PizzaFactory.createPizza("pepperoni");
        System.out.println("Factory Pizza - Pepperoni: " + pepperoni);
    }
}
