package dependency_injection.message.shape;

public class Drawer {
    public void processDrawing(){
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        circle.draw();
        triangle.draw();
    }
}
