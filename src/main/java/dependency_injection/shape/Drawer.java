package dependency_injection.shape;

public class Drawer {
    public void processDrawing(){
        Figure figure;

        figure = new Circle();
        figure.draw();

        figure = new Triangle();
        figure.draw();
    }
}
