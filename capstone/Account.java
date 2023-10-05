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
    protected double minBal = 500;

    
    // Getter and Setters
    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getMinBal() {
        return minBal;
    }

    public void setMinBal(double minBal) {
        this.minBal = minBal;
    }

    public SavingsAcc(int accNo, String custUnique, String branch) {
        super(accNo, custUnique, branch);
    }

    // Creating a new Savings Object
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
    protected boolean checkBookStatus = true;
    protected double odLimit = 0;
    protected double overFees = 0;

    public CheckingAcc(int accNo, String custUnique, String branch) {
        super(accNo, custUnique, branch);
    }
    
    // Creating a new Savings Object
    public static CheckingAcc createChecking(int accNo, String custUnique, String branch) {
        CheckingAcc cc1 = new CheckingAcc(accNo, custUnique, branch);
        return cc1;
    }

    @Override
    public double withdraw(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        return balance;
    }


}