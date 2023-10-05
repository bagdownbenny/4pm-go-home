package capstone;

import java.util.Scanner

public class BankingMain{

    public static void main[String[] args]{
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (true){
            
            System.out.println ( x:"1 -> Register Customer");
            System.out.println ( x:"2 -> Open Account");
            System.out.println ( x:"3 -> Close Account");
            System.out.println ( x:"4 -> Display Customer Details");
            System.out.println ( x:"5 -> Update Customer Details");
            System.out.println ( x:"6 -> Delete Customer");
            System.out.println ( x:"0 -> Exit")
            System.out.print ( s:"Enter your choice: ");

            choice = sc.nextInt();

            switch(int)
            {
                case 0 -> System.exit(status:0);
                /*case 1 -> {
                    System.out.println ( x:" Enter CustomerId : ");
                    int custID = sc.nextInt();
                    cObj = Customer.regCustomer (CustID);
                }
                case 2 -> 
                case 3 -> 
                case 4 -> 
                case 5 -> 
                case 6 -> */
                

            }
            
            
            
        }
    }

}
