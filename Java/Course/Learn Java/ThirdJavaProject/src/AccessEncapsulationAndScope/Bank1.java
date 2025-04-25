package AccessEncapsulationAndScope;

public class Bank1 {
    public static void main(String[] args){
        CheckingAccount1 accountOne = new CheckingAccount1("Zeus", 100, "1");
        CheckingAccount1 accountTwo = new CheckingAccount1("Hades", 200, "2");
        System.out.println(accountOne.name);
        accountOne.addFunds(5);
        accountOne.getInfo();
    }

}