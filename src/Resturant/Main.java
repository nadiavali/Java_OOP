package Resturant;

public class Main {

    public static void main(String[] args) {
    
        // Item coke = new Item("Coke", "Drink", 5);
        // Item avocado = new Item("Avocado", "Topping", 2);

        // avocado.printItem();
        // avocado.setSize("LARGE");
        // avocado.getBasePrice();
        // avocado.printItem();

        // Burger burger = new Burger("Ham", 3);
        // burger.addedTopping("HAM","AVOCADO", "MAyo");
        // burger.printItem();
        // Meal regularMeal = new Meal();
        // regularMeal.addBurgerToppings("Mayo", "Ham", "Cheese");
        // regularMeal.setDrinkSize("Large");
        // regularMeal.printItemizedList();


        //Meal meal = new Meal("Turkey", "7-up", "Chili");
        Meal deluxe = new Meal("deluxe", "7-up", "Chili");
        deluxe.addBurgerToppings("ham", "Cheese", "Tomatoes", "avacado", "ham");
        deluxe.setDrinkSize("LARGE");
        deluxe.printItemizedList();
    }


}