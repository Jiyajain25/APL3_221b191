interface Testable {
    // Method declaration in the interface
    void display();
}
public class Test implements Testable {
    // Providing implementation for the display() method
    public void display() {
        System.out.println("Displaying from Test class");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.display();  // Calling the display method
    }
}
abstract class AbsTest implements Testable {
    // This is an abstract class, so no need to implement the display() method here.
    // Abstract classes can have abstract methods or fully implemented methods.
}
public class ConcreteTest extends AbsTest {
    // Provide implementation for the display() method
    public void display() {
        System.out.println("Displaying from ConcreteTest class");
    }

    public static void main(String[] args) {
        ConcreteTest test = new ConcreteTest();
        test.display();  // Calling the display method
    }
}
