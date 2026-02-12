package com.watchelm.builder.abstract_builder;

public class Pizza {
    private String dough;
    private String sauce;
    private String cheese;
    private String topping;

    public Pizza(String dough, String sauce, String cheese, String topping) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", cheese='" + cheese + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }
}
