package Resturant;

//import java.util.Scanner;

public class Meal {
    private Burger burger;
    private Item drink;
    private Item side;

    public Meal() {
        this("regular", "coke", "fries");
    }

  public Meal(String burgerType, String drinkType, String sideType) {
    this.burger = new Burger(burgerType, 4.0);
    this.drink = new Item(drinkType, "drink", 1.0);
    this.side = new Item(sideType, "side", 1.50);
  }  

  public double getTotalPrice() {
    return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
  }

  public void printItemizedList() {
    burger.printItem();
    drink.printItem();
    side.printItem();
    System.out.println("-".repeat(30));
    Item.printItem("Total Price", getTotalPrice());

  }

  public void addBurgerToppings(String extra1, String extra2, String extra3) {
    burger.addedTopping(extra1, extra2, extra3);
  }

  public void setDrinkSize(String size) {
    drink.setSize(size);
  }
}


class Item {
    private String name;
    protected String type;
    protected double price;
    protected String size = "MEDIUM";

    public Item () {}
            
        public Item(String name, String type, double price ) {
            this.name = name.toLowerCase();
            this.type = type.toLowerCase();
            this.price = price;
    
        }

        public String getName() {
            if (type.equals("Side") || type.equals("Drink")) return size + " " + name;
            return name;
        }
        public double getBasePrice() {
            return this.price;
        }
        // public double getAdjustedPrice(double adjustedPrice) {
        //     return this.price += adjustedPrice;
        // }
        public double getAdjustedPrice() {
           return switch (size) {
            case "SMALL" -> getBasePrice() - 0.50;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
           };
        }


       

        public void setSize(String size) {
            this.size = size;
        }

        public static void printItem(String name, double price) { // can be called from anywhere
            System.out.printf("%20s: %6.2f%n" ,name, price);
        }

        public void printItem() {
            printItem(getName(), getAdjustedPrice());
        }

    }

// class Drink extends Item{
        
        
//     public Drink(String type, String size, double price) {
//          super(size, type, price, size);
//     }

//      public void drinkPrice() {
//          Scanner s = new Scanner(System.in);
//          System.out.println("what is the size of the Drink? (L for Large, M for Medium and S for Small)");
//          String choice  = s.nextLine();
//          switch (choice.toUpperCase().charAt(0)) {
//              case 'L':
//                  this.size = "L";
//                  this.price = 10;
//              break;
//          case 'M':
//              this.size = "M";
//              this.price = 7;
//              break;
//          case 'S':
//              this.size = "S";
//              this.price = 5;
//              break;
//          default:
//              System.out.println("Invalid size selected. Defaulting to small...");
//              this.size = "S";
//              this.price = 5;
//              break;
//          }
//         System.out.println("Price of your drink order is: " + this.price + "$");
//     }
    
// }
    
class Burger extends Item {
    private boolean extraTopping = false;
    private Item extraItem1;
    private Item extraItem2;
    private Item extraItem3;

    public Burger(String name, double price) {
        super(name, "Burger", price);
        
    }

    
    public Burger() {}


    
  

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() + ((extraItem1 == null) ? 0 : extraItem1.getAdjustedPrice()) +
                                ((extraItem2 == null) ? 0 : extraItem2.getAdjustedPrice()) +
                                ((extraItem3 == null) ? 0 : extraItem3.getAdjustedPrice());
    } 



    @Override
    public String getName() {
        return super.getName() + " Burger";
    }



    public double toppingPrice(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "AVOCADO", "CHEESE" -> 1;
            case "HAM", "SALAMI" -> 1.5;
            case "VEGETERIAN PARMASCHINKEN" -> 2;
            default -> 0.0;
        };
    }

    public void addedTopping(String ex1, String ex2, String ex3) {
            this.extraItem1 = new Item(ex1, "Topping", toppingPrice(ex1));
            this.extraItem2 = new Item(ex2, "Topping", toppingPrice(ex2));
            this.extraItem3= new Item(ex3, "Topping", toppingPrice(ex3));
        }
    
    public void printItemisedList() {
        printItem("Base Burger", getBasePrice());
        if(extraItem1 != null) extraItem1.printItem();
        if(extraItem2 != null) extraItem2.printItem();
        if(extraItem3 != null) extraItem3.printItem();
    }


    @Override
    public void printItem() {
        printItemisedList();
        System.out.println("-".repeat(30));
        super.printItem();

    }

    



        
//         Scanner s = new Scanner(System.in);
//         System.out.println("Would you like extra topping?(Y for yes, N for No)");
//         String toppingChoice = s.nextLine();
//         switch (toppingChoice.toUpperCase()) {
//             case 'Y':
//             System.out.println("What would you like to order? (K for Ketchup,  M for Mayo ");
//             String choice  = s.nextLine();
//             switch (choice) {
//                 case "K" -> 0.5;
//                 case "M" -> 1;
            
//                 default:
//                     break;
//             };

        
//             default:
//                 break;
//         }
        
        
//         switch (choice.toUpperCase().charAt(0)) {
//             case 'M':
//                 this.type ="Mashroom Burger";
//                 this.price = 20;
//             break;
//         case 'K':
//             this.type = "Cheese Burger";
//             this.price = 25;
//             break;
//         case 'C':
//             this.type = "Classic Burger";
//             this.price = 17;
//             break;
//         default:
//             System.out.println("Invalid order selected. Defaulting to classic burger...");
//             this.type = "Classic Burger";
//             this.price = 17;
//             break;
//     }
//     System.out.println("What would you like to order extra topping? (Y for yes, N for No.");
//     String  toppingChoice  = s.nextLine();
//     switch (toppingChoice.toUpperCase().charAt(0)) {
//         case 'Y':
//             this.extraTopping = true;
//             this.price += 3;
//             break;
//         case 'N':
//             this.extraTopping = false;
//             break;
//         default:
//             System.out.println("Invalid order selected. Detaulting to no extra topping...");
//             this.extraTopping = false;
//             s.close();
//             break;
//     }
//     System.out.println("Price of your Your Burger order is: " + this.price + "$");
// }

 
}











// class RegularMeal extends Meal {
//     public RegularMeal() {
//         super(null, null);
//     }
  
    
// }

// class DeluxBurger extends Burger {

 
    

//     public DeluxBurger(String name, String type, double price, String size, int p) {
//         super(name, type, price, size);

//     }


//     @Override
//     public void addedTopping() {
//         super.addedTopping();
//         System.out.println("You can choose two extra topping (5 toppings) but You can still oredr more...");
      

//     }

   


