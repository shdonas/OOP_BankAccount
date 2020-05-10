package BankAccountApp;

public class Checking extends Account {

    // list properties specific to checking
    private int debitCardNumber;
    private int debitCardPin;

    // constructor
    public Checking(String name, String ssn, double deposit) {
        super(name, ssn, deposit);
        accountNumber = "2" + accountNumber;
        setCreditCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
        System.out.println("**Implement rate for checking");
    }

    private void setCreditCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(
                "   Checking Account Features...."
                + "\n   Debit Card Number: " + debitCardNumber
                + "\n   Debit Card PIN: " + debitCardPin
        );
    }
}
