package Methods;

public class Store3 {
    // instance fields
    String productType;

    // constructor method
    public Store3(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }
}