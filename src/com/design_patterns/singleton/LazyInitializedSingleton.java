package com.design_patterns.singleton;

/**
 * @author spathirana
 * @description Lazy Initialization - Implement Singleton pattern creates the
 * instance in the global access method.
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton initializedSingleton;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if (initializedSingleton == null) {
            initializedSingleton = new LazyInitializedSingleton();
        }
        return initializedSingleton;
    }
}
