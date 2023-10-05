package capstone;

public class Account {
    int accNo;
    String custUnique;
    String [] transactions;
    double balance = 0;

    public Account (int accNo, String custUnique) {
        this.accNo = accNo;
        this.custUnique = custUnique;
    }
}


class SavingsAcc extends Account {
    double interest = 0;

    public SavingsAcc(int accNo, String custUnique) {
        super(accNo, custUnique);
    }

       //Creating a new Customer Object
    public static Customer createSavings(int accNo, String custUnique){
        Customer c1 = new SavingsAcc(accNo, custUnqiue);
        return c1;
    }

}


class CheckingAcc extends Account{
    double oveLimit = 0;
    double overFees = 0;

    public CheckingAcc(int accNo, String custUnique, String[] transactions, double balance, double oveLimit,
            double overFees) {
        super(accNo, custUnique, transactions, balance);
        this.oveLimit = oveLimit;
        this.overFees = overFees;
    }

}