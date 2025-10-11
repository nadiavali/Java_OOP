public class NumberPalindrome {
    public static void main(String[] args){
        System.out.println(isPalindorme(-1221));
    }
    public static boolean isPalindorme(int number){
        int parm = number;
        int abs_number = Math.abs(number);
        int reverse = 0;
    
        while ( abs_number> 0){
            int last_digit = abs_number % 10; 
            reverse = reverse * 10;
            reverse += last_digit;
            abs_number = abs_number/ 10;
        }
        return Math.abs(parm) == reverse;}
        
}