package capstone;

import java.time.LocalDate;

public abstract class Account {
    protected int accNo;
    protected String custUnique;
    protected String[] transactions = {};
    protected double balance = 0;
    protected LocalDate openDate = LocalDate.now();
    protected String branch;

    public Account(int accNo, String custUnique, String branch) {
        setAccNo(accNo);
        setCustUnique(custUnique);
        setBranch(branch);
    }

    // Getters and Setters
    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getCustUnique() {
        return custUnique;
    }

    public void setCustUnique(String custUnique) {
        this.custUnique = custUnique;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public void setTransactions(String[] transactions) {
        this.transactions = transactions;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        return balance;
    }

    // abstract method for superclass
    public abstract double withdraw(double amount);

}

class SavingsAcc extends Account {
    protected double interest = 0;
    protected double minBal;

    public SavingsAcc(int accNo, String custUnique, String branch) {
        super(accNo, custUnique, branch);
        // add interest and minBal
    }

    // Creating a new Customer Object
    public static SavingsAcc createSavings(int accNo, String custUnique, String branch) {
        SavingsAcc s1 = new SavingsAcc(accNo, custUnique, branch);
        return s1;
    }

    @Override
    public double withdraw(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        return balance;
    }

}

class CheckingAcc extends Account {
    protected boolean checkBookStatus;
    protected double odLimit = 0;
    protected double overFees = 0;

    public CheckingAcc(int accNo, String custUnique, String[] transactions, double balance, double oveLimit,
            double overFees) {
        super(accNo, custUnique, transactions, balance);
        this.oveLimit = oveLimit;
        this.overFees = overFees;
    }


    @Override
    public double withdraw(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        return balance;
    }


}