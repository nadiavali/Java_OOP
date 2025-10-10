public class DigitSum {

    public static void main(String[] args){
        //System.err.println(SumDigits(-1234));
        System.out.println(sumDigitsTeacherSolutions(3));
    }
   
    public static int SumDigits(int digit){
        int sum = 0; 
        int remain = 0;
        if(digit < 0){
            return -1;
        }else{
            while (digit/10 != 0){
                remain = digit % 10;
                digit = digit / 10;
                sum += remain;
           

        }
        if (digit/10 == 0){
            sum += digit;
        }
      
      return sum;
 
    }
    }
    public static int sumDigitsTeacherSolutions(int number){
        if (number<0) {
            return -1;

        }
        int sum = 0;
        while (number > 9) {
            sum += (number%10);
            number = number / 10;
        }
        sum += number;
        return sum;
    }
}

