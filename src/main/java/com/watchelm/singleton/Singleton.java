package com.watchelm.singleton;
// we want just one instance
public class Singleton {
    // cannot be instantiated from outside
    private Singleton() {
    }

    public static class Holder {
        private static final Singleton single = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.single;
    }

}
