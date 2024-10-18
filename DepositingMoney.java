import java.text.NumberFormat;

public class DepositingMoney extends AccountDetails{
    public DepositingMoney(String accountNumber, double balance, String ownerName) {
        super(accountNumber, balance, ownerName);
    }
     //METHOD FOR DEPOSITING MONEY
    public static void DepositMoney(){
        double depositAmount;
        System.out.print("Enter the amount you want to deposit:");
        depositAmount = scanner.nextDouble();
        setBalance(getBalance() + depositAmount);
        System.out.println("Your new balance is " + NumberFormat.getCurrencyInstance().format(getBalance()));
    }
}
