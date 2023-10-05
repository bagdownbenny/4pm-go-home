package capstone;

public class Account {
    int accNo;
    String custUnique;
    String [] transactions;
    double balance = 0;

    public Account (int accNo, String custUnique, String[] transactions, double balance) {
        this.accNo = accNo;
        this.custUnique = custUnique;
        this.transactions = transactions;
        this.balance = balance;
    }

    
}


class SavingsAcc extends Account {
    double interest = 0;

    public SavingsAcc(int accNo, String custUnique, String[] transactions, double balance, double interest) {
        super(accNo, custUnique, transactions, balance);
        this.interest = interest;
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