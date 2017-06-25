package com.innerclasses;

/**
 * @author Sajitha
 * @description How to declare static classes
 */
public class OuterClassForStaticNestedClass {
    static class B {
    }

    public static void main(String[] args) {
        B b = new B(); // Using with in the same class
    }
}

class TestStaticInnerClass {

    public static void main(String[] args) {
        // Using in a different class
        OuterClassForStaticNestedClass.B staticClassB = new OuterClassForStaticNestedClass.B();
    }
}
