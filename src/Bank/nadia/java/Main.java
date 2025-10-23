package Bank.nadia.java;

public class Main {
  
    public static void main(String[] args) {
        Bank bank = new Bank();
        //Bank bank = new Bank(123445, 12488388399.0, "Nadia Vali", "nadiavali@gmail.com", "491736735563");
        
        System.out.println(bank.getEmail());
        System.out.println(bank.getAccoutBalance());
        
        bank.depositingFund(9.5);
        bank.withdrawingFund(3.99);
        bank.withdrawingFund(105.52);
        bank.setEmail("nadia.com");
        System.out.println(bank.getEmail());
        System.out.println("");
        Bank someBank = new Bank("someemail", "some number");
        System.out.println(someBank.getAccountNumber() + " " + someBank.getEmail() + " " + someBank + someBank.getCustomerName());


    }
}
