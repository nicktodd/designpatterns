package com.watchelm.builder.abstract_builder;

/**
 * Director class that orchestrates the construction of Pizza objects using multiple PizzaBuilders.
 * It holds different builder instances as properties to construct various pizza types,
 * allowing each builder to be specialized for a specific pizza variant.
 */
public class PizzaDirector {
    private PizzaBuilder margheritaBuilder;
    private PizzaBuilder pepperoniBuilder;

    public PizzaDirector(PizzaBuilder margheritaBuilder, PizzaBuilder pepperoniBuilder) {
        this.margheritaBuilder = margheritaBuilder;
        this.pepperoniBuilder = pepperoniBuilder;
    }

    public Pizza constructMargherita() {
        return margheritaBuilder
                .setDough("Thin Crust")
                .setSauce("Tomato")
                .setCheese("Mozzarella")
                .setTopping("Basil")
                .build();
    }

    public Pizza constructPepperoni() {
        return pepperoniBuilder
                .setDough("Thick Crust")
                .setSauce("Tomato")
                .setCheese("Mozzarella")
                .setTopping("Pepperoni")
                .build();
    }
}
