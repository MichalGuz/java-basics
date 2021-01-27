package tb_composition_room;

public class Table extends FurnitureItem{
    private int numberOfLegs;

    public Table(double height, double width, double length, String color, String material,  int numberOfLegs) {
        super("table", height, width, length, color, material);
        this.numberOfLegs = numberOfLegs;
    }

    public Table(String name, double height, double width, double length, String color, String material) {
        super(name, height, width, length, color, material);
    }

    public void coverTheTable() {
        System.out.println("Table was covered");
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getMaterial() {
        return super.getMaterial();
    }
}

