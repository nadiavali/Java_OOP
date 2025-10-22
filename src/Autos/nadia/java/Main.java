package Autos.nadia.java;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        //car.describeCar();
        //car.setMake(null);
        System.out.println("make = " + car.getMake());
        car.setColour("blue");
        car.describeCar();
        
    }
}
