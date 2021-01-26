package tb_composition_room;

public class Sofa extends FurnitureItem {
    public Sofa(String name, double height, double width, double length, String color, String material) {
        super("sofa", height, width, length, color, material);
    }

    public void openSofa () {
        System.out.println("Sofa was opened");
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
