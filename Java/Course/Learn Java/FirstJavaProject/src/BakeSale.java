public class BakeSale {
    public static void main(String[] args) {
        // Original inventory
        int numCookies = 17;

        // Customer buys 3 cookies
        numCookies -= 3;

        // Customer buys half of what's remaining
        numCookies /= 2;

        // Add your code above
        System.out.println(numCookies);
    }
}
