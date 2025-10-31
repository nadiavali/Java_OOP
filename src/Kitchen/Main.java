package Kitchen;

public class Main {

    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();
        // kitchen.getBrewMaster().setHasWorkToDo(true);
        // kitchen.getDishWasher().setHasWorkToDo(true);
        // kitchen.getIceBox().setHasWorkToDo(true);
        kitchen.setSmartKitchenState(true, true, true);
        kitchen.doKitchenWork();
        // kitchen.getDishWasher().doDishes();
        // kitchen.getBrewMaster().brewCoffe();
        // kitchen.getIceBox().orderFood();
    }
}