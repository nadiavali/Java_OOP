import java.util.Scanner;

public class MinMaxNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = 0;
        double max = 0; 
        int loopCount = 0;

        while (true){
        System.out.println("Enter a number");
        String number = scanner.nextLine();
        try {
            double validNumber = Double.parseDouble(number);
            // loopCount == 0 : we at the beggining set the first number to both min and max and from the iteration number one
            // we compare the number to min and max (same number) and decide to either store it in max or min, change the min or max at all

            if(loopCount == 0 || validNumber < min){
                min = validNumber;
            }
            if (loopCount == 0 || validNumber > max){
                max = validNumber;
            }
            loopCount ++;
        } catch (NumberFormatException e) {
            break;
        }
    }
    if (loopCount == 0) {
        System.out.println("Try with valid numbers!");
    }
    else{
        System.err.println("This loop repeated: " + loopCount);
        System.out.println("That's the min " + min);
        System.out.println("That's the max " + max);
    }
}
}