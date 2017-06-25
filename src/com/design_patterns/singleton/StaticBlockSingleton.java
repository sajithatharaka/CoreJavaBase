/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design_patterns.singleton;
public class StaticBlockSingleton {

    private static StaticBlockSingleton blockSingleton;

    private StaticBlockSingleton() {
    }

    static {
        try {
            blockSingleton = new StaticBlockSingleton();
        } catch (Exception e) {
            new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return blockSingleton;
    }
}
