public class DiagonalStar {

    public static void main(String[] args){
      printSquareStar(4);
    }

    public static void printSquareStar(int number){
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        int row  = number;
        int col = number;
        for (row = number; row >= 1; row --){  // row 5, col 5,4,3,2,1--- row 4 col 5,4,3,2,1.....
            for(col = number; col >= 1; col --){
                if (row == 1 || col == 1 || row == number || col == number || row == col || col == number - row + 1) {
                    System.out.print("*");                
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // after each row is completed go to next line
        }
    }
}