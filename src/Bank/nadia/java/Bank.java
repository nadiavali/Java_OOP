package Bank.nadia.java;

public class Bank {

    private double accountNumber;
    private double accoutBalance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    @Override
    public String toString() {
        return "Bank [accountNumber=" + accountNumber + ", accoutBalance=" + accoutBalance + ", customerName="
                + customerName + ", customerEmail=" + customerEmail + ", phoneNumber=" + phoneNumber + "]";
    }

    public Bank(){
        // calling a constructor within another one (constructor chaining)
        // the very first line should be """THISSSSSS""""
        this(1234, 88899299399949994.99, "Nadia", "Default email", "default phone");
        System.out.println("constructor with This is called");
    }

    public Bank(double accountNumber, double accoutBalance, String customerName, String email, String phone){
        System.out.println("Bank constructor with parameters called");
        this.accountNumber = accountNumber;
        //setAccountNumber(accountNumber);
        this.accoutBalance = accoutBalance;
        this.customerName = customerName;
        customerEmail = email;
        phoneNumber = phone;
    }

    
    public Bank(String Email, String phone) {
        this(1111.2, 2222.2," Name" ,Email, phone);
        
    }

    public void depositingFund(double deposit) {
        accoutBalance += deposit;
        System.out.println("Deposit of: $" + deposit + " New Balance is: $" + accoutBalance);
    }
    public void withdrawingFund(double withdraw) {
        if (accoutBalance - withdraw < 0) System.out.println("This is not allowed, insufficient Funds!!");
        else System.out.println("withdrawal of: $" + withdraw + " Remaining balance of: $" + (accoutBalance -= withdraw));
    }
    public double getAccountNumber() {
        return accountNumber;
    }
    public double getAccoutBalance() {
        return accoutBalance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return customerEmail;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccoutBalance(double accoutBalance) {
        this.accoutBalance = accoutBalance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.customerEmail = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
}
