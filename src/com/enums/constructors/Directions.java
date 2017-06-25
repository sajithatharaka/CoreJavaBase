package com.enums.constructors;

/**
 * @author Sajitha
 * @Description Declaring enum constructors with different parameters
 */
public enum Directions {
    //different instances of Directions enum
    NORTH("N"), SOUTH("S"), EAST("E"), WEST("W");
    private final String shortCode;

    // this is the enum constructor which is private
    private Directions(String shorCode) {
        this.shortCode = shorCode;
    }

    public String getDirectionCode() {
        return shortCode;
    }
}
