package Resturant;

import java.util.Scanner;

public class Meal {

}

class Drink {
    private String type;
    private String size;
    private double price;

    public Drink(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public void drinkPrice() {
        Scanner s = new Scanner(System.in);
        System.out.println("what is the size of the Drink? (L for Large, M for Medium and S for Small)");
        String choice  = s.nextLine();
        switch (choice.toUpperCase().charAt(0)) {
            case 'L':
                price = 20;
                break;
            case 'M':
                price = 10;
                break;
            case 'S':
                price = 5;
                break;
            default:
                System.out.println("Invalid size selected.");
                s.close();
                return;
        }
        System.out.println("Price of your drink order is: " + this.price);
    
    }
    
}

