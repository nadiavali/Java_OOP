import java.util.Scanner;

public class SumValidNumber {
    
    public static void main(String[] args) {

        int count = 1;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);

        do{
           
            System.out.println("Enter number #" + count  + ":");
            String nextNumber = scanner.nextLine(); // get the data from cansole as a string

            try {
          
                double number = Double.parseDouble(nextNumber);
                count ++;
                sum += number;
            } catch (NumberFormatException e) {
                System.err.println("Invalid Number");
            }

        }   while (count <= 5);
            System.out.println(sum);
            scanner.close();
    }
    
}
