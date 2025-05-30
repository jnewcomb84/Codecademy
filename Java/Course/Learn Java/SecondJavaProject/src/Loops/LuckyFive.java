package Loops;

// Importing the Random library
import java.util.Random;

class LuckyFive {

    public static void main(String[] args) {

        // Creating a random number generator
        Random randomGenerator = new Random();

        // Generate a number between 1 and 6
        int dieRoll = randomGenerator.nextInt(6) + 1;

        // Repeat while roll isn't 5
        System.out.println(dieRoll);
        while(dieRoll != 5) {
            dieRoll = randomGenerator.nextInt(6) + 1;
            System.out.println(dieRoll);
        }
    }
}