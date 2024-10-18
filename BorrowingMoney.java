import java.text.NumberFormat;
import java.util.Objects;

public class BorrowingMoney extends AccountDetails{
    public BorrowingMoney(String accountNumber, double balance, String ownerName) {
        super(accountNumber, balance, ownerName);
    }

    //METHOD TO BORROW MONEY
    public static void borrowMoney(){
        byte yearsToPayLoan;
        double totalInterest;
        double interestRate = 0.1;
        double monthlyInstallment;
        byte monthsInYear = 12;
        String choice;
        System.out.print("Enter the amount you want to borrow: ");
        amountBorrowed = scanner.nextInt();

        System.out.print("How many years will it take you to repay the loan?: ");
        yearsToPayLoan = scanner.nextByte();
        if (yearsToPayLoan >0){
            System.out.print("The interest rate is 10% a year. Do you still want to continue(Yes or No)");
            choice = scanner.next();
            if(Objects.equals(choice, "Yes")){
                totalInterest = (amountBorrowed * interestRate) * yearsToPayLoan;
                amountToBePaid = totalInterest + amountBorrowed;
                monthlyInstallment = amountToBePaid / monthsInYear;
                System.out.println("Transaction Successful! \nYou have borrowed: " + NumberFormat.getCurrencyInstance().format(amountBorrowed) +"\n ");
                System.out.println("Total amount to be paid is: " + NumberFormat.getCurrencyInstance().format(amountToBePaid) + " for " + yearsToPayLoan + " years");
                System.out.println("To meet the payment deadline, you must pay " + NumberFormat.getCurrencyInstance().format(monthlyInstallment) +" every month" +" for the next "+ yearsToPayLoan +" years");

            } else System.out.println("Invalid Choice...Try again!");

        }
        else{
            System.out.println("Transaction Unsuccessful...");
        }
    }

}
