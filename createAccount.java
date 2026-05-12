public static void createAccount() { 
       input.nextLine(); 
       System.out.print("Enter customer name: "); 
       String name = input.nextLine(); 

 
       System.out.print("Enter account number: "); 
       int accNum = input.nextInt(); 

 
      System.out.print("Enter starting balance: "); 
       double balance = input.nextDouble(); 

 
       Account newAccount = new Account(name, accNum, balance); 

       // Adding account to ArrayList 

       accounts.add(newAccount);  

       System.out.println("Account created successfully."); 

   } 
