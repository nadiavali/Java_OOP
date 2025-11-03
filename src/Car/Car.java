package Car;

public class Car {

    private String description;

    public Car() {}

    public Car(String description) {
        this.description = description;
    }


    public void startEngine() {
        System.out.println("Car --> start the engine...");
    }
    protected void runEngine() {
        System.out.println("Car --> runs engine");
        }

    public void drive() {
        System.out.println(this.description + " Car --> is type of " + getClass().getSimpleName());
        runEngine();
    }

  
}


class GassPowerCar extends Car {
    private double avgKmPerLitre;
    private int cylinders = 6;

    public GassPowerCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("And has " + cylinders + " Cylinders");

    }

    @Override
    protected void runEngine() {
        super.runEngine();
         System.out.printf("Gas Car --> All %d cylineders are fired up!! %n", cylinders);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.printf("Gas Car is drivinfg %.2f per litere %n", avgKmPerLitre);
    }
    
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void drive() {
        // TODO Auto-generated method stub
        super.drive();
    }

    @Override
    protected void runEngine() {
        // TODO Auto-generated method stub
        super.runEngine();
    }

    @Override
    public void startEngine() {
        // TODO Auto-generated method stub
        super.startEngine();
    }

    
}

class HybridCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;
    private int cylinders;

   

    public HybridCar(String description, double avgKmPerCharge, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void drive() {
        // TODO Auto-generated method stub
        super.drive();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.printf("Hybrid Car --> All %d cylineders are fired up!! %n", cylinders);
        System.out.printf("Hybrid Car --> Switch %d kwh battery on. Ready!!%n", batterySize);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.printf(getClass().getSimpleName() + "--> usage below average %.2f", avgKmPerCharge);
    }
    



    
}