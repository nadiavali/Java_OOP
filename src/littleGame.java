 public class littleGame {
    public static void main(String[] args) {

       
       
        isTooYoung(19);
        int score = finalScoreCalculator(true, 6, 90, 8);
        int highScorePosition = calculateHighScorePosition(score);
        displayHighScorePosition("Nadia", highScorePosition);
     
    }
   
  
    public static int finalScoreCalculator(boolean gameOver,int bonus,int score,int levelCompleted) {
        
        int finalScore = score;

        if (gameOver) {
            
            finalScore += (levelCompleted * bonus);
            finalScore += 100;
        }
        
        return finalScore;
    }

    public static void isTooYoung(int age) {
        if (age > 21) {
            return;
        } else {
            System.out.println("TOO YOUNG TO PLAY!");
        } 
        
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the highscore list.");
    }


    public static int calculateHighScorePosition(int score) {

        int position = 4; // Default position
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) { 
            position = 2;
        } else if (score >= 100) { 
            position = 3;
        }
        return position;
    }

}
 
 