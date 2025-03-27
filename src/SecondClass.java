
public class SecondClass {
   
   public static void main(String[] var0) {
      System.out.print("Hi, babb");
      System.out.println("Hi, babb");
    
      
      System.out.println("Hi, babb");
      System.out.print("Hi, babb");

      System.err.println("....");

      boolean isAlien = true;
      if (isAlien == false) {// if ; the conditions get excluded
          System.out.println("They're not Alien..."); // no code block only the immdeiate code will be excuted
          System.out.println(" And I am Brave...");
      }
      int topScore = 90;
      if (topScore == 100) {
          System.err.println("You got the highest top score! ");
      }


      int secondTopScore = 80;
      if (secondTopScore < topScore && topScore < 100) {
        System.out.println("Greater than top score and less than 100..");
      }


      if (topScore > 90 || secondTopScore <= 90) {
          System.out.println("either or both of the conditions are true");
      }

      boolean isCar = false;
      if (isCar = true) { // be carefull 
        System.out.println("This should not be printed!");
      }


      boolean isMe = true;
      if (isMe) { // isMe == true

        System.out.println("coud be true or false");
      }  
      
      if (!isMe) { //not is me NOT operator

        System.out.println("well!");
      }  
      String car = "Volkswagen";
      boolean isDomestic = car == "Volkswagen" ? false : true;
      if (isDomestic) {
        System.out.println("This car is domestic to our country!");
      }

      int ageOfClient = 20;
      String ageText = (ageOfClient >=18) ? "above 18." : "still a kid.";
      System.out.println("Our client is " + ageText);

      double a = 20.0;
      double b = 80.0;
      double total = (a + b) * 100;
      double theReminder = total % 40.0;
      boolean noReminder = (theReminder==0)? true:false;
      System.out.println(noReminder);
      if (theReminder != 0) { // if !boo
        System.out.println("got some reminder!!!");
      }
      

   }


} 
    
 
