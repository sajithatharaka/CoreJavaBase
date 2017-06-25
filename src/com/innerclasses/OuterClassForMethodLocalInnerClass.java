package com.innerclasses;

/**
 * @author Sajitha
 * @description How to access a method local inner class
 */
public class OuterClassForMethodLocalInnerClass { // Outer Class

    void methodContainingClass() {  // Method Containing Inner Class
        int number = 10;

        class MethodLocalInnerClass { // Mehtod Local Inner Class 

            public void print() {
                System.out.println("This is a method in inner class " + number);
            }

        }

        MethodLocalInnerClass innerClass = new MethodLocalInnerClass();
        innerClass.print();
    }
}

class TestMethodLocalInnerClass {

    public static void main(String[] args) {
        OuterClassForMethodLocalInnerClass classForMethodLocalInnerClass = new OuterClassForMethodLocalInnerClass();
        classForMethodLocalInnerClass.methodContainingClass();
    }
}
