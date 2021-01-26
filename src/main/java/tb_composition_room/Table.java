package tb_composition_room;

public class Table extends FurnitureItem{
    private int numberOfLegs;

    public Table(String name, double height, double width, double length, String color, String material,  int numberOfLegs) {
        super("table", height, width, length, color, material);
        this.numberOfLegs = numberOfLegs;
    }
}

