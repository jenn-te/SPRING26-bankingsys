import java.util.Scanner;
public class withdrawMoney {
    public static void run() {

    Scanner input = new Scanner(System.in);

    int amount = 0;
    //int balance = 1000; // testing
    int balance = checkBalance.getBalance(); 

    System.out.println("\nAvailable Balance: " + balance); // will change 'balance' variable  later
    
    System.out.println("Select amount to withdraw: \n1. $20\n2. $50\n3. $100\n4. Other\nSelect 0 to cancel.");

    int options = input.nextInt();
    switch(options){
        case 0:
        System.out.println("Returning to main menu...");
        return;
        case 1: 
        amount = 20;
        break;
        case 2: 
        amount = 50;
        break;
        case 3:
        amount = 100;
        break;
        case 4:
        System.out.println("Enter withdrawal amount: ");
        amount = input.nextInt();
        break;
        default:
            System.out.println("Invalid Option.");
            return;
    }
    

    if(amount <= 0) {
        System.out.println("Can't withdraw a negative amount.");
    } else if(amount > 500) {
        System.out.println("Amount can't exceed $500.");
    } else if(amount > balance) {
        System.out.println("Not enough funds.");
    } else { 
        System.out.println("Confirm withdrawal of $" + amount + "? \nY/N");
        String confirmation = input.next().toUpperCase();

        switch(confirmation) {
            case "Y":
                balance -= amount;
                System.out.println("New balance: " + balance);
                break;
            case "N":
                System.out.println("Withdrawal cancelled. Returning to main menu.");
                break;
            default:
                System.out.println("Invalid input. Please type Y or N");
                break;
        }
    }

}
}
