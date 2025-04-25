package StaticVariablesAndMethods;

public class ATM2 {
    // Static variables
    public static int totalMoney = 0;
    public static int numATMs = 0;

    // Instance variables
    public int money;

    public ATM2(int inputMoney){
        this.money = inputMoney;

        // Steps 1 and 2: Edit numATMs and total money here
        numATMs++;
        totalMoney += inputMoney;
    }

    public void withdrawMoney(int amountToWithdraw){
        if(amountToWithdraw <= this.money){
            this.money -= amountToWithdraw;
            // Step 3: Edit totalMoney here
            totalMoney -= amountToWithdraw;
        }
    }

    public static void main(String[] args){

        System.out.println("Total number of ATMs: " + ATM2.numATMs);
        ATM2 firstATM = new ATM2(1000);
        ATM2 secondATM = new ATM2(500);
        System.out.println("Total number of ATMs: " + ATM2.numATMs);

        System.out.println("Total amount of money in all ATMs: " + ATM2.totalMoney);
        firstATM.withdrawMoney(500);
        secondATM.withdrawMoney(200);
        System.out.println("Total amount of money in all ATMs: " + ATM2.totalMoney);



    }
}