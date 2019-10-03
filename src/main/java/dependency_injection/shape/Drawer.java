package dependency_injection.shape;

public class Drawer {
    final Shape shape;

    public Drawer(final Shape shape) {
        this.shape = shape;
    }

    public String processDrawing(){
        return shape.draw();
    }
}
