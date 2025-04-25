package AccessEncapsulationAndScope;

public class CheckingAccount3 {
    public String name;
    private int balance;
    private String id;

    public CheckingAccount3(String inputName, int inputBalance, String inputId){
        name = inputName;
        balance = inputBalance;
        id = inputId;
    }

    public int getBalance() { return balance; }
    public void setBalance(int newBalance) { balance = newBalance; }
}