package com.watchelm.factory;

public abstract class Pizza {
    protected String dough;
    protected String sauce;
    protected String cheese;
    protected String topping;

    public abstract void prepare();

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
