package arrayLearning;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

class Main {

    public static void main(String[] args) {
          System.out.println(Arrays.toString(getRandomArray(10)));
          Arrays.sort(getRandomArray(10));
          System.out.println(Arrays.toString(getRandomArray(10)));



          String[] sArray = {"Anna", "Nadia", "James", "Martin", "Hermes"};
          Arrays.sort(sArray);
          System.out.println(Arrays.toString(sArray));
          if(Arrays.binarySearch(sArray, "Nadia") >= 0) System.out.println("Nadia is in list.");

        int[] s1 = {1, 2, 3, 4, 6};


        int[] s2 = getRandomArray(100);//2, 4, 6, 7, 9
        Arrays.sort(s2);
        int[] s3 = new int[5];
        int n = s3.length;
        for ( int i = 0 ; i < n; i++) {
            int rightIndex = i;
            int leftIndex = (n - 1) - i;
            
            s3[rightIndex] = s2[leftIndex];
            
        }
        System.out.println("Decendeing Order of Array: " + Arrays.toString(s3));
        

        if (Arrays.equals(s1, s2)) System.out.println("The arrays are equal");
        else System.out.println("They are not equal");
        

    }

    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}