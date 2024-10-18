import java.text.NumberFormat;

public class RepayingMoney extends AccountDetails{
    public RepayingMoney(String accountNumber, double balance, String ownerName) {
        super(accountNumber, balance, ownerName);
    }

    public static void repayLoan(){
        double payment;
        double balanceLeft;
        System.out.println("Outstanding debt: " + NumberFormat.getCurrencyInstance().format(amountToBePaid));
        if(amountToBePaid == 0){
            System.out.println("You have no outstanding debt.");
        }
        else {
            System.out.print("How much do you want to pay: ");
            payment = scanner.nextDouble();
            if(getBalance() > amountToBePaid){
                if(payment <= amountToBePaid) {
                    balanceLeft = amountToBePaid - payment;
                    amountToBePaid = balanceLeft;
                    System.out.println("You have successfully paid:" + NumberFormat.getCurrencyInstance().format(payment));
                    System.out.println("Your current outstanding debt: " + NumberFormat.getCurrencyInstance().format(amountToBePaid));
                }
                else System.out.println("You entered an amount more than what what you owe. \nCheck your outstanding debt and try again...");

            }  else System.out.println("Insufficient balance.Top up your wallet and try again.");


        }

    }
}
