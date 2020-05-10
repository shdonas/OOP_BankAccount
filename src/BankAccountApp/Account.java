package BankAccountApp;

//abstract: won't be able to make an object
public abstract class Account implements IBaseRate {

    // list of common properties for savings and checkings
    private final String name;
    private final String sSN;
    private double balance;

    private static int index = 10000;
    protected String accountNumber;
    public double rate;

//    private String accountType; //sub-class will override this 
    // constructor to set base properties
    public Account(String name, String ssn, double deposit) {
        this.name = name;
        this.sSN = ssn;
        this.balance = deposit;

        //set account number
        index++;
        this.accountNumber = setAccountNumber();

        setRate();
    }

    public abstract void setRate();
    
    public void compoundRate(){
        double accruedInterest = balance * (rate/100);
    }

    // generate account number
    private String setAccountNumber() {
        // Last 2 digits of SSN
        String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());    // sSN.length()-2 = 9-2 = 7, so the index is 7(8th number)
        int uniqueID = index; // 5 digit unique id
        int randThreeDigits = (int) (Math.random() * Math.pow(10, 3)); // random 3 digits
        return lastTwoOfSSN + "" + uniqueID + "" + randThreeDigits;
    }

    // common methods
    public void deposit(double diposit) {
        balance = balance + diposit;
        printBalance();
    }

    public void withdraw(double withdraw) {
        balance = balance - withdraw;
        printBalance();
    }

    public void transfer(String toWhere, double transferAmount) {
        balance = balance - transferAmount;
        System.out.println("Transferring $" + transferAmount + " to " + toWhere);
        printBalance();
    }
    
    public void printBalance(){
        System.out.println("Your balance is now $" + balance);
    }

    // Show info
    public void showInfo() {
        System.out.println("Name: " + name
                + "\nAccount Number: " + accountNumber
                + "\nBalance: " + balance
                + "\nRate: " + rate + "%");
    }
}
