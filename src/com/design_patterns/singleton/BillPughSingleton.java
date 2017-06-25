package com.design_patterns.singleton;

/**
 * @author spathirana
 * @description Prior to Java 5, java memory model had a lot of issues and
 * Thread Safe Singleton approaches used to fail in certain scenarios where too
 * many threads try to get the instance of the Singleton class simultaneously.
 * So Bill Pugh came up with a different approach to create the Singleton class
 * using a inner static helper class.
 */
public class BillPughSingleton {

    private BillPughSingleton() {
    }

    /**
     * @description When the singleton class is loaded, SingletonHelper class is
     * not loaded into memory and only when someone calls the getInstance
     * method, this class gets loaded and creates the Singleton class instance.
     */
    private static class SingletonHelper {

        // since this is final only one object will be created
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
