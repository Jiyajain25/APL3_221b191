// Voice2.java
public class Voice2 {

    // Template method that enforces the required sequence
    public void templateMethod() {
        prepareVoice();  // Step 1: Prepare the voice by setting up the animals
        hear();          // Step 2: Hear the animals make their voices
    }

    // This method initializes the array of animals
    private void prepareVoice() {
        // Creating an array of Animal with size 5
        Animal[] animals = new Animal[5];
        
        // Assigning different animals to the array
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
        
        // Storing the animals into the instance variable for later use
        setAnimals(animals);
    }

    // This method is responsible for displaying the animal sounds
    private void hear() {
        // Loop to call makeVoice() for each animal in the array
        for (Animal animal : getAnimals()) {
            animal.makeVoice();  // Polymorphism in action
        }
    }

    // These two methods manage the animal array, ensuring controlled access to it
    private Animal[] animals;

    // Getter and setter for the animals array
    private Animal[] getAnimals() {
        return animals;
    }

    private void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
}
// Test2.java
public class Test2 {
    public static void main(String[] args) {
        // Creating an object of Voice2 class and calling the templateMethod
        Voice2 voice2 = new Voice2();
        voice2.templateMethod();
    }
}
