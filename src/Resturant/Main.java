package Resturant;

import java.util.Scanner;
public class Main {
    private static String readLine(Scanner sc, String prompt) {
        System.out.println(prompt);
        String s = sc.nextLine().trim();
        while (s.isEmpty()) {
            System.out.println("Please enter something: ");
            s = sc.nextLine().trim();
        }
        return s;
    }

    private static boolean readYesNo(Scanner sc, String prompt) {
        System.out.print(prompt + " (y/n): ");
        while (true) {
            String s = sc.nextLine().trim().toLowerCase();
            if (s.equals("y") || s.equals("yes")) return true;
            if (s.equals("n") || s.equals("no")) return false;
            System.out.println("Please answer yes or no: ");
        }
    
    }
    private static String readSize(Scanner sc, String prompt) {
        System.out.print(prompt + " [S=SMALL / M=MEDIUM / L=LARGE]: ");
        while (true) {
            String s = sc.nextLine().trim().toUpperCase();
            if (s.equals("S") || s.equals("SMALL")) return "SMALL";
            if (s.equals("M") || s.equals("MEDIUM")) return "MEDIUM";
            if (s.equals("L") || s.equals("LARGE")) return "LARGE";
            System.out.print("Please type S, M, or L: ");
        }
    }

    private static String readTopping(Scanner sc, String prompt) {

        System.out.println(prompt + "(enter to skip): ");
        return sc.nextLine().trim();
    }




 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Welcome to Nadia's Console Restaurant ===");

        String burgerType = readLine(sc, "Choose burger type(regular/deluxe) : ");
        boolean isDeluxe = burgerType.equalsIgnoreCase("deluxe");
        String drinkName = readLine(sc, "Choose a drink (e.g., Coke, 7-up): ");
        String sideName  = readLine(sc, "Choose a side (e.g., Fries, Chili): ");

        Meal meal = new Meal(burgerType, drinkName, sideName);

        String size = readSize(sc, "Pick drink size");
        meal.setDrinkSize(size);

        if (isDeluxe) {
            System.out.println("\nAdd up to 5 toppings (press Enter to skip any):");
            String t1 = readTopping(sc, "HAM");
            String t2 = readTopping(sc, "SALAMI");
            String t3 = readTopping(sc, "VEGETERIAN PARMASCHINKEN");
            String t4 = readTopping(sc, "CHEESE");
            String t5 = readTopping(sc, "AVOCADO");
            if (t1.isEmpty()) t1 = "";
            if (t2.isEmpty()) t2 = "";
            if (t3.isEmpty()) t3 = "";
            if (t4.isEmpty()) t4 = "";
            if (t5.isEmpty()) t5 = "";
            meal.addBurgerToppings(t1, t2, t3, t4, t5);
        }
        else {
            String t1 = readTopping(sc, "HAM");
            String t2 = readTopping(sc, "SALAMI");
            String t3 = readTopping(sc, "VEGETERIAN PARMASCHINKEN");

            if (t1.isEmpty()) t1 = "";
            if (t2.isEmpty()) t2 = "";
            if (t3.isEmpty()) t3 = "";
            meal.addBurgerToppings(t1, t2, t3);
        }

        System.out.println("\n=== Your Order ===");
        meal.printItemizedList();
        boolean again = readYesNo(sc, "Would you like to place another order?");
        if (again) {
            System.out.println("Restart the program to place onother order. Thanks!");
        }
        else {
            System.out.println("Thanks for visting, have a good Time!");
        }
        sc.close();
    }







}