public class PerfectNumber {

    public static void main(String[] args){
        System.out.println(isPerfectNumber(28));
    }
    public static boolean isPerfectNumber(int number){
        if (number < 1) {
            return false;
        }
        
        int n = 1;
        int sum = 0;
        while (n < number) {
            if (number % n == 0) {
                sum += n;
            }
            n++;
        }
        return sum == number;
    }
}