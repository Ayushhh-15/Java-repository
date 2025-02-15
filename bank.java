class BankAccount {
    private double balance; // Private variable

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Protected method to withdraw money
    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
        }
    }

    // Default access method to check balance
    void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        // Accessing public method
        account.deposit(500.0);

        // Accessing protected method (allowed within the same class)
        account.withdraw(300.0);

        // Accessing default method
        account.checkBalance();
    }
}
