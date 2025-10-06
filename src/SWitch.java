public class SWitch {
    public static void main(String[] args){
//         int value = 1;
//         if (value == 1) {
//             System.out.println("Value1");
//         } else if (value == 2) {
//             System.out.println("Value2");
//         } else  {
//             System.out.println("Value neither 1 nor 2");
// }
        String month = "april";
        System.out.println(getQuarter(month));
        int switchValue = 7;
        switch(switchValue){
            case 1 ->  System.out.println("Value1");
            case 2,3,4 -> System.out.println("Value"+ switchValue);
            default -> System.out.println("was not 1, 2, 3, 4");

        }
    }

    public static String getQuarter(String month) { // return comes before switch
        return switch (month) {
            case "January", "Feburary", "March" -> {yield "First";}
            case "April", "May", "June" -> "Second";
            case "July", "August", "September" -> "Third";
            case "October", " November", "December" -> "Fourth";
        
            //default -> "Bad Request";
            default -> {
                String badResponse = month + " is bad.";
                yield badResponse;
            }
        };

    }
}
