package tb_composition_room;

public class Cupboard extends FurnitureItem {
    public Cupboard(double height, double width, double length, String color, String material) {
        super("cupboard", height, width, length, color, material);
    }

    public void openCupboard(){
        System.out.println("The cupboard was opened");
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
