class BankAccount {
    // Private fields
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0; // Initial balance is zero
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("123456", "Alice Smith");

        // Display account details
        account.displayAccountDetails();

        // Deposit money
        account.deposit(500);
        System.out.println("Current Balance: $" + account.checkBalance());

        // Withdraw money
        account.withdraw(200);
        System.out.println("Current Balance: $" + account.checkBalance());

        // Attempt to withdraw more than the balance
        account.withdraw(400); // Should show insufficient funds

        // Attempt to deposit a negative amount
        account.deposit(-100); // Should show error message

        // Final balance
        account.displayAccountDetails();
    }
}





