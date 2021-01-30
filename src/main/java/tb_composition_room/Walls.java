package tb_composition_room;

public class Walls {
    private double length;
    private double width;
    private double height;
    private double numberOfWalls;
    private String colour;
    private WindowInRoom windowInRoom;
    private Doors doors;

    public Walls(double length, double width, double height, double numberOfWalls, String colour, WindowInRoom windowInRoom, Doors doors) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.numberOfWalls = numberOfWalls;
        this.colour = colour;
        this.windowInRoom = windowInRoom;
        this.doors = doors;
    }

    public boolean lockDoor(){
        System.out.println("The door are locked");
        return doors.closeTheDoor();
    }

    public boolean unlockDoor() {
        System.out.println("The door are unlocked");
        return doors.openTheDoor();
    }


    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
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
