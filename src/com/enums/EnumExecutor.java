package com.enums;

/**
 * @author Sajitha
 * @Description Different uses of enums
 */
public class EnumExecutor {

    public static void main(String[] args) {
        Directions directionEast_directInstance = Directions.EAST; // either you can access the enum instance directly
       
        Directions directionEast_method = Directions.getEAST(); // or you can access the enum instance using an instance method declared within the enum

        listingAlltheEnums(); // this will iterate and print all the enum instances in Directions enum

        filteringEnums(directionEast_directInstance); // this will filter the enum
    }

    public static void listingAlltheEnums() {
        Directions directions[] = Directions.values();
        System.out.println("=== Listing the ENUMS ===");
        for (Directions direction : directions) {
            System.out.println(direction);
        }
    }

    public static void filteringEnums(Directions direction) {
        System.out.println("=== Filter the ENUMS ===");
        switch (direction) {
            case NORTH:
                System.out.println("In North Direction");
                break;
            case EAST:
                System.out.println("In East Direction");
                break;
            case WEST:
                System.out.println("In West Direction");
                break;
            case SOUTH:
                System.out.println("In South Direction");
                break;
        }
    }
}
