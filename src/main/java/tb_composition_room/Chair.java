package tb_composition_room;

public class Chair extends FurnitureItem {
    public Chair(String name, double height, double width, double length, String color, String material) {
        super("chair", height, width, length, color, material);
    }

    public void moveChair() {
        System.out.println("chair was moved");
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
