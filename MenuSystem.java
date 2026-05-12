import java.util.ArrayList;
import java.util.Scanner;
public class MenuSystem {
    static ArrayList<Account> accounts = new ArrayList<>();
    static Scanner input=new Scanner(System.in);

       public static void main(String[]args){
        

        int choice;
        
        do{
        System.out.println("\n===========================");
        System.out.println("     Banking System Menu");
        System.out.println("===========================");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
            choice=getValidChoice();
            switch(choice){
                case 1:
                    createAccount.run(accounts);
                    break;
                case 2:
                    depositMoney.run(accounts);
                    break;
                case 3:
                    withdrawMoney.run(accounts);
                    break;
                case 4:
                    checkBalance.run(accounts);
                    break;
                case 5:
                    System.out.println("Thank you for using the bank system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again. ");
                

            }
            
        }while(choice!=5);

    }

     
        
    

    public static int getValidChoice(){
        int choice=-1;

        while(true){
            if(input.hasNextInt()){
                choice=input.nextInt();

                if (choice>=1 && choice <=5){
                    return choice;
                }else{
                    System.out.println("Choice must be between 1-5. Try again");
                }
            }else{
                System.out.println("invalid input. Enter a number: ");
                input.next();
            }
            }
            

    }

}
