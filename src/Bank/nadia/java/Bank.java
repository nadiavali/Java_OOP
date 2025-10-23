package Bank.nadia.java;

public class Bank {

    private double accountNumber;
    private double accoutBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

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
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccoutBalance(int accoutBalance) {
        this.accoutBalance = accoutBalance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
}
