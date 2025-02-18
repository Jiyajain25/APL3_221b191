ANS1.
// Abstract base class Bharatvanshi
abstract class Bharatvanshi {
    // Abstract method for fight behavior
    public abstract void fight();
}

// Concrete class Pandav
class Pandav extends Bharatvanshi {
    private String name;
    private int kindnessLevel;

    // Constructor
    public Pandav(String name, int kindnessLevel) {
        this.name = name;
        this.kindnessLevel = kindnessLevel;
    }

    @Override
    public void fight() {
        System.out.println(name + " fights bravely as a Pandav.");
    }

    public void obey() {
        System.out.println(name + " obeys the rules.");
    }

    public void kind() {
        if (kindnessLevel > 5) {
            System.out.println(name + " is very kind.");
        } else {
            System.out.println(name + " is kind but not excessively.");
        }
    }
}

// Concrete class Kaurav
class Kaurav extends Bharatvanshi {
    private String name;
    private boolean isObedient;

    // Constructor
    public Kaurav(String name, boolean isObedient) {
        this.name = name;
        this.isObedient = isObedient;
    }

    @Override
    public void fight() {
        System.out.println(name + " fights fiercely as a Kaurav.");
    }

    public void obey() {
        if (isObedient) {
            System.out.println(name + " obeys the rules (this is rare for Kauravs).");
        } else {
            System.out.println(name + " disobeys the rules.");
        }
    }

    public void kind() {
        System.out.println(name + " is cruel.");
    }
}

// Special class for Vikarn (obedient and kind Kaurav)
class Vikarn extends Kaurav {
    // Constructor for Vikarn, who is a special obedient Kaurav
    public Vikarn() {
        super("Vikarn", true);
    }

    @Override
    public void kind() {
        System.out.println("Vikarn is kind and obedient.");
    }
}

// Main class to test the behavior
public class Main {
    public static void main(String[] args) {
        // Creating objects for Pandavs
        Pandav arjun = new Pandav("Arjun", 8);
        Pandav bheem = new Pandav("Bheem", 6);

        // Creating objects for Kauravs
        Kaurav duryodhan = new Kaurav("Duryodhan", false);
        Vikarn vikarn = new Vikarn();

        // Displaying behaviors for Pandavs
        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        // Displaying behaviors for Kauravs
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        // Displaying behaviors for Vikarn
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}

