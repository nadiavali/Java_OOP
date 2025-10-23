package claculator.nadia.java;

public class Main {
    public static void main(String[] args){
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(0.0);
        calculator.setSecondNumber(1.25);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
