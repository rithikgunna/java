import java.util.ArrayList;
import java.util.List;

// Interface to represent a bank account
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

// Class representing a savings account that implements the Account interface
class SavingsAccount implements Account {
    private double balance;

    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// Class representing a checking account that implements the Account interface
class CheckingAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CheckingAccount(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or overdraft limit exceeded.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// Class representing a bank that manages a list of accounts
class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    // Add an account to the list
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Display account balances for all accounts
    public void displayAccountInfo() {
        for (Account account : accounts) {
            System.out.println("Account Balance: $" + account.getBalance());
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        // Create savings and checking accounts
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        CheckingAccount checkingAccount = new CheckingAccount(2000, 500);

        // Create a bank and add the accounts to it
        Bank bank = new Bank();
        bank.addAccount(savingsAccount);
        bank.addAccount(checkingAccount);

        // Display account balances
        bank.displayAccountInfo();

        // Perform deposit and withdrawal operations
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        checkingAccount.withdraw(3000);

        // Display updated account balances
        bank.displayAccountInfo();
    }
}
//Interfaces:

//The program starts by defining an Account interface that outlines three essential methods: deposit, withdraw, and getBalance. This interface serves as a contract for different types of bank accounts.
//Account Implementations:

//Two classes, SavingsAccount and CheckingAccount, implement the Account interface. Each class provides its own implementations for the deposit, withdraw, and getBalance methods.
//SavingsAccount allows deposits and withdrawals within the account balance.
//CheckingAccount allows overdrafts up to a specified limit, enabling limited negative balances.
//Bank Class:

//The Bank class is responsible for managing a list of accounts. It has methods to add accounts and display the account balances.
//Main Method (BankingSystem):

//In the main method of the BankingSystem class, instances of SavingsAccount and CheckingAccount are created with initial balances.
//A Bank object is also created, and the accounts are added to it.
//Displaying Account Balances:

//Initially, the program displays the account balances using the displayAccountInfo method.
//Performing Transactions:

//The program demonstrates deposit and withdrawal operations on the accounts. For example, it deposits and withdraws money from the SavingsAccount and attempts to withdraw more money than available from the CheckingAccount.
//Updated Balances:

//After the transactions, the program again calls displayAccountInfo to show the updated balances of the accounts.
//Output:

//Throughout the program, it provides feedback on the deposit and withdrawal operations, along with the current account balances.
//In summary, this program showcases a banking system with various account types (savings and checking), allows deposits and withdrawals, handles overdrafts for checking accounts, and provides a bank class to manage and display account information. The main method demonstrates the usage of these classes and their interactions.