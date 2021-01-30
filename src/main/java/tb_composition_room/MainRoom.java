package tb_composition_room;

public class MainRoom {
    public static void main(String[] args) {
        Walls walls = new Walls(10.5, 4.75, 2.75, 4, "yellow", new WindowInRoom(2, 2.6, 2.0), new Doors(1,0.8, 2.2));

        Chandelier chandelier = new Chandelier("modern", "gold", 6, "led", 1.1, 0.80);
        Ceiling ceiling = new Ceiling(4.75, 10.5, "white", chandelier);

        Bed bed = new Bed(0.5, 2.1, 2.3,"osk", "wood");
        Cupboard cupboard =  new Cupboard(2.2, 2.0, 0.8,"oak", "wood");
        Table table = new Table(0.8, 1.3, 2.0,"oak", "wood", 4);
        Chair chair = new Chair(0.4, 0.4, 0.4,"oak", "wood");
        Sofa sofa = new Sofa(1.2, 1.3, 2.2,"ivory", "wood and artificial leather");
        Furniture furniture = new Furniture(bed,sofa, cupboard, table, chair);

        TableLamp tableLamp = new TableLamp("modern", "gold", 1, "led", 0.3, 0.5);
        FloorLamp floorLamp = new FloorLamp("modern", "gold", 1, "led", 0.3, 1.75);
        Lights lights = new Lights(chandelier, tableLamp, floorLamp, 1, 2 );

        Floor floor = new Floor(4.75, 10.5, "white artificial fur", new Hoover("Bosch", 5));
        Room room = new Room(ceiling, furniture, lights, floor, walls);

        room.enterRoom();
        room.airRoom();
        room.protectRoom();
        room.cleanRoom();
        room.showRoom();
        room.closeRoom();
    }
}
