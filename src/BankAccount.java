package src;
import java.util.*;

public class BankAccount {
    // Properties
    final private String name;
    final private String accountNumber;
    private float balance;
    private List<String> transactions = new ArrayList<>();
    private boolean isClosed = false;
    private Date creationDate;
    private Date closingDate;

    // Constructor - get name and accountNumber
    public BankAccount(String name) {
        this.name = name;
        this.accountNumber = UUID.randomUUID().toString();
        this.balance = 0;
    }
    
    public BankAccount(String name, float balance) {
        this.name = name;
        this.accountNumber = UUID.randomUUID().toString();
        this.balance = balance;
    }

    // Methods
    public String getName() {
        return this.name;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }
    public float getBalance() {
        return this.balance;
    }
    public List<String> getTransactions() {
        return this.transactions;
    }
    public void setIsClosed() {
        this.isClosed = !isClosed;
    }

    public void deposit(float amount) {
        if (amount < 0 || isClosed) {
            throw new IllegalArgumentException();
        }
            
        this.balance += amount;
        this.transactions.add("Deposited " + amount + " at " + DateTimeMethod.getDateTime());
    }

    public void withdraw(float amount) {
        if (amount < 0 || isClosed || amount > this.balance) {
            throw new IllegalArgumentException();
        }

        this.balance -= amount;
        this.transactions.add("Withdrawn " + amount + " at " + DateTimeMethod.getDateTime());
    }


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Andy", 5000);
        BankAccount account2 = new BankAccount("Angel");

        account1.deposit(500);
        // account2.withdraw(30);
        account2.deposit(500);
        System.out.println(account2.balance);
    }
}