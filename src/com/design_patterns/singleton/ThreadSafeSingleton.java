package com.design_patterns.singleton;

/**
 * @author spathirana
 * @description Thread Safe Singleton - The easier way to create a thread-safe
 * singleton class is to make the global access method synchronized.
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton singleton;

    private ThreadSafeSingleton() {
    }

    /**
     * @description Reduces the performance because of cost associated with the
     * synchronized method
     */
    /* public static synchronized ThreadSafeSingleton getInstance() {
        if (singleton == null) {
            singleton = new ThreadSafeSingleton();
        }
        return singleton;
    }*/
    
    public static ThreadSafeSingleton getInstance() {
        if (singleton == null) {
            synchronized (ThreadSafeSingleton.class) {
                //double checked locking principle
                if (singleton == null) {
                    singleton = new ThreadSafeSingleton();
                }
            }
        }
        return singleton;
    }
}
