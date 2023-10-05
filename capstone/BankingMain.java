package capstone;

import java.util.Scanner;

public class BankingMain {
    public static void main(String[] args) {
        Customer cObj;
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while(true){

            System.out.println( "1 -> Register Customer");
            System.out.println( "6 -> Delete Customer");
            System.out.println( "0 -> Exit");
            System.out.print( " Enter your choice :: " );            
            choice = sc.nextInt();
            
            switch(choice){
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println( " Enter Customer Id :: ");
                    int custId = sc.nextInt();
                    cObj = Customer.regCustomer(custId);
                }
            }
        }
    }
}