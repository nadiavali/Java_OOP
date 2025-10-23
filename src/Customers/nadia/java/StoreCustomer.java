package Customers.nadia.java;

public class StoreCustomer {
    private String name; 
    private double creditLimit;
    private String email;

public StoreCustomer(String customerName, double creditLimit, String emailAdress){
    name = customerName;
    this.creditLimit = creditLimit;
    email = emailAdress;
}

public StoreCustomer(){
    this("Cem", "Cem.com");
}

public StoreCustomer(String email, String name) {
    this(name, 23.44, email);
}

    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmial() {
        return email;
    }

    
}
