//michael
import java.util.ArrayList;
import java.util.Scanner;

public class checkBalance {

    public static void run(ArrayList<Account> accounts) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int accNum = input.nextInt();

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccNum() == accNum) {
                System.out.println("Account holder: " + accounts.get(i).getName());
                System.out.println("Balance: $" + accounts.get(i).getBalance());
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public static double getBalance(int accNum) {
        return 0;
    }
}
