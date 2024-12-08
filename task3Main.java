import java.util.*;

public class task3Main {
    public static void main(String[] args) {
        // Create a bank account with an initial balance
        BankAccount account = new BankAccount(1000.00); // Starting balance: 1000
        Scanner sc = new Scanner(System.in);

        // Create the ATM and pass the account to it
        ATM atm = new ATM(account);

        while (true) {
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Withdraw\n" +
                               "2. Deposit\n" +
                               "3. Check Balance\n" +
                               "4. Exit");
            System.out.print("Choose an option: ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.print("Enter amount to withdraw (in decimals): ");
                    double wd = sc.nextDouble();
                    atm.withdraw(wd);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit (in decimals): ");
                    double dp = sc.nextDouble();
                    atm.deposit(dp);
                    break;

                case 3:
                    System.out.println("Balance checking...");
                    atm.checkBalance();
                    break;

                case 4:
                    System.out.println("Exited. Thank you for using the ATM!");
                    sc.close(); // Close the scanner only when exiting the loop
                    return; // Exit the program

                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }
    }
}
