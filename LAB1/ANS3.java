public class Mother {
    // Static method in Mother class
    public static void show() {
        System.out.println("Hello from Mother (static)");
    }

    // Instance method in Mother class
    public void showInstance() {
        System.out.println("Hello from Mother (instance)");
    }
}

public class Child extends Mother {
    // Static method in Child class
    public static void show() {
        System.out.println("Hello from Child (static)");
    }

    // Instance method in Child class
    @Override
    public void showInstance() {
        System.out.println("Hello from Child (instance)");
    }
}

public class Application {
    public static void main(String[] args) {
        // Polymorphism test with reference of Mother pointing to Child
        Mother m1 = new Child();
        System.out.println("Polymorphism with instance methods:");
        m1.showInstance();  // This will call the instance method from Child

        // Static method calls
        System.out.println("\nStatic method calls:");
        // Calling static method in Mother directly
        Mother.show();  // This will call static show() in Mother

        // Calling static method in Child directly
        Child.show();  // This will call static show() in Child

        // Polymorphism test with static methods
        System.out.println("\nPolymorphism with static methods:");
        m1.show();  // This will call static show() from Mother, as reference type is Mother

        // Static methods are resolved at compile-time, not runtime

        // Demonstrating instance method call with both references
        System.out.println("\nDemonstrating instance method calls with both references:");
        Mother m2 = new Mother();
        m2.showInstance(); // This will call Mother's instance method

        Child c1 = new Child();
        c1.showInstance(); // This will call Child's instance method
    }
}
