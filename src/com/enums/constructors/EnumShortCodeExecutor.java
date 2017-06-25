package com.enums.constructors;

/**
 * @author Sajitha
 * @Description Printing the enum short codes
 */
public class EnumShortCodeExecutor {

    public static void main(String[] args) {
        Directions dir = Directions.SOUTH;
        System.out.println(dir.getDirectionCode());
        Directions dir2 = Directions.EAST;
        System.out.println(dir2.getDirectionCode());

    }
}
