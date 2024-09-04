# Bank Account Management System

This project aims to simulate a bank account management system. Users can open accounts, deposit and withdraw money, and view their account balances. Static classes and members will be used to manage and track account transactions.

### Detailed Descriptions of the `Account` and `Bank` Class Members:

**Account Class (static):**
This class will represent bank accounts and be used to perform account transactions.

- `private String accountNumber`: A private string that stores the account number.
- `private String owner`: A private string that stores the account owner's name.
- `private double balance`: A private decimal number that stores the account balance.

- `public Account(String accountNumber, String owner, double balance)`: Constructor method to create an account. It takes the account number, owner's name, and initial balance as parameters.
- `public void deposit(double amount)`: A method that deposits the specified amount into the account. It increases the account balance and displays the transaction.
- `public void withdraw(double amount)`: A method that withdraws the specified amount from the account. It checks for insufficient balance, reduces the balance, and displays the transaction.
- `public void viewBalance()`: A method that displays the account owner's name, account number, and balance.
- `public static List<Account> accounts`: A static list collection that stores all accounts.

**Bank Class (static):**
This class will be used to manage bank transactions and information.

- `public static List<String> transactionHistory`: A static list collection that tracks all account transactions. It records transactions with date and description.
- `public static void displayBankInfo()`: A static method that displays general information about the bank.
- `public static void trackTransaction(String description)`: A static method that adds a description to the `transactionHistory` list to track a transaction.

These details describe the members and functionalities of the `Account` and `Bank` classes. By using these members while creating the related classes, account transactions and bank management can be achieved.