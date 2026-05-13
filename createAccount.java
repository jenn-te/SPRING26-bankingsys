//anthony
import java.util.Scanner;
import java.util.ArrayList;
public class createAccount {
    public static void run(ArrayList<Account> accounts) { 
        Scanner input = new Scanner(System.in);
       input.nextLine(); 
       System.out.print("Enter customer name: "); 
       String name = input.nextLine(); 

 
       System.out.print("Enter account number: "); 
       int accNum = input.nextInt(); 

 
      System.out.print("Enter starting balance: "); 
       double balance = input.nextDouble(); 

        // need to create account class 
       Account newAccount = new Account(name, accNum, balance); 

       // Adding account to ArrayList 

       accounts.add(newAccount);  

       System.out.println("Account created successfully."); 

   } 
}
