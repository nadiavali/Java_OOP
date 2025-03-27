public class positiveNegativeNull {
        // write code here
        public static void checkNumber(int number){
           
            String res = (number > 0) ? "positive": (number < 0) ? "negative": "zero";
            System.out.println(res);
            
        }
}

