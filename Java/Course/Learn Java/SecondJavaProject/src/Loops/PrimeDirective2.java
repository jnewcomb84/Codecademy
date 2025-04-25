package Loops;

/*
import java.util.ArrayList;

class PrimeDirective {

    // Add your methods here:
    public boolean isPrime(int x) {
        return true;
    }

    public static void main(String[] args) {

        //PrimeDirective pd = new PrimeDirective();
        ArrayList<Integer> pd = new ArrayList<Integer>();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        for(int number : numbers) {
           // if(isPrime(number)) {
            if(true) {
                System.out.println(number + " is a prime number!");
                pd.add(number);
            }
        }
        System.out.println(pd);
    }
}*/

// Import statement:
//
//import java.util.ArrayList;
//
///*
//    OPTIMUS PRIME
// */
//
//class PrimeDirective {
//
//    // Add your methods here:
//    boolean isPrime(int number) {
//        if (number == number) {
//            return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//
//        PrimeDirective pd = new PrimeDirective();
//        // int number = 1;
//        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
//        int isThisNumberPrime = isPrime(numbers[4]);
//
//        System.out.println(isPrime(numbers[4]));
//
////        for(Integer number : numbers) {
////            if (isAPrime(number)) {
////                System.out.println(number);
////            }
//    }
//}

class PrimeDirective {

    // Add your methods here:
    public static boolean isPrime(int number) {
        System.out.println("inside the isPrime method: ");
        return true;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        System.out.println("numbers[0]: " + isPrime(numbers[0]));
        // System.out.println("numbers[0]: " + isPrime(numbers[0]));
    }
}