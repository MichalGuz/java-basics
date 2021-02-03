package tb_constructors_various_practices;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // first x or y in returned formula is the parameter of method
    // second x or y in returned formula is a property of tb_constructors_various_practices.Point class
    public double distance(int x, int y){
        return Math.sqrt((x - x) * (x - x) + (y - y) * (y - y));
    }

    public double distance(Point point) {
        return Math.sqrt((point.getX() - x) * (point.getX() - x) + ((point.getY() - y) * (point.getY() - y)));
    }

    public double distance(){
        return Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0 - y));
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

    }
}
