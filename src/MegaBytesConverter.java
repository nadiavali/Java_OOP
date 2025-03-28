public class MegaBytesConverter {
    // write code here
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
       int mb = kiloBytes / 1024;
       int kb = kiloBytes %  1024;
       System.out.println((kiloBytes < 0) ? "Invalid Value" : kiloBytes + " KB = " + mb + " MB and " + kb+ " KB");
    }
    public static void main (String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
}

