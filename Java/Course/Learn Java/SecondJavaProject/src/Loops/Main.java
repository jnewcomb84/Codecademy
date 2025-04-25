package Loops;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        PrimeDirective obj = new PrimeDirective();
        int[] numbers = {2, 3, 5, 6, 2, 7, 29, 28, 33, 11, 100, 101, 43, 89};
        //int isThisNumberPrime = isPrime(numbers[4]);

        int number = 2;

        System.out.println("\nnumber > 1: " + (number > 1) + "\n");
        System.out.println("number % (number - 1)!= 0 ");
        System.out.println("         " + number + " % (  " + number + " - 1) != 0: ");
        System.out.println("              " + number + " % (1) != 0: ");


        // System.out.println(number > 1 && (number % (number - 1) != 0 && number % 2 != 0));

//        for(int number : numbers) {
//            if(obj.isPrime(number)) {
//                System.out.println(number);
//            }
//        }
    }
}