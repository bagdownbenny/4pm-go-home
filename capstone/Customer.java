package day9;

public class Customer {
    
    private int custId;

    public Customer(int custId){
        this.custId = custId;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public static Customer regCustomer(int custId){
        Customer c1 = new Customer(custId);
        return c1;
    }

    public void openAccount() {
        System.out.println( "This method will assist in opening an account ");
    }
}
