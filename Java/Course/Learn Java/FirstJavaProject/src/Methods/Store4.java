package Methods;

public class Store4 {
    // instance fields
    String productType;

    // constructor method
    public Store4(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    // greetCustomer() method
    public void greetCustomer(String customerName) {
        System.out.println("Welcome to the store, " + customerName + "!");
    }

}