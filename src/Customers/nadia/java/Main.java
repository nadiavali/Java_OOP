package Customers.nadia.java;

public class Main {
    public static void main(String[] args){
        StoreCustomer nadiaCustomer = new StoreCustomer("Nadia", 222.33, "nadia.com");
   

        System.out.println(nadiaCustomer.getCreditLimit());
        System.out.println(nadiaCustomer.getEmial());
        System.out.println(nadiaCustomer.getName());


        StoreCustomer CemCustomer = new StoreCustomer();

        System.out.println(CemCustomer.getCreditLimit());
        System.out.println(CemCustomer.getEmial());
        System.out.println(CemCustomer.getName());

        StoreCustomer JoeCustomer = new StoreCustomer("Joe", "Joe.com");

        System.out.println(JoeCustomer.getCreditLimit());
        System.out.println(JoeCustomer.getEmial());
        System.out.println(JoeCustomer.getName());

    }
}
