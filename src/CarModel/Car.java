package CarModel;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car() {}

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    } 

    public String startEngine() {
        return "Car -> startEngine()";
    }
    public String accelerate() {
       return "Car -> accelerate()";
    }
    public String brake() {
       return "Car -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    
}
class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

   

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        // TODO Auto-generated method stub
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        // TODO Auto-generated method stub
         return getClass().getSimpleName() + " -> brakeEngine()";
    }

    @Override
    public String startEngine() {
        // TODO Auto-generated method stub
         return getClass().getSimpleName() + " -> startEngine()";
            

    }
  
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

   @Override
    public String accelerate() {
        // TODO Auto-generated method stub
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        // TODO Auto-generated method stub
         return getClass().getSimpleName() + " -> brakeEngine()";
    }

    @Override
    public String startEngine() {
        // TODO Auto-generated method stub
         return getClass().getSimpleName() + " -> startEngine()";
        
    }
    
}
