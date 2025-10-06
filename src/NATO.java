public class NATO {
    public static void main(String[] args){
        System.out.println(natoAlphabet('C'));

    }
    public static String natoAlphabet(char letter){
        return switch (letter) {
            case 'A' -> "A is Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
                
                
        
            default -> "not found";
        };

    };
}
    
