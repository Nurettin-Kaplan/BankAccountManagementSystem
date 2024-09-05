import java.util.Scanner;
public class Main {
    public static int choice;
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("\nEnter your name: ");
        String name = input.nextLine();

        System.out.print("Enter a new account number: ");
        String number = input.nextLine();

        Account newAccount = new Account(number, name, 0);
        Account.accounts.add(newAccount);

        while(true){
            Menu();
            switch (choice){
                case 1:
                    newAccount.viewBalance();
                    break;
                case 2:
                    Deposit(newAccount);
                    break;
                case 3:
                    Withdraw(newAccount);
                    break;
                case 4:
                    Bank.displayBankInfo();
                    break;
                case 5:
                    ViewTransaction();
                    break;
                default:
                    System.out.println("\nInvalid entry. Please try again.");
                    break;
            }
        }
    }
    public static void Menu(){
        System.out.println("\n\n1- Balance Inquiry");
        System.out.println("2- Deposit Money");
        System.out.println("3- Withdraw Money");
        System.out.println("4- View bank information");
        System.out.println("5- View transaction history");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        input.nextLine();
    }
    public static void Deposit(Account account){
        System.out.print("\nEnter the amount you want to deposit: ");
        double deposit = input.nextDouble();
        input.nextLine();

        account.deposit(deposit);
        Bank.trackTransaction("The deposit transaction was completed successfully.");
    }
    public static void Withdraw(Account account){
        System.out.print("\nEnter the amount you want to withdraw: ");
        double withdraw = input.nextDouble();
        input.nextLine();

        account.withdraw(withdraw);
    }
    public static void ViewTransaction(){
        System.out.println("\n"+"*".repeat(50));
        for(String exp : Bank.transactionHistory){
            System.out.println("\n" + exp);
        }
        System.out.println("\n"+"*".repeat(50));
    }
}