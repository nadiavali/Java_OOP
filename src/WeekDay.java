public class WeekDay {
    public static void main(String[] args){
        printDayofWeek(2);
    }
    public static void printDayofWeek(int day){
        switch (day) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            default -> System.out.println("Invalid Day");

    }
    
}
}
