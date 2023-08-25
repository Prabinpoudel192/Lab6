class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Labrador extends Dog {
    void playFetch() {
        System.out.println("Labrador is playing fetch");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        // Creating an instance of the Labrador class
        Labrador labrador = new Labrador();

        // Calling methods from all three classes
        labrador.eat();       // Inherited from Animal class
        labrador.bark();      // Inherited from Dog class
        labrador.playFetch(); // Defined in Labrador class
    }
}
