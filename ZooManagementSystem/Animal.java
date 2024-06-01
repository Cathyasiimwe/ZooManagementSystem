package ZooManagementSystem;

public class Animal {
    // This class represents the base Animal class, which will be inherited by the subclasses.
    // The 'protected' access modifier is used for the fields 'name' and 'age' so that they can be accessed by the subclasses.

    protected String name;
    protected int age;

    // The constructor initializes the 'name' and 'age' fields.
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // The 'makeSound()' method prints a generic "Making a sound..." message.
    // This method will be overridden in the subclasses to provide specific sounds.
    public void makeSound() {
        System.out.println("Making a sound...");
    }

    // The 'eat()' method prints a generic "Eating..." message.
    // This method will be overridden in the subclasses to provide specific eating behaviors.
    public void eat() {
        System.out.println("Eating...");
    }

    // The overloaded 'makeSound(int times)' method calls the 'makeSound()' method 'times' number of times.
    // This method demonstrates method overloading.
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }

    // The overloaded 'eat(String foodType)' method prints a message about the animal eating a specific food type.
    // This method also demonstrates method overloading.
    public void eat(String foodType) {
        System.out.println("Eating " + foodType);
    }
}
