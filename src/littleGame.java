 public class littleGame {
    public static void main(String[] args) {

       
        int lowScore = littleGame.finalScoreCalculator(true, 9, 8, 7);
        int highScore =  finalScoreCalculator(true, 200, 10000, 8);
        System.out.println(lowScore);
        System.out.println(highScore);
     
    }
   
    /**
     * @param gameOver
     * @param bonus
     * @param score
     * @param levelCompleted
     * @return
     */
    public static int finalScoreCalculator(boolean gameOver,int bonus,int score,int levelCompleted) {
        
        int finalScore = score;

        if (gameOver) {
            
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        
        return finalScore;
    }
 }

 