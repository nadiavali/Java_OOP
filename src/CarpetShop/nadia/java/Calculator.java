package CarpetShop.nadia.java;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator() {
        //Wall w = new Wall();  // uses no-args constructor
        // w.setWidth(5);
        //w.setHeight(10);

    }
    
    public Calculator(Floor floor, Carpet carpet) {

       
        //Wall w = new Wall(5, 10); set walues immediately
        //Sometimes you don’t know the values yet → use the empty one.
        //Sometimes you already know → use the one with parameters.
        // public Wall(){
            //this.width = width;
            //  this.height = height;

        this.floor = floor;
        this.carpet = carpet;
    }
    
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
        
}
