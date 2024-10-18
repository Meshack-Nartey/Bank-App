import java.text.NumberFormat;

public class TransferringMoney extends AccountDetails{
    public TransferringMoney(String accountNumber, double balance, String ownerName) {
        super(accountNumber, balance, ownerName);
    }

    //METHOD FOR TRANSFERRING MONEY TO A DIFFERENT ACCOUNT
    public static void transferMoney(){
        int accountNumber;
        int transferAmount;
        System.out.println("Enter the account number of the recipient:");
        accountNumber = scanner.nextInt();
        System.out.println("Enter the amount to transfer:");
        transferAmount = scanner.nextInt();
        if (getBalance() >= transferAmount){
            setBalance(getBalance()-transferAmount);
            System.out.println("You have transferred " + NumberFormat.getCurrencyInstance().format(transferAmount)+ " to the account number: " +accountNumber);
            System.out.println("Your new balance is:" + NumberFormat.getCurrencyInstance().format(getBalance()));
        }
        else System.out.println("Insufficient funds, top-up and try again.");

    }
}
