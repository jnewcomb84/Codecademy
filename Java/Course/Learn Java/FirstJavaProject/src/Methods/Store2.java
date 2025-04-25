package Methods;

public class Store2 {
    // instance fields
    String productType;

    // constructor method
    public Store2(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");
    }
}