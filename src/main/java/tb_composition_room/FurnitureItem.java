package tb_composition_room;

public class FurnitureItem {
    private String name;
    private double height;
    private double width;
    private double length;
    private String color;
    private String material;

    public FurnitureItem(String name, double height, double width, double length, String color, String material) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.length = length;
        this.color = color;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

}
