package ProductFactory.src;

class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor monitor = new Monitor("27 inch Beast", "Acer", 27, "2540 x 1440");
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer pc = new PersonalComputer("2208", "Dell", monitor, motherboard, theCase);
        // pc.getMonitor().drawPixelAt(10, 10, "Pink");
        // pc.getComputerCase().pressPowerButton();
        // pc.getMotherboard().loadProgram("Adobe");

        pc.powerUp();
       
    }
}