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

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        // Creating instances of the Dog and Cat classes
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Calling methods from both Dog and Cat classes
        dog.eat();  // Inherited from Animal class
        dog.bark(); // Defined in Dog class

        cat.eat();  // Inherited from Animal class
        cat.meow(); // Defined in Cat class
    }
}
