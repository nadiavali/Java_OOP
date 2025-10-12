public class FirstLastDigitSum {

    public static void main(String[] args){
        System.out.println(sumFirstAndLastDigit(569));
    }
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        
        int last_digit = number % 10;

        while (number >= 10){
            number = number / 10;
            System.out.println("number" + number);
        }
       
        return last_digit + number;
    }
}