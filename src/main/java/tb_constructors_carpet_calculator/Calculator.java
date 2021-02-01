package tb_constructors_carpet_calculator;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea()* carpet.getCost();
    }

    public static void main(String[] args) {
        Floor floor = new Floor(2.55, 5.42);
        Carpet carpet = new Carpet(3.5);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total cost = " + calculator.getTotalCost());
    }
}

