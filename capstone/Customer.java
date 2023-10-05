package capstone;

public class Customer {
    
    private int custId;
    private String custName;
    private String custUnique;
    private String custEmail;
    private int phoneNo;

    //Constructor for Customer
    public Customer(int custId, String custName, String custUnqiue, String custEmail, int phoneNo){
        this.custId = custId;
        this.custName = custName;
        this.custUnique = custUnqiue;
        this.custEmail = custEmail;
        this.phoneNo = phoneNo;
    }

    //Getter and Setter for custId
    public int getCustId() {
        return custId;
    }
    public void setCustId(int custId) {
        this.custId = custId;
    }
    //Getter and Setter for custName
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }

    //Getter and Setter for custUnqiue
      public String getCustUnique() {
        return custUnique;
    }
    public void setCustUnique(String custUnique) {
        this.custUnique = custUnique;
    }

    //Getter and Setter for custEmail
    public String getCustEmail() {
        return custEmail;
    }
    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }
    //Getter and Setter for phoneNo
    public int getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    
    //Creating a new Customer Object
    public static Customer regCustomer(int custId, String custName, String custUnqiue, String custEmail, int phoneNo){
        Customer c1 = new Customer(custId, custName, custUnqiue, custEmail, phoneNo);
        return c1;
    }

    public void openAccount() {
        System.out.println( "This method will assist in opening an account ");
    }


}
