import java.text.NumberFormat;

public class DisplayingAccountInfo extends AccountDetails{

    public DisplayingAccountInfo(String accountNumber, double balance, String ownerName) {
        super(accountNumber, balance, ownerName);
    }

    public static void displayAccountInfo(){
        System.out.println("Account Number: " + accountNumber );
        System.out.println("Owner Name: " + ownerName );
        System.out.println("Balance: " + getBalance() );
        System.out.println("Outstanding debt: " + NumberFormat.getCurrencyInstance().format(amountToBePaid));
    }
}
