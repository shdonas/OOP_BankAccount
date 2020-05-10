package BankAccountApp;

public class Savings extends Account {

    // list properties specific to savings
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // constructor
    public Savings(String name, String ssn, double deposit) {
        super(name, ssn, deposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }
    

    @Override
    public void setRate() {
        rate = getBaseRate() * .25;
        System.out.println("**Implement rate for savings");
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(
                "   Savings Account Features...."
                + "\n   Safety Deposit Box ID: " + safetyDepositBoxID
                + "\n   Safety Deposite Box Key: " + safetyDepositBoxKey
        );
    }

    // methods specific to savings
}
