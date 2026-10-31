package Bai2.Bai2_8;

public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    // Constructors
    public MyCircle() {
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // Getters and Setters for radius
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Getters and Setters for center MyPoint
    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    // Center coordinates delegation methods
    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public int[] getCenterXY() {
        return center.getXY();
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    // toString()
    public String toString() {
        return "MyCircle[radius=" + radius + ",center=" + center + "]";
    }

    // Geometry calculations
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Distance between the centers of this circle and another circle
    public double distance(MyCircle another) {
        return center.distance(another.center);
    }
}