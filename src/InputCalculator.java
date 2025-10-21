import java.util.Scanner;
public class InputCalculator {

    public static void main(String[] args){
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int counter  = 0;
        while (true) {
            System.out.println("Enter a number: \n ");
            try {
                String number = scanner.nextLine();
                int validNumber = Integer.parseInt(number);
                counter ++;
                sum += validNumber;
                avg = (int) Math.round((double)sum / counter);

            } catch (NumberFormatException e) {
                
                break;
            }
        }
        System.out.println("SUM = " + sum + " " + "AVG = " + avg);
        scanner.close();
    }
}

