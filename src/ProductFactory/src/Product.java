package ProductFactory.src;

class Product {

    private String model;
    private String manufacturer;
    private int height;
    private int depth;

    public Product() {}

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    
}

class Motherboard extends Product {

    private int ramSlots;
    private int cardSlots;
    private String bios;
    

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    } 

    public void loadProgram(String programName) {
        System.out.println("Proogram " + programName + " is now loading...");
    }
}



class Monitor extends Product {

    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    } 

    public void drawPixelAt(int x, int y, String colour) {
        System.out.println(String.format("Drawing pixel at %d,%d and in colour %s", x, y, colour));
    }
}

class ComputerCase extends Product {

    private String powerSupply;

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    } 

    public void pressPowerButton() {
        System.out.println("Power button pressed.");
    }
}