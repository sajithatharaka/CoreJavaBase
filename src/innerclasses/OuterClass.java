package innerclasses;

/**
 * @author Sajitha
 * @description
 */
public class OuterClass {// Outer Class

    private class InnerClass {//Inner Class

        public void print() {
            System.out.println("This is an inner Class");
        }
    }

    //method to access the inner class
    public void accessInnerClass() {
        InnerClass inner = new InnerClass();
        inner.print();
    }
}

class Test {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.accessInnerClass();
    }
}
