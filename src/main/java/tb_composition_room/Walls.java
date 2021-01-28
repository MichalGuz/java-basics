package tb_composition_room;

public class Walls {
    private double length;
    private double width;
    private double heigth;
    private double numberOfWalls;
    private String colour;
    private WindowInRoom windowInRoom;
    private Doors doors;

    public Walls(double length, double width, double heigth, double numberOfWalls, String colour, WindowInRoom windowInRoom, Doors doors) {
        this.length = length;
        this.width = width;
        this.heigth = heigth;
        this.numberOfWalls = numberOfWalls;
        this.colour = colour;
        this.windowInRoom = windowInRoom;
        this.doors = doors;
    }

    public void lockDoor(){
        System.out.println("The door are locked");
    }

    public void unlockDoor() {
        System.out.println("The door are unlocked");
    }


    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeigth() {
        return heigth;
    }

    public double getNumberOfWalls() {
        return numberOfWalls;
    }

    public String getColour() {
        return colour;
    }

    public WindowInRoom getWindowInRoom() {
        return windowInRoom;
    }

    public Doors getDoors() {
        return doors;
    }
}
