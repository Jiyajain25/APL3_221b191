ANS2.
public class Mother {
    // Show method in the Mother class
    public void show() {
        System.out.println("Hello World");
    }
}
public class Child extends Mother {
    // Overriding the show method in the Child class with the same signature
    @Override
    public void show() {
        System.out.println("Hello JUET");
    }
}
public class Application {
    public static void main(String[] args) {
        // Creating objects of Mother and Child classes
        Mother mother = new Mother();
        Child child = new Child();

        // Calling the show method from both classes
        mother.show(); // This will print "Hello World"
        child.show();  // This will print "Hello JUET"
    }
}
