package Resturant;

public class DeluxeBurger extends Burger{
    Item deluxe1;
    Item deluxe2;


    public DeluxeBurger(String name, double price) {
        super(name, price);
    }
   
    public void addedTopping(String ex1, String ex2, String ex3, String ex4, String ex5) { // overload insted of override
        super.addedTopping(ex1, ex2, ex3);
        deluxe1 = new Item(ex4, "Topping", 0);
        deluxe2 = new Item(ex5, "Topping", 0);
    }
    @Override
    public void printItemisedList() {
        super.printItemisedList();
        if (deluxe1 != null) deluxe1.printItem();
        if (deluxe2 != null) deluxe2.printItem();
    }
    @Override
    public double toppingPrice(String toppingName) {
        
        return 0;
    }
    

}
