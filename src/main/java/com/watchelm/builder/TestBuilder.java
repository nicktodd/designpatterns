package com.watchelm.builder;

import com.watchelm.builder.abstract_builder.*;

public class TestBuilder {
    public static void main(String[] args) {
        // Using Abstract Builder approach
        PizzaBuilder margheritaBuilder = new MargheritaPizzaBuilder();
        PizzaBuilder pepperoniBuilder = new PepperoniPizzaBuilder();
        PizzaDirector director = new PizzaDirector(margheritaBuilder, pepperoniBuilder);


        com.watchelm.builder.abstract_builder.Pizza margheritaPizza = director.constructMargherita();
        System.out.println("Abstract Builder Pizza - Margherita: " + margheritaPizza);

        com.watchelm.builder.abstract_builder.Pizza pepperoniPizza = director.constructPepperoni();
        System.out.println("Abstract Builder Pizza - Pepperoni: " + pepperoniPizza);

        // Using Inner Class Builder approach
        com.watchelm.builder.inner_class_builder.Pizza customPizza = new com.watchelm.builder.inner_class_builder.Pizza.Builder()
                .setDough("Thick Crust")
                .setSauce("Pesto")
                .setCheese("Parmesan")
                .setTopping("Pineapple")
                .build();
        System.out.println("Inner Class Builder Pizza: " + customPizza);
    }
}
