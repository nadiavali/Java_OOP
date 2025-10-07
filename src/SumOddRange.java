public class SumOddRange {
    public static boolean isOdd(int number){
        if (number < 0){
            return false;
        }
       
        return number % 2 != 0;
        }
    public static int sumOdd(int start, int end){
        if (start < 0 || end < 0 || end < start){
            return -1;
        }
        int sum = 0;
        for(int number = start; number <= end ; number++){
            if (isOdd(number)){
                sum += number;}
                }
        
         return sum;
        
    } 
}
