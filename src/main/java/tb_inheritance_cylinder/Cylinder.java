package tb_inheritance_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if(height > 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }


}
