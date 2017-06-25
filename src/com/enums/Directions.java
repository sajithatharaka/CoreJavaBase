package com.enums;

/**
 * @author Sajitha
 * @Description Different usages of enums are highlighted here
 */
public enum Directions {
    //different instances of Directions enum
    NORTH, SOUTH, EAST, WEST;

    private Directions() {
    }

    //Within enum can declare static methods to access a particular enum instance
    public static Directions getEAST() {
        return EAST;
    }

}

