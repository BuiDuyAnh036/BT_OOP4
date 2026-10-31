package Bai2.Bai2_8;

public class TestMain {
    public static void main(String[] args) {
        // Test constructors and toString()
        MyCircle c1 = new MyCircle();
        System.out.println(c1);

        MyCircle c2 = new MyCircle(3, 4, 5);
        System.out.println(c2);

        MyPoint p1 = new MyPoint(6, 8);
        MyCircle c3 = new MyCircle(p1, 10);
        System.out.println(c3);

        // Test Getters/Setters
        c1.setRadius(2);
        c1.setCenterXY(1, 1);
        System.out.println("c1 new center: " + c1.getCenter());
        System.out.println("c1 radius: " + c1.getRadius());

        // Test Area, Circumference, and Distance
        System.out.printf("c2 area: %.2f%n", c2.getArea());
        System.out.printf("c2 circumference: %.2f%n", c2.getCircumference());
        System.out.printf("Distance between c2 and c3: %.2f%n", c2.distance(c3));
    }
}