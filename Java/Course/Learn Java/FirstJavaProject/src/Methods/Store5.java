package Methods;

public class Store5 {
    // instance fields
    String productType;
    public double price;

    // constructor method
    public Store5(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }
}