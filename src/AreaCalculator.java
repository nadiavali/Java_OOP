public class SeconMinuetes {

    public static void main(String[] args){
        System.out.println(getDurationString(3540));
        System.out.println(getDurationString(40,34));

    }
    public static String getDurationString(int seconds){

        return getDurationString(seconds/ 60, seconds% 60);
    }
    public static String getDurationString(int minutes, int seconds){
        //return seconds >= 59 ? (seconds / 3600+ "h " + ((seconds % 3600) / 60 + ) + "m " + seconds + "s" ): "Please enter the second in range 0 and 60";
        return seconds <= 59 ? minutes / 60 + "h " + minutes % 60 + "m " + seconds + "s ": "Please enter the second in range 0 and 590";
    }
}


public class AreaCalculator {
    public static double area(double radius){
        return radius >= 0? Math.PI * radius * radius: -1;
        }
    public static double area(double x, double y){
        return (x <= 0|| y <= 0) ? -1.00 : x * y;
        
    }
    
}