public class OverLoad {
    public static void main(String[] args){
        System.out.println("Inch to CM: " + convertToCentimeter(68)+ " Feet to CM: "+convertToCentimeter(5, 8));
    }
    public static double convertToCentimeter(int heightInches){
        //inch = 2.54 c
        return heightInches * 2.54;

    }
    public static double convertToCentimeter(int heightFeet,int heightInches){
       return convertToCentimeter((heightFeet * 12) + heightInches);
    }
    
}
