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

    public void openTheDoor() {
        System.out.println("The door was opened");
    }

    public void closeTheDoor() {
        System.out.println("The door was closed");
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
