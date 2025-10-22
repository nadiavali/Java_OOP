package Autos.nadia.java;

public class Car {
    private String make;
    private String model = "X";
    private String colour = "red";
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        // validation and restriction
        if (make == null) make = "unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> this.make = "Unsupported";
        }

    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(colour + " " +
                           make + " " +
                           model + " " +
                           (convertible ? "Convertible" : ""));
    }
}
