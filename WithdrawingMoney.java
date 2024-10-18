import java.text.NumberFormat;

public class WithdrawingMoney extends  AccountDetails{
    public WithdrawingMoney(String accountNumber, double balance, String ownerName) {
        super(accountNumber, balance, ownerName);
    }
//METHOD FOR WITHDRAWING MONEY
    public static void withdrawMoney(){
        double withdrawAmount;
        System.out.print("Enter the amount you want to withdraw:");
        withdrawAmount = scanner.nextDouble();
        if(withdrawAmount <= getBalance()) {
             setBalance(getBalance() - withdrawAmount);
            System.out.println("You have withdrawn:"+ NumberFormat.getCurrencyInstance().format(withdrawAmount));
            System.out.println();
            System.out.println("Your current balance is: "+ NumberFormat.getCurrencyInstance().format(getBalance()));
        }
        else System.out.println("Insufficient balance !");
    }
}
