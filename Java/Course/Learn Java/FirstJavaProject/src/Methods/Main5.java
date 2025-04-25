package Methods;

public class Main5 {
    public static void main(String[] args) {
        Store5 lemonadeStand = new Store5("Lemonade", 3.75);

        lemonadeStand.increasePrice(1.50);

        System.out.println(lemonadeStand.price);
    }
}