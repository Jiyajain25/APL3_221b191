Ans3.
// Behavior interfaces
interface Swim {
    void swim();
}

interface Fly {
    void fly();
}

interface Quack {
    void quack();
}

interface Squeak {
    void squeak();
}

interface Mute {
    void mute();
}
// Rubber Duck - swims and squeaks, doesn't fly or quack
class RubberDuck implements Swim, Squeak {
    @Override
    public void swim() {
        System.out.println("Rubber Duck is swimming.");
    }

    @Override
    public void squeak() {
        System.out.println("Rubber Duck squeaks.");
    }
}

// Wooden Duck - swims and is mute, doesn't fly or quack
class WoodenDuck implements Swim, Mute {
    @Override
    public void swim() {
        System.out.println("Wooden Duck is swimming.");
    }

    @Override
    public void mute() {
        System.out.println("Wooden Duck is mute.");
    }
}

// RedHead Duck - swims, flies, and quacks
class RedHeadDuck implements Swim, Fly, Quack {
    @Override
    public void swim() {
        System.out.println("RedHead Duck is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("RedHead Duck is flying.");
    }

    @Override
    public void quack() {
        System.out.println("RedHead Duck is quacking.");
    }
}

// Lake Duck - swims, flies, and quacks
class LakeDuck implements Swim, Fly, Quack {
    @Override
    public void swim() {
        System.out.println("Lake Duck is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("Lake Duck is flying.");
    }

    @Override
    public void quack() {
        System.out.println("Lake Duck is quacking.");
    }
}
public class DuckGame {
    public static void main(String[] args) {
        // Creating various types of ducks
        Swim rubberDuckSwim = new RubberDuck();
        Swim woodenDuckSwim = new WoodenDuck();
        Swim redHeadDuckSwim = new RedHeadDuck();
        Swim lakeDuckSwim = new LakeDuck();

        // Demonstrating Rubber Duck behavior
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuckSwim.swim();
        rubberDuck.squeak();

        // Demonstrating Wooden Duck behavior
        WoodenDuck woodenDuck = new WoodenDuck();
        woodenDuckSwim.swim();
        woodenDuck.mute();

        // Demonstrating RedHead Duck behavior
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuckSwim.swim();
        redHeadDuck.fly();
        redHeadDuck.quack();

        // Demonstrating Lake Duck behavior
        LakeDuck lakeDuck = new LakeDuck();
        lakeDuckSwim.swim();
        lakeDuck.fly();
        lakeDuck.quack();
    }
}
