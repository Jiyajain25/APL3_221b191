// Animal.java
abstract class Animal {
    public abstract void makeVoice();
}
// Cow.java
public class Cow extends Animal {
    @Override
    public void makeVoice() {
        System.out.println("Moo!");
    }
}
// Dog.java
public class Dog extends Animal {
    @Override
    public void makeVoice() {
        System.out.println("Bark!");
    }
}
// Pig.java
public class Pig extends Animal {
    @Override
    public void makeVoice() {
        System.out.println("Oink!");
    }
}
// Goat.java
public class Goat extends Animal {
    @Override
    public void makeVoice() {
        System.out.println("Baa!");
    }
}
// Lion.java
public class Lion extends Animal {
    @Override
    public void makeVoice() {
        System.out.println("Roar!");
    }
}
// Voice.java
public class Voice {

    public void prepareVoice() {
        // Creating an array of Animal with size 5
        Animal[] animals = new Animal[5];
        
        // Assigning different animals to the array
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
        
        // Calling the hear method
        hear(animals);
    }

    public void hear(Animal[] animals) {
        // Loop to call makeVoice() for each animal in the array
        for (Animal animal : animals) {
            animal.makeVoice();  // Polymorphism in action
        }
    }
}
// Test.java
public class Test {
    public static void main(String[] args) {
        // Creating an object of Voice class and calling the prepareVoice method
        Voice voice = new Voice();
        voice.prepareVoice();
    }
}
