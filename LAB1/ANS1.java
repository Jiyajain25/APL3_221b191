public class Application {
    // Mother class with int x and void show()
    static class Mother {
        // Integer field in the Mother class
        int x = 10;

        // Show method in the Mother class
        public void show() {
            System.out.println("Show method of Mother class. x = " + x);
        }
    }

    // Child class that inherits from Mother class
    static class Child extends Mother {
        // The Child class inherits the show() method from Mother
        // No need to redefine show() unless we want to override it
    }

    public static void main(String[] args) {
        // Creating an instance of the Mother class
        Mother m = new Mother();
        m.show(); // This calls the show() method of the Mother class

        // Creating an instance of the Child class
        Child ch = new Child();
        ch.show(); // This calls the show() method inherited from the Mother class
    }
}
