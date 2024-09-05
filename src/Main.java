import java.util.Scanner;

public class Main {
    public static int choice;
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Account account1 = new Account("1", "Nurettin",85250);
        Account account2 = new Account("2", "Asli",56500);
        Account account3 = new Account("3", "Clara",24100);

        Account.accounts.add(account1);
        Account.accounts.add(account2);
        Account.accounts.add(account3);

        while(true){
            Menu1();
            switch (choice){
                case 1:
                    NewCreateAccount();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("\nInvalid entry. Please try again.");
                    break;
            }
        }
    }
    public static void Menu1(){
        System.out.println("\n\n1- Create an account.");
        System.out.println("2- Log in to your account.");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
    }
    
}