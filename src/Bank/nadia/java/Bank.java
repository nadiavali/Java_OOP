package Bank.nadia.java;

public class Bank {

    private int accountNumber;
    private int accoutBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void depositingFund(int deposit) {
        accoutBalance += deposit;
        System.out.println("Deposit of : " + deposit + " Make the balance of: " + accoutBalance);
    }
    public void withdrawingFund(int withdraw) {
        if (accoutBalance - withdraw < 0) System.out.println("This is not allowed, insufficient Funds!!");
        else System.out.println("You have now " + (accoutBalance -= withdraw));
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public int getAccoutBalance() {
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
