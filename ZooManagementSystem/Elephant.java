package ZooManagementSystem;

public class Elephant extends Animal {
    // The Elephant class extends the Animal class, inheriting its fields and methods.

    // The constructor calls the constructor of the parent (Animal) class, initializing the 'name' and 'age' fields.
    public Elephant(String name, int age) {
        super(name, age);
    }

    // The 'makeSound()' method overrides the one in the parent (Animal) class, printing "Trumpet" instead.
    // This demonstrates method overriding.
    @Override
    public void makeSound() {
        System.out.println("Trumpet");
    }

    // The 'eat()' method overrides the one in the parent (Animal) class, printing "Eating grass" instead.
    // This also demonstrates method overriding.
    @Override
    public void eat() {
        System.out.println("Eating grass");
    }
}
