import java.util.ArrayList;
import java.util.List;

public class Account {
    static private String accountNumber;
    static private String owner;
    static private double balance = 0;
    static public List<Account> accounts = new ArrayList<>();
    public Account(String accountNumber, String owner, double balance){
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance += amount;
        viewBalance();
    }
    public void withdraw(double amount){
        if (this.balance - amount < 0){
            System.out.println("\nYour balance is insufficient.\n");
        }
        else {
            this.balance -= amount;
        }
        viewBalance();
    }
    public void viewBalance(){
        System.out.println("*".repeat(50));
        System.out.println("\nBalance: " + this.balance + "\n");
        System.out.println("*".repeat(50));
    }
}
