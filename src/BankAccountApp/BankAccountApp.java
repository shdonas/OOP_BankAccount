package BankAccountApp;

/**
 * @author Shakhawat Hossain <shossain_psu@yahoo.com>
 */
public class BankAccountApp {

    public static void main(String[] args) {

        Checking chk1 = new Checking("Shakhawat Hossain", "123456789", 1000);
        Savings sv1 = new Savings("Shakira Sultana", "987654321", 250);
        
        chk1.showInfo();
        System.out.println("***********************************************");
        sv1.showInfo();
        
        System.out.println("***********************************************");
        
        chk1.deposit(4000);
        chk1.withdraw(2500);
        chk1.transfer("Dad", 1000);

        // read the CSV file and 
        // create account
    }

}
