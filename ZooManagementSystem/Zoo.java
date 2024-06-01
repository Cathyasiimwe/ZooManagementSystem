package ZooManagementSystem;

public class Zoo {
    // The Zoo class contains the main method that demonstrates the functionality of the zoo management system.

    public static void main(String[] args) {
        // Create instances of the Lion, Elephant, and Monkey classes.
        Lion lion = new Lion("Simba", 5);
        Elephant elephant = new Elephant("Rani", 10);
        Monkey monkey = new Monkey("Mango", 3);

        // Demonstrate the behavior of the Lion.
        System.out.println("Lion:");
        lion.makeSound(); // Calls the overridden makeSound() method in the Lion class
        lion.eat(); // Calls the overridden eat() method in the Lion class
        lion.makeSound(3); // Calls the overloaded makeSound(int times) method, which calls the overridden makeSound() method 3 times
        lion.eat("meat"); // Calls the overloaded eat(String foodType) method

        // Demonstrate the behavior of the Elephant.
        System.out.println("\nElephant:");
        elephant.makeSound(); // Calls the overridden makeSound() method in the Elephant class
        elephant.eat(); // Calls the overridden eat() method in the Elephant class
        elephant.makeSound(2); // Calls the overloaded makeSound(int times) method, which calls the overridden makeSound() method 2 times
        elephant.eat("grass"); // Calls the overloaded eat(String foodType) method

        // Demonstrate the behavior of the Monkey.
        System.out.println("\nMonkey:");
        monkey.makeSound(); // Calls the overridden makeSound() method in the Monkey class
        monkey.eat(); // Calls the overridden eat() method in the Monkey class
        monkey.makeSound(4); // Calls the overloaded makeSound(int times) method, which calls the overridden makeSound() method 4 times
        monkey.eat("bananas"); // Calls the overloaded eat(String foodType) method
    }
}
