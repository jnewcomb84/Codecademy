package Loops;

public class PrimeDirective1 {
    public boolean isPrime(int number){
        if(number > 1 && (number % (number - 1) != 0 && number % 2 != 0)) {
            return true;
        }
        return false;
    }
}
