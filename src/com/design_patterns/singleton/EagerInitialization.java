package com.design_patterns.singleton;

/**
 * @author spathirana
 * @description Eager initialization - The instance of Singleton Class is
 * created at the time of class loading.
 */
public class EagerInitialization {

    private static final EagerInitialization eagerInitialization = new EagerInitialization();

    private EagerInitialization() {
    }

    public static EagerInitialization getInstance() {
        return eagerInitialization;
    }
}
