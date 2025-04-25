package Methods;

public class Main6 {
    public static void main(String[] args) {
        Store6 lemonadeStand = new Store6("Lemonade", 3.75);
        double lemonadePrice = lemonadeStand.getPriceWithTax();

        System.out.println(lemonadePrice);
    }
}