public class evenNumber {
    public static void main(String[] args){
        int number = 4 ; //he said we should put 5
        int countEven = 0;
        int countOdd = 0;
        while (number <= 20) {
            number ++;
            if (isEvenNumber(number) == true){ // another way: if(!isEvenNumber(number)){continue;}
                System.out.println("Even Number:" + number);
                countEven ++;
                if(countEven >= 5){
                    break;
                }

            }else{
                countOdd ++;
                System.out.println("Odd Number:" + number);
                
            }
           
        }
        System.out.println("number of even numbers: " + countEven);
        System.out.println("number of odd numbers: " + countOdd);
    }
    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }else{
            return false;
        }
      
    }
   
}