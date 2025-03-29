public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        return (float) Math.abs(num1 - num2) < 0.001;
    }
    public static void main(String[] args){
        System.err.println(areEqualByThreeDecimalPlaces(3.175, 3.174));
    }
}
