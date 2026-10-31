package Bai2.Bai2_9;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    // Constructors
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    // toString() method
    public String toString() {
        return "MyTriangle[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + "]";
    }

    // Calculates the perimeter by summing the distances between vertices
    public double getPerimeter() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);
        return side1 + side2 + side3;
    }

    // Determines and prints the triangle type (Equilateral, Isosceles, or Scalene)
    public void printType() {
        double s1 = v1.distance(v2);
        double s2 = v2.distance(v3);
        double s3 = v3.distance(v1);

        double tol = 1e-4; // Tolerance for floating-point comparison
        boolean eq12 = Math.abs(s1 - s2) < tol;
        boolean eq23 = Math.abs(s2 - s3) < tol;
        boolean eq31 = Math.abs(s3 - s1) < tol;

        if (eq12 && eq23) {
            System.out.println("Equilateral");
        } else if (eq12 || eq23 || eq31) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}