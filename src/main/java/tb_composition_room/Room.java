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
}
