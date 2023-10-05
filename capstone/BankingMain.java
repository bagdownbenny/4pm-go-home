package capstone;

import java.util.Scanner;

public class BankingMain{

    public static void main[String[] args]{
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (true){
            
            System.out.println ("1 -> Register Customer");
            System.out.println ("2 -> Open Account");
            System.out.println ("3 -> Close Account");
            System.out.println ("4 -> Display Customer Details");
            System.out.println ("5 -> Update Customer Details");
            System.out.println ("6 -> Delete Customer");
            System.out.println ("0 -> Exit");
            System.out.print ("Enter your choice: ");
            System.out.println();

            choice = sc.nextInt();

            switch(choice){
                case 0 -> System.exit(0);
                case 1 -> {
                    System.out.println("Welcome to Register Customer Page");
                    System.out.println( " Enter Customer Id :: ");
                    int custId = sc.nextInt();
                    System.out.println( " Enter Customer Name :: ");
                    String custName = sc.next();
                    System.out.println( " Enter Customer Unique Identifier :: ");
                    String custUnique = sc.next();
                    System.out.println( " Enter Customer Email :: ");
                    String custEmail = sc.next();
                    System.out.println( " Enter Customer Phone Number :: ");
                    int phoneNo = sc.nextInt();
                    cObj = Customer.regCustomer(custId, custName, custUnique, custEmail, phoneNo);
                }
                case 2 -> //Open Account
                case 3 -> //Close Account
                case 4 -> //Display 
                case 5 -> 
                case 6 -> 
                

            }
            
            
            
        }
    }

}
