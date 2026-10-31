package Bai2.Bai2_9;

public class TestMain {
    public static void main(String[] args) {
        // Test constructor with coordinates
        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        System.out.println(t1);
        System.out.println("Perimeter: " + t1.getPerimeter());
        t1.printType();

        // Test constructor with MyPoint instances
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);
        MyPoint p3 = new MyPoint(7, 2);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);
        System.out.println(t2);
        System.out.println("Perimeter: " + t2.getPerimeter());
        t2.printType();
    }
}