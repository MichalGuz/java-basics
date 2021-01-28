package tb_composition_room;

public class Doors {
    private int numberOfDoors;
    private double width;
    private double heigth;

    public Doors(int numberOfDoors, double width, double heigth) {
        this.numberOfDoors = numberOfDoors;
        this.width = width;
        this.heigth = heigth;
    }

    public boolean openTheDoor() {
        System.out.println("The door was opened");
        return false;
    }

    public boolean closeTheDoor() {
        System.out.println("The door was closed");
        return true;
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public double getWidth() {
        return width;
    }

    public double getHeigth() {
        return heigth;
    }
}
