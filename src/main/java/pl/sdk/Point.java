package pl.sdk;

public class Point {

    private int x;
    private int y;

    public Point(int aX, int aY) {
        x = aX;
        y = aY;
    }

    public Point(Point aPoint1) {
        this(aPoint1.x,aPoint1.y);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Point(x,y);
    }

    public int getX() {
        return x;
    }

    public void setX(int aX) {
        x = aX;
    }

    public int getY() {
        return y;
    }

    public void setY(int aY) {
        x = aY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getDistanceToCenter() {
        return Math.sqrt(x * x + y * y);
    }
}
