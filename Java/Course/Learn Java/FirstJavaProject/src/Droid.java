public class Droid {
    String name;
    int batteryLevel;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
        energyReport();
    }

    public void energyReport() {
        System.out.println("Current battery level: " + batteryLevel + "%");
    }

    public String toString() {
        return "Hello, I am the droid " + name;
    }

    public static void main(String[] args) {
        Droid codey = new Droid("Codey");

        System.out.println(codey);
        codey.performTask("Cleaning");
        codey.performTask("Shopping");
        codey.performTask("Your mom");
        codey.performTask("My mom");
        codey.performTask("Returning home");
        codey.performTask("Preparing dinner");
    }
}
