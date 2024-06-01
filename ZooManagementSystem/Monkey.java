package ZooManagementSystem;

public class Monkey extends Animal {
    // The Monkey class extends the Animal class, inheriting its fields and methods.

    // The constructor calls the constructor of the parent (Animal) class, initializing the 'name' and 'age' fields.
    public Monkey(String name, int age) {
        super(name, age);
    }

    // The 'makeSound()' method overrides the one in the parent (Animal) class, printing "Chatter" instead.
    // This demonstrates method overriding.
    @Override
    public void makeSound() {
        System.out.println("Chatter");
    }

    // The 'eat()' method overrides the one in the parent (Animal) class, printing "Eating bananas" instead.
    // This also demonstrates method overriding.
    @Override
    public void eat() {
        System.out.println("Eating bananas");
    }
}
