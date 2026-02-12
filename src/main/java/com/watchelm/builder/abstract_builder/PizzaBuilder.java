package com.watchelm.builder.abstract_builder;

/**
 * Abstract Builder class for constructing Pizza objects.
 * This class defines the interface for building different parts of a pizza
 * and provides a fluent API for setting ingredients.
 * Concrete builders extend this class to implement specific pizza types.
 */
public abstract class PizzaBuilder {
    protected String dough;
    protected String sauce;
    protected String cheese;
    protected String topping;

    public PizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    public PizzaBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public PizzaBuilder setTopping(String topping) {
        this.topping = topping;
        return this;
    }

    public abstract Pizza build();
}
