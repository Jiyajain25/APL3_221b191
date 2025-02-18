// File: Pack1.java
package com.juet;

public class Pack1 {
    // protected method
    protected void display() {
        System.out.println("Display method from Pack1");
    }
}
// File: Pack2.java
package com.jiet;

import com.juet.Pack1;

public class Pack2 {
    public static void main(String[] args) {
        // Try to create an object of Pack1 and access display method
        Pack1 obj = new Pack1();
        obj.display();  // Error: display() has protected access in Pack1
    }
}
error: display() has protected access in Pack1
        obj.display(); // Error: display() has protected access in Pack1
// File: Pack2.java
package com.jiet;

import com.juet.Pack1;

// Subclass Pack2 extending Pack1
public class Pack2 extends Pack1 {
    public static void main(String[] args) {
        // Create an object of Pack2 (which is a subclass of Pack1)
        Pack2 obj = new Pack2();
        obj.display();  // Now works because display() is inherited from Pack1
    }
}
