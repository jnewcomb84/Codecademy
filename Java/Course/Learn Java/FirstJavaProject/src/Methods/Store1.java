package Methods;

public class Store1 {
    // instance fields
    String productType;

    // constructor method
    public Store1(String product) {
        productType = product;
    }

    // Add advertise method below
    public void advertise() {
        System.out.println("Come spend some money!");
        System.out.println("Selling " + productType + "!");
    }
}