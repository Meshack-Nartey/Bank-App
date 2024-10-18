import java.util.Scanner;

public class AccountDetails {
    static Scanner scanner = new Scanner(System.in);

    //FIELDS FOR THE CUSTOMER
    public static  String accountNumber;
    private static double balance;
    public static  String ownerName;
    public static int amountBorrowed;
    public static double amountToBePaid;

    //Constructor for the fields.
    AccountDetails(String accountNumber, double balance, String ownerName) {
        AccountDetails.accountNumber = accountNumber;
        AccountDetails.balance = balance;
        AccountDetails.ownerName = ownerName;
    }


    public static double getBalance() {
        return balance;
    }
    public static void setBalance(double balance) {
        AccountDetails.balance = balance;
    }
}
