public class SharedDigit {
    public static void main(String[] args){
        System.out.println(hasSharedDigit(100,10 ));
    
    }
    public static boolean  hasSharedDigit(int number1, int number2){
        if(10 <= number1 && 10 <= number2 && number2<=99 && number1 <=99){
           if (number1 % 10 == number2 % 10 || number1 % 10 == number2 / 10 || number1 / 10 == number2 % 10 || number1 / 10 == number2 / 10){
            return true;
           }else{
            return false;
           }
        }
        return false;
    }
}
