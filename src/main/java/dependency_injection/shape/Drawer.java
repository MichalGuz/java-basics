package dependency_injection.shape;

public class Drawer {
    public void processDrawing(){
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        circle.draw();
        triangle.draw();
    }
}
