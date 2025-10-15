public class LargestPrime {
    public static void main(String[] args){
        System.out.println(getLargestPrime(217));
    }
    public static int getLargestPrime(int number){
        if (number < 2) {
            return -1;
        }
        int n = 2;
        int prime = 0;
        
        while(number > 1){
            if (number % n == 0){
                prime = n;
                number = number / n;
                
            } else {
                n++;
                
            }
            
        }
            return prime;
            
        }
        
}
    

