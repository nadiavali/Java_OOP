public class BarkingDog {
    // write code here
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        //return barking && ((hourOfDay > 22 || hourOfDay < 8 ) && (hourOfDay >= 0 && hourOfDay <= 23))? true:false;
        return barking && (hourOfDay >= 0 && hourOfDay <= 23) && (hourOfDay < 8 || hourOfDay > 22);
    }

    public static void main(String[] args) {
        System.err.println(shouldWakeUp(true, 23));
    }
}