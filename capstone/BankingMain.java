package capstone;

import java.util.Scanner;

public class BankingMain{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        Customer cObj; 
        SavingsAcc sAcc;
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
                case 0 -> 
                    System.exit(0);
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
                case 2 -> {//Open Account
                    System.out.println("<<<< Open Account >>>>");
                    System.out.println("What type of account would you like to open?");
                    System.out.println("1 -> Savings Account");
                    System.out.println("2 -> Current Account");
                    int type = sc.nextInt();
                    if (type == 1){
                        sAcc = Customer.SavingsAcc(int accNo, String custUnique, String[] transactions, double balance, double interest);
                    }
                    if (type == 2){
                        sAcc = Customer.CurrentAcc(int accNo, String custUnique, String[] transactions, double balance, double interest);
                    }
                    System.out.println("Congratulations! Your account has been successfully created");
                    break;
                }
                case 3 -> {//Close Account
                    System.out.println("<<<< Close Account >>>>");
                    break;
                }

                case 4 -> {//Display Customer Details
                    System.out.println("<<<< Display Customer Details >>>>");
                    System.out.println(" Please enter your customer ID: ");


                    break;
                }
                case 5 -> //Update Customer Details
                System.out.println("<<<< Update Customer Details >>>>");
                case 6 -> //Delete Customer 
                System.out.println(" <<<< Delete Customer & Details >>>>");

            }
            
            
            
        }
    }

}
