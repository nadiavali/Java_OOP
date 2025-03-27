 public class littleGame {
    public static void main(String[] args) {

        finalScoreCalculator(true, 100, 800, 5);
        finalScoreCalculator(true, 200, 10000, 8);
     
    }
   
    public static void finalScoreCalculator(boolean gameOver,int bonus,int score,int levelCompleted) {
        
        int finalScore = score;

        if (gameOver) {
            
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Youre final score was: " + finalScore);
        }
    
    }
 }