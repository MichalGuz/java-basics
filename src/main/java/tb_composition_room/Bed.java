package tb_composition_room;

public class Bed extends FurnitureItem {
    public Bed(double height, double width, double length, String color, String material) {
        super("bed", height, width, length, color, material);
    }

    public void makeBed() {
        System.out.println("Bed was made");
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
