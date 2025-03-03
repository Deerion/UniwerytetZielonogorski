package lab5_p;

class Rectangle {
    public int width = 0;
    public int height = 0;
    Point origin;

    public Rectangle() {
        origin = new Point(0, 0);
    }

    public Rectangle(Point p) {
        origin = p;
    }

    public Rectangle(int w, int h) {
        this(new Point(0, 0), w, h);
    }

    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    public int area() {
        return width * height;
    }
}
class Point {
    public int x = 0;
    public int y = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Zad_04 {
    public static void main(String[] args) {

        Rectangle myRect = new Rectangle(40, 50);
        System.out.println("Obszar prostokąta: " + myRect.area());
    }
}


