public class NumberTwoWords {

    public static void main(String[] args){
        System.out.println(getDigitCount(0));
        System.out.println(reverse(-123));
        numberToWords(123);
    }
    public static int getDigitCount(int number){
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while(number >= 0){
            number = number /10;
            count++;
        }
        return count;
    }
    
    public static int reverse(int number){
        int reversedNumber = 0;
        while (number > 0) {
            int remain = number % 10;
            reversedNumber = reversedNumber * 10;
            reversedNumber += remain;
            number = number / 10;
        }
        return reversedNumber;
    }
    public static void numberToWords(int number){
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int reversed = reverse(number);
        while (reversed > 0) {
            int digit = reversed % 10;
            switch (digit) {
                case 0 -> System.out.print("Zero ");
                case 1 -> System.out.print("One ");
                case 2 -> System.out.print("Two ");
                case 3 -> System.out.print("Three ");
                case 4 -> System.out.print("Four ");
                case 5 -> System.out.print("Five ");
                case 6 -> System.out.print("Six ");
                case 7 -> System.out.print("Seven ");
                case 8 -> System.out.print("Eight ");
                case 9 -> System.out.print("Nine ");
            }
            reversed /= 10;
        }
   
    }
}