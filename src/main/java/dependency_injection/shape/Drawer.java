package dependency_injection.shape;

public class Drawer {
    public void processDrawing(){
        Shape shape;

        shape = new Circle();
        shape.draw();

        shape = new Triangle();
        shape.draw();
    }
}
