class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to account " + accountNumber);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("1234567890", 1000.0);
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);

        double balance = myAccount.getBalance();
        System.out.println("Account balance: " + balance);
    }
}
//This example demonstrates encapsulation by making the BankAccount attributes private and providing public methods to interact with the object's state. It also includes basic validation for deposit and withdrawal operations.