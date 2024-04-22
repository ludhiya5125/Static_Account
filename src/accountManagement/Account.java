package accountManagement;

public class Account
{
    private long accountNo;
    private String customerName;
    private double balance;
    private static int NumberOfAccounts=0;

    public Account(long accountNo, String customerName, double balance) {
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.balance = balance;
        NumberOfAccounts++;
    }

    public static int getNumberOfAccounts(){
        return NumberOfAccounts;
    }

    // Method to deposit money into the account
    public void deposit(double amount)
    {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }
    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }

    // Method to display account information
    public void display() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
