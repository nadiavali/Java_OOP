public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(24,32));
    }
    
    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }

        int n = 1;
        int greatestDivisor = 1;
        int min;

        if (first < second) {
            min = first;
        } else {
            min = second;
        }
        

        while(n <= min) {
            if (first % n == 0 && second % n == 0){
                greatestDivisor = n;    
            }
            n++;
    
        }
     
        return greatestDivisor;
       
        
    }
}