package core.basesyntax;

import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import java.time.LocalDate;

/**
 * A simple HelloWorld class demonstrating Google Java Style.
 * Creates Cat and Dog instances, prints messages, and initializes variables.
 */
public class HelloWorld {

    /**
     * Main method. Entry point of the program.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
    }

    /**
     * Returns a string containing even numbers from 0 to 9, separated by spaces.
     *
     * @return a string of even numbers from 0 to 9
     */
    private String getFromOneToTen() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }

    /**
     * Prints a greeting message.
     *
     * @param hello the custom string to print
     */
    private void sayHello(String hello) {
        System.out.println(
                "Hello, Mate! I am happy to see you! This class looks weird! "
                + "Your task is to fix the checkstyle in this file. "
                + "Your goal is to run `mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(hello);
    }

    /**
     * Initializes some example variables and prints them to the console.
     * Demonstrates usage of strings, integers, and the current year.
     */
    private void initializeVariables() {
        String greeting = "Hello mates!";
        System.out.println(greeting);

        int currentDate = LocalDate.now().getYear();
        System.out.println("It is " + currentDate + " year");

        int age = 25;
        System.out.println("I'm " + age);

        int size = 42;
        System.out.println("The size is " + size);
    }
}
