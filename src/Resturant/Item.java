package Resturant;


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
