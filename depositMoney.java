//rafah
import java.util.Scanner;
import java.util.ArrayList;
public class depositMoney{
    public static void run(ArrayList<Account> accounts){
        Scanner input=new Scanner(System.in);

    System.out.println("Enter account number: ");
    int accNum = input.nextInt();


    boolean found = false;
    for (int i = 0; i < accounts.size() ; i++) { 
        if (accounts.get(i).getAccNum() == accNum) {
            found = true; 
        }
    }
    if(!found) {
        System.out.println("Account not found."); 
        return;
    }

        int amount=0;
        int balance=BankAccount.getBalance();
        System.out.println("\nCurrent Balance:  $"+balance);
        System.out.println("Select amount to deposit: ");
        System.out.println("1. $20");
        System.out.println("2. $50");
        System.out.println("3. $100");
        System.out.println("4. Other");
        System.out.println("Select 0 to cancel. ");
        int option=input.nextInt();
      switch (option) {
        case 0:
            System.out.println("Returning to main menu...");

            return;
        case 1:
            amount=20;
            break;
        case 2:
            amount=50;
            break;
        case 3:
            amount=100;
            break;
        case 4:
            System.out.println("Enter deposit amount: ");
            amount=input.nextInt();
            break;

      
        default:
            System.out.println("Invalid option");
            return;
      }
      if (amount<=0){
        System.out.println("Deposit an amount greater than 0. ");

      }else{
        System.out.println("Confirm deposit of $"+amount+"?");
        System.out.println("y/n");
        String confirmation=input.next().toUpperCase();
        switch(confirmation){
            case "Y":
                balance+=amount;
                BankAccount.setBalance(balance);
                System.out.println("$"+amount+"deposited successfully. ");
                break;
            case "N":
                System.out.println("deposit cancelled. ");
                break;
            default:
                System.out.println("invalid input. ");
                break;

        }
      }


    }
}
