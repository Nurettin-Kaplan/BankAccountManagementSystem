import java.time.LocalDate;
import java.util.List;

public class Bank {
    public static List<String> transactionHistory;
    public static void displayBankInfo(){
        System.out.println("*".repeat(50));
        System.out.println("\n\nName: BJK BANK");
        System.out.println("Established: 2024");
        System.out.println("Services: Depositing money, withdrawing money, account opening");
        System.out.println("Contact: 0450 565 56\n\n");
        System.out.println("*".repeat(50));
    }
    public static void trackTransaction(String description){
        LocalDate date = LocalDate.now();
        transactionHistory.add(date + " " + description);
    }

}
