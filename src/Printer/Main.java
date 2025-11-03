package Printer;

public class Main {

    public static void main(String[] args) {
        
        Printer brother = new Printer(50, false);
        System.out.println("initial page count = " + brother.getPagesPrinted());
        int pagesPrinted = brother.printPages(5);
        System.out.printf("Current job pages: %d, Printer total: %d %n", pagesPrinted, brother.getPagesPrinted());

        pagesPrinted = brother.printPages(10);
        System.out.printf("Current job pages: %d, Printer total: %d %n", pagesPrinted, brother.getPagesPrinted());
      
    
    }
}