package tb_composition_room;

public class Room {
    private Ceiling ceiling;
    private Furniture furniture;
    private Lights lights;
    private Floor floor;
    private Walls walls;

    public Room(Ceiling ceiling, Furniture furniture, Lights lights, Floor floor, Walls walls) {
        this.ceiling = ceiling;
        this.furniture = furniture;
        this.lights = lights;
        this.floor = floor;
        this.walls = walls;
    }

    public void cleanRoom() {
        furniture.cleanFurniture();
        floor.cleanFloor();
    }

    public void airRoom() {
        walls.getWindowInRoom().openWindowsInTheRoom();
    }

    public boolean protectRoom() {
        walls.getWindowInRoom().closeWindowsInTheRoom();
        return walls.lockDoor();
    }

    public void enterRoom() {
        walls.unlockDoor();
        ceiling.turnTheChandalierOn();
    }

    public void closeRoom() {
        walls.getWindowInRoom().closeWindowsInTheRoom();
        if(protectRoom()) {
            walls.unlockDoor();
        }
        lights.lightsOff();
        walls.lockDoor();
    }

    public void showRoom() {
        lights.lightsOn();
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public Lights getLights() {
        return lights;
    }

    public Floor getFloor() {
        return floor;
    }

    public Walls getWalls() {
        return walls;
    }
}
