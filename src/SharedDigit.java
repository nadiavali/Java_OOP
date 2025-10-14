public class SharedDigit {
    public static void main(String[] args){
        System.out.println(hasSharedDigit(24,34 ));
    
    }
    public static boolean  hasSharedDigit(int number1, int number2){
        if (number1 < 10 || number2 < 10 || number2 > 99 || number1 > 99) {
            return false;
        }
        int n1 = number1 / 10, n2 = number1 % 10;
        int n3 = number2 / 10, n4 = number2 % 10;
        
          
        return (n1 == n3 || n1 == n4 || n2 == n3 || n2 == n4);
           
    }
}

