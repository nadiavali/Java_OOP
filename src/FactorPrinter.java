public class FactorPrinter{
    public static void main(String[] args){
        printFactors(24);

    }
    public static void printFactors(int number){
        if (number < 1){
            System.out.println("Invalid Value");
        }
        int n = 1;
    
        while (n <= number){
            if (number % n == 0){
                System.out.println(n);
            }
            n++;
        }
    }
}