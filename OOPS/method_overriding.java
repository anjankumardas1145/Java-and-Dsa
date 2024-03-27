package OOPS;


// Java program to demonstrate
// method overriding in java

// Base Class
class method_overriding {
    void show() { System.out.println("Parent's show()"); }
}

// Inherited class
class Child extends method_overriding {
    // This method overrides show() of Parent
    @Override void show()
    {
        System.out.println("Child's show()");
    }
}

// Driver class
class Main {
    public static void main(String[] args)
    {
        // If a Parent type reference refers
        // to a Parent object, then Parent's
        // show is called
        method_overriding obj1 = new method_overriding();
        obj1.show();

        // If a Parent type reference refers
        // to a Child object Child's show()
        // is called. This is called RUN TIME
        // POLYMORPHISM.
        method_overriding obj2 = new Child();
        obj2.show();
    }
}
