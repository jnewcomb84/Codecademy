package Loops;

// Import statement:
import java.util.ArrayList;

class PrimeDirective {
    // Add your methods here:
    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int number : numbers) {
            if(isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }

    public static boolean isPrime(int number) {
        if(number == 2) { return true; }
        else if(number < 2) {  return false; }
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {2, 6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(pd.onlyPrimes(numbers));
    }
}

// import java.util.ArrayList;

//class Loops.PrimeDirective {
//
//    // Add your methods here:
//    public static boolean isPrime(int number) {
//        // boolean isPrimeNumber = (number > 1 && (number % (number - 1) != 0 && number % 2 != 0));
//        if(number > 1 && (number % (number - 1) != 0) && (number % 2 != 0)) {
//            System.out.println(number + " > 2: " + (number > 2));
//            System.out.println(number + " % (" + number + " - 1) != 0: " + (number % (number - 1) != 0));
//            System.out.println(number + " % 2 != 0: " + (number % 2 != 0));
//            System.out.println(number + " is a prime number!");
//            return true;
//        }
//        System.out.println(number + " is NOT a prime number!");
//        return false;
//    }
//
//    public static void main(String[] args) {
//        // Loops.PrimeDirective pd = new Loops.PrimeDirective();
//        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
//        boolean prime = isPrime(numbers[3]);
//        System.out.println(prime);
//    }
//}