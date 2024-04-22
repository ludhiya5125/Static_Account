package accountManagement;

public class AccountManagement
{
    public static void main(String[] args)
    {
        Account acc1 = new Account(123456789, "Ludhiya Gurugari", 1000.0);
        Account acc2 = new Account(987654321, "Likitha", 2000.0);

        // Display the number of accounts created
        System.out.println("Number of accounts created: " + Account.getNumberOfAccounts());

        // Perform basic operations (deposit/withdraw)
        System.out.println("\nPerforming operations on Account 1:");
        acc1.display(); // Display account information before any operations
        acc1.deposit(500.0); // Deposit
        acc1.withdraw(200.0); // Withdraw
        acc1.display(); // Display updated account information

        System.out.println("\nPerforming operations on Account 2:");
        acc2.display(); // Display account information before any operations
        acc2.deposit(1000.0); // Deposit
        acc2.withdraw(500.0); // Withdraw
        acc2.display(); // Display updated account information
    }
}
