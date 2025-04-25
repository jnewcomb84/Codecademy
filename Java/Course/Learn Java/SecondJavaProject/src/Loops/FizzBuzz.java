package Loops;
// COMPLETED WITHOUT GOING THROUGH THE EXERCISE \\
/*
        REQUIREMENTS:
        Write a program that outputs numbers from 1 to 100...
        with a catch:
        1. For multiples of 3, print Fizz instead of the number
        2. For the multiples of 5, print Buzz
        3. For numbers which are multiples of both 3 and 5, print FizzBuzz
 */

public class FizzBuzz {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            else if(i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            else if(i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }
}
