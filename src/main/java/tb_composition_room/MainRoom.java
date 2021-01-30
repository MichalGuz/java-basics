package tb_composition_room;

public class MainRoom {
    public static void main(String[] args) {
        Walls walls = new Walls(10.5, 4.75, 2.75, 4, "yellow", new WindowInRoom(2, 2.6, 2.0), new Doors(1,0.8, 2.2));

        Chandelier chandelier = new Chandelier("modern", "gold", 6, "led", 1.1, 0.80);
        Ceiling ceiling = new Ceiling(4.75, 10.5, "white", chandelier);
    }
}
