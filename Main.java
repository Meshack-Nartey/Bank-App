import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var account = new AccountDetails("40675647", 0, "Janet Doe");
        {
            boolean exit = false;
            while (!exit) {
                System.out.println("\nBANKING SYSTEM MENU");
                System.out.println("-------------------------");
                System.out.println("1. Display Savings Account Info");
                System.out.println("2. Deposit into Savings Account");
                System.out.println("3. Withdraw from Savings Account ");
                System.out.println("4. Transfer Money");
                System.out.println("5. Borrow Money");
                System.out.println("6. Repay Loan");
                System.out.println("7. Exit");
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        DisplayingAccountInfo.displayAccountInfo();
                        break;
                    case 2:
                        DepositingMoney.DepositMoney();
                        break;
                    case 3:
                        WithdrawingMoney.withdrawMoney();
                        break;

                    case 4:
                        TransferringMoney.transferMoney();
                        break;
                    case 5:
                       BorrowingMoney.borrowMoney();
                        break;
                    case 6:
                        RepayingMoney.repayLoan();
                        break;
                    case 7:
                        exit =true;
                        break;
                    default:
                        System.out.println("Invalid option, try again");


                }

            }


        }
        scanner.close();

        }
    }
