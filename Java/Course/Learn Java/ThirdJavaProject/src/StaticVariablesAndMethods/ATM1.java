package StaticVariablesAndMethods;

public class ATM1 {

    // Step 2: Create your static variables here
    public static int totalMoney = 0;
    public static int numATMs = 0;

    // Instance variables
    public int money;

    public ATM1(int inputMoney){
        this.money = inputMoney;
    }

    public void withdrawMoney(int amountToWithdraw){
        if(amountToWithdraw <= this.money){
            this.money -= amountToWithdraw;
        }
    }

    public static void main(String[] args){
        // Step 1: Create your two ATMs here
        ATM1 firstATM = new ATM1(1000);
        ATM1 secondATM = new ATM1(500);
        // Step 3: Print your static variable in three different ways here
        System.out.println(ATM1.totalMoney);
        System.out.println(firstATM.totalMoney);
        System.out.println(secondATM.totalMoney);
    }

}