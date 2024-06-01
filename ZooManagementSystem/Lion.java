package ZooManagementSystem;

public class Lion extends Animal {
    // The Lion class extends the Animal class, inheriting its fields and methods.

    // The constructor calls the constructor of the parent (Animal) class, initializing the 'name' and 'age' fields.
    public Lion(String name, int age) {
        super(name, age);
    }

    // The 'makeSound()' method overrides the one in the parent (Animal) class, printing "Roar" instead.
    // This demonstrates method overriding.
    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    // The 'eat()' method overrides the one in the parent (Animal) class, printing "Eating meat" instead.
    // This also demonstrates method overriding.
    @Override
    public void eat() {
        System.out.println("Eating meat");
    }
}
