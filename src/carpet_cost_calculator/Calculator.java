package carpet_cost_calculator;

public class Calculator {
    Floor floor;
    Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
       }
    public double getTotalCost() {          // returns the calculated total cost to cover the floor
        return floor.getArea() * carpet.getCost();

    }

}
