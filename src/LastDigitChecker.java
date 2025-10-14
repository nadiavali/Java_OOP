public class LastDigitChecker{
    public static void main(String[] args){
        System.out.println(hasSameLastDigit(9,99,999));
    }
    public static boolean hasSameLastDigit(int number1, int number2, int number3){
        if (number1 < 10 || number2 < 10 ||  number3 < 10 || number1 > 1000 || number2 > 1000 || number3 > 1000) {
            return false;
        }
        int n1 = number1 % 10;
        int n2 = number2 % 10;
        int n3 = number3 % 10;
        
          
        return (n1 == n2 || n1 == n3 || n2 == n3 );
    }
    public static boolean isValid(int number){
        if (number < 10 || number > 1000) {
            return false;
        }
        return true;
    }

}