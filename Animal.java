class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {

        Animal a = new Dog();
        a.sound(); // Dog barks
    }
}
/*
 * How it works?
 * Animal a = new Dog();
 * 
 * Reference type = Animal
 * 
 * Object type = Dog
 * 
 * When:
 * 
 * a.sound();
 * 
 * Java looks at the actual object (Dog) and executes:
 * 
 * void sound() {
 * System.out.println("Dog barks");
 * }
 * 
 * This decision is made at runtime.
 */