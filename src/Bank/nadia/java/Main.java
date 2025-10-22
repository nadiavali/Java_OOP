package Bank.nadia.java;

public class Main {
  
    public static void main(String[] args) {
        Bank bank = new Bank();
    
        bank.setAccoutBalance(98);
        bank.depositingFund(33);
        System.out.println("deposit" + bank.getAccoutBalance());
        bank.withdrawingFund(14);
        System.out.println("deposit" + bank.getAccoutBalance());

    }
}
