package Kitchen;

public class SmartKitchen {

    private CoffeMaker brewMaster;
    private DishWasher dishWasher;
    private Fridge iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeMaker();
        dishWasher = new DishWasher();
        iceBox = new Fridge();
    }    

    public CoffeMaker getBrewMaster() {
        return brewMaster;
    }




    public DishWasher getDishWasher() {
        return dishWasher;
    }




    public Fridge getIceBox() {
        return iceBox;
    }

    public void setSmartKitchenState(boolean coffeeFlag, boolean dishFlag, boolean Fridgeflag) {
        brewMaster.setHasWorkToDo(coffeeFlag);
        dishWasher.setHasWorkToDo(dishFlag);
        iceBox.setHasWorkToDo(Fridgeflag);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffe();
        dishWasher.doDishes();
        iceBox.orderFood();
    }  

}

class CoffeMaker  {

    private boolean hasWorkToDo;


    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffe() {
        if (hasWorkToDo) System.out.println("Brewing Coffe...");
        hasWorkToDo = false;
    }
}


class DishWasher {

    private boolean hasWorkToDo;
    
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    
    public void doDishes() {
        if (hasWorkToDo) System.out.println("Washing the dishes...");
        hasWorkToDo = false;
    }
}


class Fridge {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) System.out.println("Ordering food..");
        hasWorkToDo = false;
    }
}